package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BLogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<hi>hello spring boot</h1>";
	}
}
