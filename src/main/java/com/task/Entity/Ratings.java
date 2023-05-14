package com.task.Entity;


import jakarta.persistence.*;

@Entity
public class Ratings {
    @Id
    @OneToOne
    @JoinColumn(name = "tconst", referencedColumnName = "tconst")
    private  String tconst ;
    private  String  averageRating;
    private String  numVots ;

    public Ratings() {
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public String getNumVots() {
        return numVots;
    }

    public void setNumVots(String numVots) {
        this.numVots = numVots;
    }

    public Ratings(String tconst, String averageRating, String numVots) {
        this.tconst = tconst;
        this.averageRating = averageRating;
        this.numVots = numVots;
    }
}
