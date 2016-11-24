package com.ebhun.ispace;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {
	
	private HelloWorld helloWorld = new HelloWorld();
	
	@Test
	public void sayHiTest(){
		Assert.assertEquals(Constants.hiReply, helloWorld.sayHiBye(Constants.hi));
	}
		

	@Test
	public void sayByeTest(){
		Assert.assertEquals(Constants.byeReply, helloWorld.sayHiBye(Constants.bye));
	}
	
	@Test
	public void invalidGreeting(){
		Assert.assertEquals(Constants.invalidString, helloWorld.sayHiBye(Constants.EMPTY));
	}
	
}
