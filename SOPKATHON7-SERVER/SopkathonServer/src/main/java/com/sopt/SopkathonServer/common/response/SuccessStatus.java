package com.sopt.SopkathonServer.common.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import static lombok.AccessLevel.*;

@Getter
@RequiredArgsConstructor(access = PRIVATE)
public enum SuccessStatus {

    /**
     * station
     */
    GET_ALL_STATION_SUCCESS(HttpStatus.OK, "메인 지도 화면 조회 성공"),
    GET_ALL_POST_TREND_SUCCESS(HttpStatus.OK, "해당 지하철역 게시물 트렌드순 조회 성공")
    ;

    private final HttpStatus httpStatus;
    private final String message;
}
