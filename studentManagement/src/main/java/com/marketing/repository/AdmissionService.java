package com.marketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing.entities.Admission;

public interface AdmissionService extends JpaRepository<Admission, Long> {

}
