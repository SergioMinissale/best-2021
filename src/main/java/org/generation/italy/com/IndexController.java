package org.generation.italy.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class IndexController {
	@GetMapping("/Best of 2021 by")
	@ResponseBody
	public String Title() {
		String name = "Sergio";
		return "<html><body><h1>Best of 2021 by" + name + "</h1></body></html>";
	}

	@GetMapping("\songs")
	public String songs(Model model) {
		List<String> songsList = new ArrayList<String>();
		model.addAttribute("songs", Arrays.asList("Come me, Achille Lauro", "InfinityLove, Marracash feat. Guè",
				"Lucciole, Blanco", "Noi, Marracash", "Come nelle canzoni, Coez"));
		return "songs";
	}

	@GetMapping("\movies")
	public String movies(Model model) {
		List<String> moviesList = new ArrayList<String>();
		model.addAttribute("movies", Arrays.asList("SpiderMan: No Way Home", "Dune", "Eternals", "Don't look up", "Encanto"));
		return "movies";
	}
}
