package com.marketing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminuserid")
public class AdminPassword {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="user_id", nullable = false, length = 45, unique = true)
	private String userid;
	
	@Column(name="password", nullable = false, length = 45, unique = true)
	private String password;

}
