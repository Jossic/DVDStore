package com.lapidev.dvdstore.repository;

import com.lapidev.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GoLiveMovieRepository {

    public void add(Movie movie) {
        FileWriter writer;
        try{
            writer=new FileWriter("/Users/jossic/IdeaProjects/DVDStore/src/main/java/movie.txt",true);
            writer.write(movie.getTitle()+";"+ movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
