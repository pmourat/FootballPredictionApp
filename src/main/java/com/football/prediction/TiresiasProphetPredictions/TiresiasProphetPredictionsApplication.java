package com.football.prediction.TiresiasProphetPredictions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TiresiasProphetPredictionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiresiasProphetPredictionsApplication.class, args);
	}

}
