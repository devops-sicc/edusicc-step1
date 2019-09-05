package com.sicc.edu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduForGradleController {

	@RequestMapping("/")
	public String SpringDockerTest() {
		return "{'Output ====> '1st Education For Sicc'}";
	}
}
