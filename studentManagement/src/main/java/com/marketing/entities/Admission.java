package com.marketing.entities;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="admissionDetails")//use this if class name and table name is diffrent
	public class Admission {



		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@Column(name="first_name", nullable = false, length = 45)
		private String firstName;
		
		@Column(name="last_name", nullable = false, length = 45)
		private String lastName;
		
		@Column(name="email", nullable = false, length = 45, unique = true)
		private String email;
		
		@Column(name="mobile", nullable = false, length = 10, unique = true)
		private String mobile;
		
		@Column(name="city",nullable = false,length = 45)
		private String city;
		
		@Column(name="education")
		private String education;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getEducation() {
			return education;
		}

		public void setEducation(String education) {
			this.education = education;
		}
		
		
	}




