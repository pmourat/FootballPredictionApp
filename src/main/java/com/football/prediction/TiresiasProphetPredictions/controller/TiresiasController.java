package com.football.prediction.TiresiasProphetPredictions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiresiasController {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @GetMapping(path = "/tiresias")
    public String getProphecy() {
        return "Tiresias says: You will be very happy today!";
    }
}
