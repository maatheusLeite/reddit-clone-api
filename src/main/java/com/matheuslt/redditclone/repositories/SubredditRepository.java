package com.matheuslt.redditclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.redditclone.models.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
