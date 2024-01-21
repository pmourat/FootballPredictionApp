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
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_home_team_id")
    private Team homeTeamId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_away_team_id")
    private Team awayTeamId;

    @Column(name = "result")
    private Result result;

    @Column(name = "match_date")
    private LocalDateTime matchDate;

    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;
}
