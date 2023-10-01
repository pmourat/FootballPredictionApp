package com.football.prediction.TiresiasProphetPredictions.dto;

import com.football.prediction.TiresiasProphetPredictions.enums.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MatchDto implements Serializable {

    private UUID id;

    private UUID homeTeamId;

    private UUID awayTeamId;

    private LocalDateTime matchDate;

    private Integer result;

    private LocalDateTime dateUpdated;

}
