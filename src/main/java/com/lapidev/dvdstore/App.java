package com.lapidev.dvdstore;

import com.lapidev.dvdstore.controller.MovieController;
import com.lapidev.dvdstore.repository.FileMovieRepository;
import com.lapidev.dvdstore.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            ApplicationCont
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");


        MovieController movieController = new MovieController();
        FileMovieRepository movieRepository = new FileMovieRepository();
        DefaultMovieService movieService = new DefaultMovieService();
        movieService.setMovieRepository(movieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
