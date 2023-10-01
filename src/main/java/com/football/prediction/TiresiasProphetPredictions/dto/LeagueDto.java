package com.football.prediction.TiresiasProphetPredictions.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class LeagueDto implements Serializable {

    private UUID id;

    private String name;

}
