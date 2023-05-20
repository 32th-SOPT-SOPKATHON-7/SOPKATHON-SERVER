package com.sopt.SopkathonServer.api.post.repository;

import com.sopt.SopkathonServer.api.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByLikeCntDesc();
}
