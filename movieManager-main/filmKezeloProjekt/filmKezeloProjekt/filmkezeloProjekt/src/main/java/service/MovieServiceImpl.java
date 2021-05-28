package service;

import dao.MovieDAO;
import model.Actor;
import model.Movie;

import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieDAO dao;

    public MovieServiceImpl(MovieDAO dao) {
        this.dao = dao;
    }

    /**
     */
    @Override
    public void createActorsAddToMovie(List<Actor> actorList, Movie movie) {
        for (int i = 0; i < actorList.size(); i++) {
            movie.addActors(actorList.get(i));
        }
    }

    /**
     */
    @Override
    public void createMovie(Movie movie) {
        dao.persist(movie);
    }

    /**
     */
    @Override
    public List<Movie> searchMovie(List<String> actors) {
        return dao.searchMovie(actors);
    }

    /**
     */
    @Override
    public List<Movie> searchFilteredMovie(List<String> movieTypeList, List<String> actorsList) {
        return dao.searchFilteredMovie(movieTypeList, actorsList);
    }

    @Override
    public List<Movie> searchContainedMovie(List<String> actorTypeList, List<String> categoryList, List<String> actorsList) {
        return dao.searchContainedMovie(actorTypeList, categoryList, actorsList);
    }

    @Override
    public List<Movie> getAllMovie() {
        return dao.getAllMovie();
    }

    @Override
    public List<Movie> getMoviesByCategories(List<String> categories) {
        return dao.searchMoviesByCategories(categories);
    }
}
