package com.lapidev.dvdstore.service;

import com.lapidev.dvdstore.entity.Movie;
import com.lapidev.dvdstore.repository.IMovieRepository;

public class DefaultMovieService implements IMovieService {

    private IMovieRepository movieRepository ;

    public IMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) {
    movieRepository.add(movie);
    }
}
