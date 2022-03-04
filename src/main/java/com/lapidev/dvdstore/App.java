package com.lapidev.dvdstore;

import com.lapidev.dvdstore.controller.MovieController;
import com.lapidev.dvdstore.repository.GoLiveMovieRepository;
import com.lapidev.dvdstore.repository.IMovieRepository;
import com.lapidev.dvdstore.service.MovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();
        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        MovieService movieService = new MovieService();
        movieService.setMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
