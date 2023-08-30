package com.myapp.devdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {
	@GetMapping(value="project")
	public String add() {
		return "This My Project";
	}

}
