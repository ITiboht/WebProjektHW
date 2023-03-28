package hu.nye.webhw.controller;

import hu.nye.webhw.dto.MovieDTO;
import hu.nye.webhw.service.MovieService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

  private MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @RequestMapping(path = "/movies", method = RequestMethod.GET)
  public List<MovieDTO> findAll() {
    List<MovieDTO> movies = movieService.findAll();
    return movies;
  }


  //Continute vid from 1:35:49
  @RequestMapping(path = "/movies/{id}", method = RequestMethod.GET)
  public Optional<MovieDTO> findById(@PathVariable Long id){
    return movieService.findById(id);
  }
}
