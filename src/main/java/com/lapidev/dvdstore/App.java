package com.lapidev.dvdstore;

import com.lapidev.dvdstore.controller.MovieController;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieController movieController = new MovieController();

        movieController.addUsingConsole();
    }
}
