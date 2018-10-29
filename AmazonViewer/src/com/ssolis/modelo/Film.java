package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Film {

    
    private String title;
    private String genre;
    private String creador;
    private int duration;
    private short year;
    private boolean viewed;
    
    public Film()
    {
    
    }
  

    public Film(String title, String genre, String creador, int duration, short year, boolean viwear) {
        this.title = title;
        this.genre = genre;
        this.creador = creador;
        this.duration = duration;
        this.year = year;
        this.viewed  = viewed ;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getCreador() {
        return creador;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setViewed (boolean viewed ) {
        this.viewed = viewed ;
    }

    public String getisViewed () {
        String visto="";
        
        if(viewed==true){
            visto="Si";
        }else{
            visto="No";
        }
        return visto;
    }
    
    
    
}


