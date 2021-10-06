package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tom.Hello.HelloWorld;

public class JunitHelloWorld {
	
	@Test
	public void isHelloText() {
		System.out.println("Test");
		HelloWorld helloWorld = new HelloWorld();
		assertTrue("Hello failed.", helloWorld.toString().equals("Hello world!"));
	}
}
