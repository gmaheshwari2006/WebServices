package com.web.service.publisher;

import javax.xml.ws.Endpoint;

import com.web.service.impl.RemoteCompany;

public class CompanyPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/web/service",
				new RemoteCompany());

	}

}
