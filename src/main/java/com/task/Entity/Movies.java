package com.task.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {

    @Id
    private  String tconst ;
    private  String titleType;
    private String primaryTitle ;
    private String runtimeMinuts;
    private String geners;

    public Movies() {
    }

    public Movies(String tconst, String titleType, String primaryTitle, String runtimeMinuts, String geners) {
        this.tconst = tconst;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.runtimeMinuts = runtimeMinuts;
        this.geners = geners;
    }

    public String getTconst() {
        return tconst;
    }

    public void setTconst(String tconst) {
        this.tconst = tconst;
    }

    public String getTitleType() {
        return titleType;
    }

    public void setTitleType(String titleType) {
        this.titleType = titleType;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getRuntimeMinuts() {
        return runtimeMinuts;
    }

    public void setRuntimeMinuts(String runtimeMinuts) {
        this.runtimeMinuts = runtimeMinuts;
    }

    public String getGeners() {
        return geners;
    }

    public void setGeners(String geners) {
        this.geners = geners;
    }
}
