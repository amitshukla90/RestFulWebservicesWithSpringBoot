package com.springboot.rest.RestWebservices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.rest.RestWebservices.Iservice.IMyRestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestWebservicesApplicationTests {

/*	@Autowired
	MockMvc  mockMvc;*/
	
	@Autowired
	IMyRestService iMyRestService;

	@Test
	public void sayHello() throws Exception {
		String reString = iMyRestService.sayHello();
		assertNotNull(reString);
		assertEquals("Hi this is Spring Boot Application", reString);
	}

/*	@Test
	public void sayHelloApi() throws Exception {
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		assertEquals("Hi this is SPring Boot Application", mvcResult.getResponse());
		
	}*/
}
