package com.task.Repository;

import com.task.Entity.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingsRepository  extends JpaRepository<Ratings,String> {

}
