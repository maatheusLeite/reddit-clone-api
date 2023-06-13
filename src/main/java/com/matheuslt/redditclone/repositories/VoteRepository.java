package com.matheuslt.redditclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.redditclone.models.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
