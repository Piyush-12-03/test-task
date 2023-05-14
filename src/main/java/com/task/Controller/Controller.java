package com.task.Controller;
import com.task.Entity.Movies;
import com.task.Repository.MoviesRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(" /api/v1")
public class Controller {
    @Autowired
    private MoviesRepository moviesRepository;

    @GetMapping("/longest-duration-movies")
    public List<Movies> LongestDurationMovies () {
        List<Movies> movies = moviesRepository.findTop10ByOrderByRuntimeDesc();
        return movies;
    }

    @PostMapping("/new-movie")
    public String addMovie(@RequestBody Movies movies) {
        moviesRepository.save(movies);
        return "success";
    }

    @GetMapping("/top-rated-movies")
    public List<Movies> getTopRatedMovies() {
        List<Movies> movies = moviesRepository.findByAverageRatingGreaterThan(6.0);
        return movies;
    }
    @GetMapping("/genre-movies-with-subtotals")
    public List<Movies>  getSubTotal() {
        List<Movies> movies = moviesRepository.getNumVotesByGenre();
        return movies;
    }

    @PutMapping("/update-runtime-minutes")
    @Transactional
     public String updateRuntimeMinutes(){
        moviesRepository.incrementRuntimeMinutes();
        return "success";
    }
}
