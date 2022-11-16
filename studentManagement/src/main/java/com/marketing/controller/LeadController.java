package com.marketing.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lowagie.text.DocumentException;
import com.marketing.entities.Admission;
import com.marketing.pdf.PdfGenerate;
import com.marketing.pdf.UserPDFExporter;
import com.marketing.service.AdmissionInterface;
import com.marketing.util.EmailService;



@Controller
public class LeadController {
	
	 @Autowired
	  AdmissionInterface admissionInterface;
	 @Autowired
	 EmailService emailService;
	 @Autowired
	    private PdfGenerate service;
	@RequestMapping("/mainPage")
	public String viewCreateLeadPage() {
		return "MainPage";
	}
	
	@RequestMapping("/admission")
	public String admissionPage() {
		return "AdmissionPage";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@RequestParam("firstName") String firstName,
								@RequestParam("lastName") String lastName,
								@RequestParam("email") String email,
								@RequestParam("mobile") String mobile,
								@RequestParam("city") String city,
								@RequestParam("education") String education, Model model) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(city);
		System.out.println(education);
		Admission lead=new Admission();
		lead.setFirstName(firstName);
		lead.setLastName(lastName);
		lead.setMobile(mobile);
		lead.setEmail(email);
		lead.setEducation(education);
		lead.setCity(city);
		emailService.sendEmail(lead.getEmail(), "welcome to PSA", "Your DATA IS is SAVE");
		admissionInterface.saveData(lead);
		model.addAttribute("msg","Record is Save");
		return "AdmissionPage";
	}
	
	@RequestMapping("/adminLogin")
	public String loginAdmin() {
		return "LoginPage";
	}
	
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("userid") String userid,
							 @RequestParam("password") String password, Model model) {
		
		//admissionInterface.verifyId(userid, password);
		return "AdminPage";
	}
	@GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<Admission> listUsers = service.listAll();
         
        UserPDFExporter exporter = new UserPDFExporter(listUsers);
        exporter.export(response);
         
    }

}
