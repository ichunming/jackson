package com.yimeicloud.study.jackjson;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json2ObjectTest {
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
	public void Json2Object() {
		
		// Note: 对应的类需要有空构造函数
		String userJson = "{\"id\":\"1\",\"name\":\"Ming\",\"adderss\":{\"country\":\"China\",\"city\":\"Shanghai\",\"block\":\"Songjiang\",\"detail\":\"zeyuelu 325nong 20hao 1401\"}}";
		try {
			User user = mapper.readValue(userJson, User.class);
			System.out.println(user.getName());
			
			User[] users = mapper.readValue(new File("users.json"), User[].class);

			System.out.println(users.length);
			for(User userT : users) {
				System.out.println(userT.getName());
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
