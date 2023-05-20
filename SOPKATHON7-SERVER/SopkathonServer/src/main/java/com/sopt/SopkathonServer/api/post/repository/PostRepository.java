package com.sopt.SopkathonServer.api.post.repository;

import com.sopt.SopkathonServer.api.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
