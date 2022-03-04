package com.lapidev.dvdstore.service;

import com.lapidev.dvdstore.entity.Movie;
import com.lapidev.dvdstore.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository;

    public void registerMovie(Movie movie) {
    movieRepository.add(movie);
    }
}
