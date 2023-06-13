package com.matheuslt.redditclone.models;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_token")
public class VerificationToken implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tokenId;
	private String token;
	@OneToOne(fetch = FetchType.LAZY)
	private User user;
	private Instant expireMoment;
	
	public VerificationToken() {
	}

	public VerificationToken(Long tokenId, String token, User user, Instant expireMoment) {
		this.tokenId = tokenId;
		this.token = token;
		this.user = user;
		this.expireMoment = expireMoment;
	}

	public Long getTokenId() {
		return tokenId;
	}

	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Instant getExpireMoment() {
		return expireMoment;
	}

	public void setExpireMoment(Instant expireMoment) {
		this.expireMoment = expireMoment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tokenId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VerificationToken other = (VerificationToken) obj;
		return Objects.equals(tokenId, other.tokenId);
	}
}
