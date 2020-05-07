
package Model;

/**
 * Oi fiz uma alteracao aqui
 * Sim, já vi
 * @author Priscila
 */
 abstract class Media {
    // ***** Atributes *****
    protected String idMedia;
    protected String title;
    protected int yearOfRelease;
    protected float price;
    protected int rentedDays;
    protected int availability;
    protected MediaFormat mediaFormat;
    protected String description;
    
    @Override
    public String toString() {
        return "Media{" + "idMedia=" + idMedia + ", title=" + title + ", yearOfRelease=" +
         yearOfRelease + ", price=" + price + ", rentedDays=" + rentedDays + ", availability=" + 
           availability + ", mediaFormat=" + mediaFormat + ", description=" + description + '}';
    }
            
    
    public String getIdMedia() {
        return idMedia;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
    
    public float getPrice() {
        return price;
    }
   
    public int getRentedDays() {
        return rentedDays;
    }

    public int getAvailability() {
        return availability;
    }
   
    public MediaFormat getMediaFormat() {
        return mediaFormat;
    }


    public String getDescription() {
        return description;
    }

    
}
