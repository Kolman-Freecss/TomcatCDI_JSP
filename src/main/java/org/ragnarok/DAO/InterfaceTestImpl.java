package org.ragnarok.DAO;

public class InterfaceTestImpl implements InterfaceTest {

	@Override
	public String greet(final String name) {
		return "Hello: " + name;
	}

}
