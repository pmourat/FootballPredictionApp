package com.football.prediction.TiresiasProphetPredictions.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.prediction.TiresiasProphetPredictions.exceptions.RapidApiException;
import com.football.prediction.TiresiasProphetPredictions.properties.RapidApiProperties;
import com.football.prediction.TiresiasProphetPredictions.dto.Fixture;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Collections;

/**
 * Service class that handles the communication with the RapidApi
 */
@Service
@RequiredArgsConstructor
public class FootballApiService {

    @Autowired
    RapidApiProperties rapidApiProperties;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public String getFixtureId(String teamId,String next) {
        RequestEntity<?> requestEntity = configureRequestEntity(teamId, next);

        String jsonResponse = restTemplate.exchange(requestEntity, String.class).getBody();

        try {
            Fixture fixture = objectMapper.readValue(jsonResponse, Fixture.class);
            if (fixture.getResults() == 0) {
                return "No fixtures found for team " + teamId;
            }
            return fixture.getFixtureId();
        } catch (HttpClientErrorException exc) {
            String errorMessage = exc.getResponseBodyAsString();
            throw new RapidApiException("RapidAPI request failed: " + errorMessage, exc);
        }
        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method that configures the request entity
     * @param teamId parameter indicating the team id
     * @param next parameter indicating if we want to query the next fixture
     * @return the request entity
     */
    private RequestEntity<?> configureRequestEntity(String teamId, String next) {
        String apiUrl = rapidApiProperties.getFixturesEndpoint() + "?team=" + teamId + "&next=" + next;

        HttpHeaders headers = new HttpHeaders();
        headers.set(rapidApiProperties.getApiKeyName(), rapidApiProperties.getApiKey());
        headers.set(rapidApiProperties.getHostName(), rapidApiProperties.getHost());
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        return RequestEntity.get(URI.create(apiUrl))
                .headers(headers)
                .build();
    }
}