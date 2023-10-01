package com.football.prediction.TiresiasProphetPredictions.dto;

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
public class UserAuthenticationDto implements Serializable {

    private UUID id;

    private UUID userId;

    private String username;

    private String password;

    private LocalDateTime dateCreated;

    private LocalDateTime dateUpdated;

}
