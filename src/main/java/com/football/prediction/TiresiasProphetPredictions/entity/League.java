package com.football.prediction.TiresiasProphetPredictions.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "league")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name = "name")
    private String name;
}
