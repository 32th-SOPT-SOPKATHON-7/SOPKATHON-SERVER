package com.sopt.SopkathonServer.api.comment.service;

import com.sopt.SopkathonServer.api.comment.domain.Comment;
import com.sopt.SopkathonServer.api.comment.dto.request.CommentRequestCreateDto;
import com.sopt.SopkathonServer.api.comment.dto.response.CommentResponseDto;
import com.sopt.SopkathonServer.api.comment.repository.CommentRepository;
import com.sopt.SopkathonServer.api.post.domain.Post;
import com.sopt.SopkathonServer.api.post.repository.PostRepository;
import com.sopt.SopkathonServer.api.station.domain.Station;
import com.sopt.SopkathonServer.common.exception.BusinessException;
import com.sopt.SopkathonServer.common.response.ErrorStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentResponseDto addComment(
            Long postId, CommentRequestCreateDto createDto
    ){
          Post parentPost = postRepository.findById(postId).orElseThrow(() -> new BusinessException(ErrorStatus.POST_NOT_FOUND));
          Comment saveComment = Comment.builder()
                  .post(parentPost)
                  .content(createDto.getContent())
                  .build();
        Comment addedComment = commentRepository.save(saveComment);
        return CommentResponseDto.of(
                addedComment.getId()
                , addedComment.getPost().getId()
                , addedComment.getContent()
                , addedComment.getCreatedAt()
                , addedComment.getUpdatedAt()
        );
    }
}
