package com.web.service.client;

import com.web.service.impl.IRemoteCompany;
import com.web.service.impl.RemoteCompanyService;

public class RemoteClient {
	public static void main(String[] args) {
		System.out.println("Hello1");
		RemoteCompanyService service = new RemoteCompanyService();

		IRemoteCompany company = service.getRemoteCompanyPort();

		System.out.println("------->>  Call Started");

		System.out.println(company.companyTernOver("ABC"));

		System.out.println("------->>  Call Ended");


	}

}
