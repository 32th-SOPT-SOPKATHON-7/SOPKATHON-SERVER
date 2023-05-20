package com.sopt.SopkathonServer.api.station.domain;

import com.sopt.SopkathonServer.common.domain.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Table(name = "stations")
@NoArgsConstructor(access = PROTECTED)
public class Station extends BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id ;

    @Column(nullable = false)
    private String line;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @Column
    private Double lat;

    @Column
    private Double lng;

    @Builder
    public Station(String line, String name, String code, Double lat, Double lng) {
        this.line = line;
        this.name = name;
        this.code = code;
        this.lat = lat;
        this.lng = lng;
    }
}
