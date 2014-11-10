package edu.cmu.capstone.polaris.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonView;

import edu.cmu.capstone.polaris.entity.*;
import edu.cmu.capstone.polaris.views.View;

@Path("/customers")
public class CustomerInquiry {
	
	private static GeneralInfoInquiryResponse test;
	
	static{
		test = new GeneralInfoInquiryResponse();
		Phone p = new Phone();
		p.setDialNumber("123");
		test.setPhoneList(new Phone[]{p});
		test.setResultCode("123");
		Address add = new Address();
		add.setAddressCity("Pittsburgh");
		test.setAddressList(new Address[]{add});
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getComplete() {
		return test;
	}

	@GET
	@Path("/{id}/phone")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonView(View.PhoneView.class)
	public GeneralInfoInquiryResponse getPhone() {
		return test;
	}

	@GET
	@Path("/{id}/address")
	@Produces(MediaType.APPLICATION_JSON)
	@JsonView(View.AddressView.class)
	public GeneralInfoInquiryResponse getAddress() {
		return test;
	}

	@GET
	@Path("/{id}/email")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneralInfoInquiryResponse getEmail() {
		return test;
	}

}