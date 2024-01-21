package com.football.prediction.TiresiasProphetPredictions.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration regarding rapid api
 */
@ConfigurationProperties(prefix = "rapidapi")
@Configuration("rapidApiProperties")
@Data
public class RapidApiProperties {
    private String apiKey;
    private String host;
    private String apiKeyName;
    private String hostName;
    private String fixturesEndpoint;
}
