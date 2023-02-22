package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {

String color = "blue";

@GetMapping("/")

public String getcolor() {

return " My Favourite Color "+color+" !";

}

}