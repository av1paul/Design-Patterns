package org.avi.compositePattern.fileSystem;

import org.avi.compositePattern.fileSystem.Directory;
import org.avi.compositePattern.fileSystem.File;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("movies");
        Directory comedyMovies = new Directory("comedy movies");
        File batman = new File("batman");
        File rushHour = new File("rush hour");
        comedyMovies.add(rushHour);
        movies.add(comedyMovies);
        movies.add(batman);
        movies.ls();
    }
}
