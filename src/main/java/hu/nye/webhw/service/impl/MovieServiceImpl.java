package hu.nye.webhw.service.impl;

import hu.nye.webhw.dto.MovieDTO;
import hu.nye.webhw.entity.MovieEntity;
import hu.nye.webhw.repo.MovieRepository;
import hu.nye.webhw.service.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

  private MovieRepository movieRepository;
  private ModelMapper modelMapper;

  public MovieServiceImpl(MovieRepository movieRepository, ModelMapper modelMapper) {
    this.movieRepository = movieRepository;
    this.modelMapper = modelMapper;

    MovieEntity movieEntity = new MovieEntity();
    movieEntity.setTitle("Star Wars");
    movieRepository.save(movieEntity);
  }

  @Override
  public List<MovieDTO> findAll() {
    List<MovieEntity> movies = movieRepository.findAll();

    List<MovieDTO> result = new ArrayList<>();

    for (MovieEntity movieEntity : movies) {
      MovieDTO movieDTO = modelMapper.map(movieEntity, MovieDTO.class);
      result.add(movieDTO);
    }

    return result;
  }

  @Override
  public Optional<MovieDTO> findById(Long id) {
    Optional<MovieEntity> movieEntityOptional = movieRepository.findById(id);

    Optional<MovieDTO> movieDTO = movieEntityOptional.map(movieEntity -> modelMapper.map(movieEntity, MovieDTO.class));

    return movieDTO;
  }

}
