package com.football.prediction.TiresiasProphetPredictions.dto;

import com.football.prediction.TiresiasProphetPredictions.enums.Subscription;
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
public class UserDto implements Serializable {
    private UUID id;

    private String firstName;

    private String surname;

    private String email;

    private Subscription subscription;

}
