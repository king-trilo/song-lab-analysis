public class Song {
    private String artist, title, genre;
    private int year;
    private double danceability;
    private int len;
    private double shakeability;
    private double obscene;
    private double loudness;
    private String topic;


    

    public Song(String artist, String title, int year, String genre, double danceability, 
    int len, double shakeability, double obscene, double loudness, String topic) 
    {
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.danceability = danceability;
        this.len = len;
        this.shakeability = shakeability;
        this.obscene = obscene;
        this.loudness = loudness;
        this.topic = topic;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public String getGenre() {
        return genre;
    }
public double getDanceability() {
        return danceability;
}
    public int getLen() {
        return len;
    }
    public double getShakeability() {
        return shakeability;  
}
    public double getObscene() {
        return obscene;
    }
    public double getLoudness() {
        return loudness;
    }
    public String getTopic() {
        return topic;
    }
}
