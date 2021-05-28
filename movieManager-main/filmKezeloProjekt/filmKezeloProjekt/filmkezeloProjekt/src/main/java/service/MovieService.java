package service;

import model.Actor;
import model.Movie;

import java.util.List;

public interface MovieService {
    void createActorsAddToMovie(List<Actor> actorList, Movie movie);
    void createMovie(Movie movie);
    List<Movie> searchMovie(List <String> actors);
    List<Movie> searchFilteredMovie(List <String> category, List<String> actors);
    List<Movie> searchContainedMovie(List <String> actorTypeList, List <String> categoryList, List<String> actorsList);
    List<Movie> getAllMovie();
    List<Movie> getMoviesByCategories(List<String> categories);
}
