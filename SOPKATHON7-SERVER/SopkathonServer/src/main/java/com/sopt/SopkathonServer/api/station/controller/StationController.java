package com.sopt.SopkathonServer.api.station.controller;

import com.sopt.SopkathonServer.api.station.dto.StationListDto;
import com.sopt.SopkathonServer.api.station.service.StationService;
import com.sopt.SopkathonServer.common.dto.ApiResponseDto;
import com.sopt.SopkathonServer.common.response.SuccessStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor(access = PRIVATE)
@RequestMapping("/api/station")
public class StationController {

    private final StationService stationService;

    @GetMapping("/total")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto<StationListDto> getMain() {
        return ApiResponseDto.success(SuccessStatus.GET_ALL_STATION_SUCCESS, stationService.getMain());
    }
}
