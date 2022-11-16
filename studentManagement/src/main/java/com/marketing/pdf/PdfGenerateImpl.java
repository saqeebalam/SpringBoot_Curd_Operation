package com.marketing.pdf;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import com.marketing.entities.Admission;
import com.marketing.repository.AdmissionService;

@Service
@Transactional
public class PdfGenerateImpl implements PdfGenerate{

	@Autowired
	private AdmissionService admissionRepo;
	
	@Override
	public List<Admission> listAll() {
		return admissionRepo.findAll(Sort.by("firstName").ascending());
	}

}
