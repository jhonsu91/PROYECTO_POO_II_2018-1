package com.ssolis.modelo;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Serie {

    private int id;
    private String title;
    private String genero;
    private String creador;
    private int duration;
    private short year;
    private boolean viwear;
    private int timeviwer;

    public Serie(int id, String title, String genero, String creador, int duration, short year, boolean viwear, int timeviwer) {
        this.id = id;
        this.title = title;
        this.genero = genero;
        this.creador = creador;
        this.duration = duration;
        this.year = year;
        this.viwear = viwear;
        this.timeviwer = timeviwer;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * @param creador the creador to set
     */
    public void setCreador(String creador) {
        this.creador = creador;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viwear
     */
    public boolean isViwear() {
        return viwear;
    }

    /**
     * @param viwear the viwear to set
     */
    public void setViwear(boolean viwear) {
        this.viwear = viwear;
    }

    /**
     * @return the timeviwer
     */
    public int getTimeviwer() {
        return timeviwer;
    }

    /**
     * @param timeviwer the timeviwer to set
     */
    public void setTimeviwer(int timeviwer) {
        this.timeviwer = timeviwer;
    }
    
}
