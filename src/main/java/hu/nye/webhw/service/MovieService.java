package hu.nye.webhw.service;

import hu.nye.webhw.dto.MovieDTO;

import java.util.List;
import java.util.Optional;

public interface MovieService {

  List<MovieDTO> findAll();

  Optional<MovieDTO> findById(Long id);

}
