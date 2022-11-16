package com.marketing.service;

import com.marketing.entities.Admission;

public interface AdmissionInterface {
	public void saveData(Admission obj);
	public void verifyId(String userid,String password);

}
