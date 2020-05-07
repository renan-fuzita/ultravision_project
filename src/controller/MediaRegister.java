package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Priscila
 */
public class MediaRegister{
    protected String idMedia;
    protected String title;
    protected String director;
    protected String band;
    protected String studio;
    protected String yearOfRelease;
    protected String mediaFormat;
    protected String price;
    protected String availability;// tem que buscar um estoque no banco de dados
    protected String description;

    public String getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(String idMedia) {
        this.idMedia = idMedia;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getMediaFormat() {
        return mediaFormat;
    }

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String Save(){
        try {
            FileWriter fw = new FileWriter("Medias.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("IdMedia :" +this.idMedia);
            pw.println("Title :" +this.title);
            pw.println("Director: "+this.director);
            pw.println("Studio: "+this.studio);
            pw.println("Year of release: "+this.yearOfRelease);
            pw.println("MediaFormat: "+this.mediaFormat);
            pw.println("Price: "+this.price);
            pw.println("Availability: "+this.availability);
            pw.println("Decription: "+this.description);
            pw.println("*************");
            
            //flush envia os dados direto para o armazemento
            pw.flush();
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            System.out.println("Error");
            
            
            Logger.getLogger(MediaRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "Registed sucessuful";
    }
        
    }
    
