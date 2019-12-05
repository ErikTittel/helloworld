package de.ham.se.helloworld;

import de.ham.se.capitalizer.Capitalizer;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println(getText());
	}

	public static String getText() {
		Capitalizer c = new Capitalizer("Hello World!");
		return c.getCapitalizedText();
	}

}
