package com.sopt.SopkathonServer.api.station.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class StationDto {
    private String stationName;
    private int totalLikeCnt;

    public static StationDto of (String stationName, Integer totalLikeCnt) {
        return new StationDto(stationName, totalLikeCnt.intValue());
    }
}
