import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadingData {
    public Song [] read() {
        Scanner in;
        Song [] songs = new Song[28372];
        try {
            int count = 0;
            in = new Scanner(new File("/Users/trilochanthilakarajan/SongLabAnalysis/SongLab/songs.txt"));
            in.nextLine(); // skip header
            System.out.println("READING");
            while (in.hasNext()) 
            {
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int len = Integer.parseInt(line.split(";")[4]);
                double shakeability = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                
                //public Song(String artist, String title, int year, String genre, double danceability, int len, double shakeability, double obscene, double loudness, String topic) {
                songs[count] = new Song(artist, title, year, genre, danceability, len, shakeability, obscene, loudness, topic);

                // System.out.println(count+ " "+ year);
                count++;
                
            }
            in.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error in opening scanner");
        }
    return songs;

}
public String getLongestTitle(Song[] songarray)
{
    String longest = "";
    for(int i=0; i<28371; i++)
    {
        String title = songarray[i].getTitle();
        if(title.length()>longest.length())
        {
            longest = title;
        }
    }
    return longest;
}
public String getTotalSongs(Song[] songarray)
{
    int total = 0;
    for(int i=0; i<28371; i++)
    {
        total++;
    }
    return "Total Songs: " + total;
}
public int getSongs1982(Song[] songarray){
    int yearCount82 = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear()==1982)
        {
            yearCount82++;
        }
       
    }
    return yearCount82;
}
public int getSongs2000(Song[] songarray)
{
    int yearCount2000 = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear()==2000){
            yearCount2000++;
        }
       
    }
    return yearCount2000;
}
public int getSongs2015(Song[] songarray)
{
    int yearCount2015 = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear()==2015){
            yearCount2015++;
        }
       
    }
    return yearCount2015;
}
public int getDanceCount(Song[] songarray)
{
    int danceCount = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getDanceability() > 0.8){
            danceCount++;
        }
       
    }
    return danceCount;
}
public String getLongLenTitle(Song[] songarray)
{
    String longLenTitle = "";
    int largestLen = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getLen() > largestLen){
            largestLen = songarray[i].getLen();
            longLenTitle = songarray[i].getTitle();
}
    }
    return longLenTitle;
}

 public int getLargeLen(Song[] songarray)
 {
     int largestLen = 0;
     for(int i=0; i < 28371; i++)
     {
         if(songarray[i].getLen() > largestLen){
             largestLen = songarray[i].getLen();
 }     }
     return largestLen;
 }
public String getLowShakeTitle(Song[] songarray)
{
    String lowShakeTitle = "";
    double lowestShake = Double.MAX_VALUE;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getShakeability() < lowestShake){
            lowestShake = songarray[i].getShakeability();
            lowShakeTitle = songarray[i].getTitle();
    }    
}
    return lowShakeTitle;
}
public String getLoudestTitle(Song[] songarray)
{
    int highestLoud = 0;
    String loudestTitle = "";
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getLoudness() > highestLoud){
            highestLoud = (int) songarray[i].getLoudness();
            loudestTitle = songarray[i].getTitle();
    }    
}
    return loudestTitle;   
}
public int getLoudest(Song[] songarray)
{
    int highestLoud = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getLoudness() > highestLoud){
            highestLoud = (int) songarray[i].getLoudness();
    }    
}
    return highestLoud;   
}
public double getAvgObs50s(Song[] songarray)
{
    double totObs50 = 0;
    int countTotObs50 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 1950 && songarray[i].getYear() < 1960){
            totObs50 += songarray[i].getObscene();
            countTotObs50++;
    }

}
    return(totObs50 / countTotObs50);
}
public double getAvgObs60s(Song[] songarray)
{
    double totObs60 = 0;
    int countTotObs60 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 1960 && songarray[i].getYear() < 1970){
            totObs60 += songarray[i].getObscene();
            countTotObs60++;
    }

}
    return (totObs60 / countTotObs60);
}
public double getAvgObs70s(Song[] songarray)
{
    double totObs70 = 0;
    int countTotObs70 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 1970 && songarray[i].getYear() < 1980){
            totObs70 += songarray[i].getObscene();
            countTotObs70++;
    }

}
    return(totObs70 / countTotObs70);
}
public double getAvgObs80s(Song[] songarray)
{
    double totObs80 = 0;
    int countTotObs80 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 1980 && songarray[i].getYear() < 1990){
            totObs80 += songarray[i].getObscene();
            countTotObs80++;
    }

}
    return(totObs80 / countTotObs80);
}
public double getAvgObs90s(Song[] songarray)
{
    double totObs90 = 0;
    int countTotObs90 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 1990 && songarray[i].getYear() < 2000){
            totObs90 += songarray[i].getObscene();
            countTotObs90++;
    }

}
    return(totObs90 / countTotObs90);
}
public double getAvgObs2000s(Song[] songarray)
{
    double totObs2000 = 0;
    int countTotObs2000 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 2000 && songarray[i].getYear() < 2010){
            totObs2000 += songarray[i].getObscene();
            countTotObs2000++;
    }

}
    return(totObs2000 / countTotObs2000);
}
public double getAvgObs2010s(Song[] songarray)
{
    double totObs2010 = 0;
    double countTotObs2010 = 0;
    for (int i=0; i < 28371; i++)
    {
        if(songarray[i].getYear() >= 2010 && songarray[i].getYear() < 2020){
            totObs2010 += songarray[i].getObscene();
            countTotObs2010++;
    }

}
    return(totObs2010 / countTotObs2010);
}
public int getSongMichaelJackson(Song[] songarray)
{
    int mjCount = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getArtist().equals("michael jackson")){
            mjCount++;
        }
       
    }
    return mjCount;
}
public int getSongWhitneyHouston(Song[] songarray)
{
    int whCount = 0;
    for(int i=0; i < 28371; i++)
    {
        if(songarray[i].getArtist().equals("whitney houston")){
            whCount++;
        }
       
    }
    return whCount;
}
}




 