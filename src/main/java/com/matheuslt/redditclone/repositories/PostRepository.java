package com.matheuslt.redditclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.redditclone.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
