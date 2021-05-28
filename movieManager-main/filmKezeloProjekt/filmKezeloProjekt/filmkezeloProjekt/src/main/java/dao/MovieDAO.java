package dao;

import model.Movie;

import java.util.List;

public interface MovieDAO extends GenericDAO<Movie,Long> {
    List<Movie> getAllMovie();
    List<Movie> searchMovie(List<String> actorsList);
    List<Movie> searchFilteredMovie(List<String> CategoryTypeList, List<String> actorsList);
    List<Movie> searchContainedMovie(List<String> actorsTypeList, List<String> CategoryList, List<String> actorsList);
    List<Movie> searchMoviesByCategories(List<String> categories);
}
