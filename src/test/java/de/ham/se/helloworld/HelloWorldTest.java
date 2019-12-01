package de.ham.se.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test
	public void testGetText() {
		String textToCheck = HelloWorld.getText();
		
		assertEquals(textToCheck, "Hello World!");
	}
}
