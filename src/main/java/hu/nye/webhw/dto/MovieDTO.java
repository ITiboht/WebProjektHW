package hu.nye.webhw.dto;

import javax.persistence.ElementCollection;
import java.util.Date;
import java.util.Set;

public class MovieDTO {

  private Long id;

  private String title;

  private String tagline;

  private double voteAverage;

  private int voteCount;

  private Date releaseDate;

  private String posterPath;

  private String overview;

  private int budget;

  private int revenue;

  private Set<String> genres;

  private Integer runtime;

}
