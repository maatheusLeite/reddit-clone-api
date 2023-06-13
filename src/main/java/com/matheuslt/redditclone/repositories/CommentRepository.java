package com.matheuslt.redditclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.redditclone.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
