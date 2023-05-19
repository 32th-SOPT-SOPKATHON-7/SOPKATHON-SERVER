package com.sopt.SopkathonServer.common.exception;

import com.sopt.SopkathonServer.common.response.ErrorStatus;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {
    private final ErrorStatus errorStatus;
}
