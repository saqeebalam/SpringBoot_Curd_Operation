package com.marketing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Admission;
import com.marketing.repository.AdmissionService;

@Service
public class AdmissionInterfaceImpl implements AdmissionInterface{

	@Autowired
	AdmissionService admissionRepo;
	@Override
	public void saveData(Admission obj) {
		admissionRepo.save(obj);
	}
	@Override
	public void verifyId(String userid, String password) {
		
		
	}

}
