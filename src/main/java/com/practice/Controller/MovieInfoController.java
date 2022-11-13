package com.practice.Controller;

import com.practice.Resources.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @RequestMapping("/{movieId}")
        public MovieInfo getMovieInfoDetails(@PathVariable("movieId") String movieId){
        List<MovieInfo> movieInfoList = Arrays.asList(
                new MovieInfo("1","Titanic","Romance"),
                new MovieInfo("2","James Bond 007","Action"),
                new MovieInfo("3","Baby's Day Out","Comedy"),
                new MovieInfo("4","Transformer","Action"),
                new MovieInfo("5","The Jungle Book","Adventure")
        );
        return movieInfoList.stream().filter(movie -> movie.getMovieId().equalsIgnoreCase(movieId)).findFirst().orElse(null);
    }
}
