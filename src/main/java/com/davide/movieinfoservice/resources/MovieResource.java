package com.davide.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.davide.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
/*
 	//	qualora dovessi prendere un indirizzo esterno ovviamente si può usare un webClient o un restTemplate 
 	//	in questo caso dovrebbe essere autowired dalla classe principale e successivamente dovrebbe essere richiamato
 	//	in un altra classe che dovrebbe dare altro, in questo caso ricreata appositamente per poter combaciare
 	 
	@Value("${api.key}")
	private String apyKey;
	@Autowired
	private RestTemplate restTemplate;
 */
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		/*
		MovieSummary movieSummary=restTemplate.getForObject(
				"http://api.themoviedb.org/3/movie/" + movieId + "?apy_key" + apyKey ,MovieSummary.class
				); 
		*/
		return new Movie(movieId, "test name");
	}
}
