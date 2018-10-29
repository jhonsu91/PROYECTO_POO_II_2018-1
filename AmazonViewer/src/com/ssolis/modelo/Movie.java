package com.ssolis.modelo;

import com.ssolis.interfaces.IVisualizable;
import java.util.Date;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Movie extends Film implements IVisualizable{
    
  private int id;
  private int timeViewed;

  public Movie(){
      
  }

    public Movie(int id, int timeViewed, String title, String genre, String creador, int duration, short year, boolean viwear) {
        super(title, genre, creador, duration, year, viwear);
        this.id = id;
        this.timeViewed = timeViewed;
    }
  
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

  

    /**
     * @return the timeViewed
     */
    public int getTimeViewed() {
        return timeViewed;
    }

    /**
     * @param timeViewed the timeViewed to set
     */
    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public Date starToSee(Date dateI) {
    return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if(dateF.getTime()>dateI.getTime()){
            setTimeViewed((int)(dateF.getTime()-dateI.getTime()));
        }else{
            setTimeViewed(0);
        }
    }

    @Override
    public String toString() {
        return "\n::MOVIE::"
                +""
    }

    
    
    } 
