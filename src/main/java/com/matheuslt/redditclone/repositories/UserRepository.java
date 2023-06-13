package com.matheuslt.redditclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuslt.redditclone.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
