import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {

    private long id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

    public Album() {
    }


    public Album(long id, String artist, String name, int releaseDate, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
