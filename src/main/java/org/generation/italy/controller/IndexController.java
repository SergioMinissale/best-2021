package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Sergio");
		return "index";
	}
	@GetMapping("/songs")
	public String songs(Model model) {
	
		model.addAttribute("songs", Arrays.asList("Come me, Achille Lauro", "InfinityLove, Marracash feat. Guè",
				"Lucciole, Blanco", "Noi, Marracash", "Come nelle canzoni, Coez"));
		return "songs";
	}

	@GetMapping("/movies")
	public String movies(Model model) {
		
		model.addAttribute("movies", Arrays.asList("SpiderMan: No Way Home", "Dune", "Eternals", "Don't look up", "Encanto"));
		return "movies";
	}
}