package com.yimeicloud.study.jackjson;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Object2JsonTest {
	ObjectMapper mapper = new ObjectMapper();
	JsonFactory jsonFactory = new JsonFactory();
	
	@BeforeClass
	public static void beforeClass() {
	}
	
	@AfterClass
	public static void afterClass() {
	}
	
	@Before
	public void before() {
	}

	@After
	public void after() {
	}
	
	@Test
	public void object2Json() {
		Address address = new Address("China", "Shanghai", "Songjiang", "zeyuelu 325nong 20hao 1401");
		User user = new User("1", "Ming", address);
		User user2 = new User("2", "明", address);
		User user3 = new User("3", "Li", address);
		
		List<User> users = Arrays.asList(user, user2, user3);
		//List<User> users = new ArrayList<User>();
		try {
			// writeValueAsString
			System.out.println(mapper.writeValueAsString(user));
			
			// writeValue
			mapper.writeValue(new File("users.json"), users);
			
			// use JsonGenerator
			JsonGenerator jsonGenerator = jsonFactory.createGenerator(new File("json_generator.json"), JsonEncoding.UTF8);
			jsonGenerator.writeStartObject(); // {  
			jsonGenerator.writeStringField("name", "Ming"); // "name" : "mkyong"  
			jsonGenerator.writeNumberField("age", 25); // "age" : 29  
			jsonGenerator.writeFieldName("messages"); // "messages" :  
			jsonGenerator.writeStartArray(); // [  
			jsonGenerator.writeString("msg 1"); // "msg 1"  
			jsonGenerator.writeString("msg 2"); // "msg 2"  
			jsonGenerator.writeString("msg 3"); // "msg 3"  
			jsonGenerator.writeEndArray(); // ]  
			jsonGenerator.writeEndObject(); // }
			jsonGenerator.close();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
