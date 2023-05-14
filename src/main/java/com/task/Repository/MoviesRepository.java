package com.task.Repository;

import com.task.Entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MoviesRepository extends JpaRepository<Movies, String> {

        List<Movies> findTop10ByOrderByRuntimeDesc();

        List<Movies> findByAverageRatingGreaterThan(double averageRating);

        @Query("SELECT m.genres, SUM(r.numVotes) AS total_num_votes "
                        + "FROM movies m "
                        + "JOIN ratings r ON m.id = r.id "
                        + "GROUP BY m.genres")
        List<Movies> getNumVotesByGenre();

        @Modifying
        @Query("UPDATE Movie m SET m.runtimeMinutes = m.runtimeMinutes + "
                        + "CASE WHEN m.genre = 'Documentary' THEN 15 "
                        + "WHEN m.genre = 'Animation' THEN 30 "
                        + "ELSE 45 END")
        void incrementRuntimeMinutes();

}
