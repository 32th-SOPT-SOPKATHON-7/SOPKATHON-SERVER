package com.sopt.SopkathonServer.api.station.dto;

import com.sopt.SopkathonServer.api.station.domain.Station;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class StationListDto {
    private HotPostDto hotPost;
    private List<StationDto> stations = new ArrayList<>();

    public static StationListDto of (HotPostDto hotPost, List<Station> stations) {
        List<StationDto> stationDtoList = new ArrayList<>();
        for (Station station : stations) {
            stationDtoList.add(StationDto.of(station.getName(), station.calTotalLikeCnt()));
        }
        return new StationListDto(hotPost, stationDtoList);
    }
}
