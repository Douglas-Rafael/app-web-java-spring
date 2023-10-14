package br.com.douglasrafael.screenmatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.douglasrafael.screenmatch.domain.movie.Movie;
import br.com.douglasrafael.screenmatch.domain.movie.MovieAlterData;
import br.com.douglasrafael.screenmatch.domain.movie.MovieRegisterData;
import br.com.douglasrafael.screenmatch.domain.movie.MovieRepository;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieRepository repository;

	@GetMapping("/form")
	public String loadFormPage(Long id, Model model) {
		if (id != null) {
			var movie = repository.getReferenceById(id);
			model.addAttribute("movie", movie);
		}
		return "movies/form";

	}

	@GetMapping
	public String loadListingPage(Model model) {
		model.addAttribute("list", repository.findAll());
		return "movies/listing";
	}

	@PostMapping
	@Transactional
	public String registerMovie(MovieRegisterData data) {
		var movie = new Movie(data);
		repository.save(movie);

		return "redirect:/movies";
	}

	@PutMapping
	@Transactional
	public String alterMovie(MovieAlterData data) {
		var movie = repository.getReferenceById(data.id());
		movie.updateData(data);

		return "redirect:/movies";
	}

	@DeleteMapping
	@Transactional
	public String removeMovie(Long id) {
		repository.deleteById(id);
		return "redirect:/movies";
	}
}
