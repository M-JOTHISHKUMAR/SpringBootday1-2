package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class application1 {
@GetMapping("/")
public String Hello() {
	return "parrrrr";
}
}
