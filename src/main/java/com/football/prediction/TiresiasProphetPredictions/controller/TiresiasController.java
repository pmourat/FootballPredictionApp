package com.football.prediction.TiresiasProphetPredictions.controller;

import com.football.prediction.TiresiasProphetPredictions.service.FootballApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TiresiasController {

    private final FootballApiService footballApiService;

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @GetMapping(path = "/tiresias")
    public String getProphecy() {
        return "Tiresias says: You will be very happy today!";
    }

    @GetMapping(path = "/fixture")
    public String getFixtureByTeamId(@RequestParam("team") String team, @RequestParam("next") String next) {
        return footballApiService.getFixtureId(team, next);
    }
}