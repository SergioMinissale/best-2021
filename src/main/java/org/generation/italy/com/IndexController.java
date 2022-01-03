package org.generation.italy.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class IndexController {
	@GetMapping("/Best of 2021 by")
	@ResponseBody
	public String Title() {
		String name = "Sergio";
		return "<html><body><h1>Best of 2021 by" + name + "</h1></body></html>";
	}
}
