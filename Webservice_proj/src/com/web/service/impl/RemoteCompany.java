package com.web.service.impl;

import javax.jws.WebService;

import com.web.service.IRemoteCompany;

@WebService(endpointInterface = "com.web.service.IRemoteCompany")
public class RemoteCompany implements IRemoteCompany {

	@Override
	public int companyTernOver(String name) {
		if (name.equalsIgnoreCase("ABC")) {
			return 110000;
		}
		return 0;

	}

}
