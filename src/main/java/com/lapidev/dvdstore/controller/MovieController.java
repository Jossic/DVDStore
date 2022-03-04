package com.lapidev.dvdstore.controller;

import com.lapidev.dvdstore.entity.Movie;
import com.lapidev.dvdstore.service.IMovieService;

import java.util.Scanner;

public class MovieController {

    private IMovieService movieService;

    public IMovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(IMovieService movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Saisissez un titre ?" );
        String title = sc.nextLine();

        System.out.println( "Saisissez un genre ?" );
        String genre = sc.nextLine();

        System.out.println(title +" - " + genre);
        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setGenre(genre);

        movieService.registerMovie(newMovie);
    }

}
