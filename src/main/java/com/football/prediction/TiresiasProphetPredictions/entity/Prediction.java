package com.football.prediction.TiresiasProphetPredictions.entity;

import com.football.prediction.TiresiasProphetPredictions.enums.Result;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prediction")
public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user_id")
    private User userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_match_id")
    private Match matchId;

    @Column(name = "predictedResult")
    private Result predictedResult;

    @Column(name = "success")
    private Boolean success;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;
}
