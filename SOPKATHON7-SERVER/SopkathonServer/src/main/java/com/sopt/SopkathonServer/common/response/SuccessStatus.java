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
     * member
     */
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입 성공"),
    POST_CREATE_SUCCESS(HttpStatus.CREATED, "게시글 작성 성공"),
    COMMENT_CREATE_SUCCESS(HttpStatus.CREATED, "댓글 작성 성공")
    ;

    private final HttpStatus httpStatus;
    private final String message;
}
