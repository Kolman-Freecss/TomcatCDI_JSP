package org.ragnarok.service;

import javax.inject.Inject;

import org.ragnarok.DAO.InterfaceTest;

public class InjectHereService {

	@Inject
	private InterfaceTest interfaceTest;
	
	public String greetings(String name)
	{
		return this.interfaceTest.greet(name);
	}
	
}
