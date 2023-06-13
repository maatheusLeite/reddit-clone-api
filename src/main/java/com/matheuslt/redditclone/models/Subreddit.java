package com.matheuslt.redditclone.models;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_subreddit")
public class Subreddit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subredditId;
	@NotBlank(message = "Community name is required")
	private String subredditName;
	@NotBlank(message = "Description is required")
	private String description;
	@OneToMany(fetch = FetchType.LAZY)
	private List<Post> posts;
	private Instant generationMoment;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public Subreddit() {
	}

	public Subreddit(Long subredditId, @NotBlank(message = "Community name is required") String subredditName,
			@NotBlank(message = "Description is required") String description, List<Post> posts,
			Instant generationMoment, User user) {
		this.subredditId = subredditId;
		this.subredditName = subredditName;
		this.description = description;
		this.posts = posts;
		this.generationMoment = generationMoment;
		this.user = user;
	}

	public Long getSubredditId() {
		return subredditId;
	}

	public void setSubredditId(Long subredditId) {
		this.subredditId = subredditId;
	}

	public String getSubredditName() {
		return subredditName;
	}

	public void setSubredditName(String subredditName) {
		this.subredditName = subredditName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Instant getGenerationMoment() {
		return generationMoment;
	}

	public void setGenerationMoment(Instant generationMoment) {
		this.generationMoment = generationMoment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Subreddit(Long subredditId) {
		super();
		this.subredditId = subredditId;
	}
}
