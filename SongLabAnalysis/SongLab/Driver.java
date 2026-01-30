public class Driver {
    public static void main(String[] args)
     {
    ReadingData r = new ReadingData();
    Song[] mySongs = r.read();
    System.out.println("Longest: " + r.getLongestTitle(mySongs));
    System.out.println("Total Songs: " + r.getTotalSongs(mySongs));
    System.out.println("Songs from 1982: " + r.getSongs1982(mySongs));
    System.out.println("Songs from 2000: " + r.getSongs2000(mySongs));
    System.out.println("Songs from 2015: " + r.getSongs2015(mySongs));
    System.out.println("Number of songs with danceability greater than 0.8: " + r.getDanceCount(mySongs));
    System.out.println("Longest song is: " + r.getLongLenTitle(mySongs) + " with length of " + r.getLargeLen(mySongs) + " seconds.");
    System.out.println("The song with lowest shakeability is: " + r.getLowShakeTitle(mySongs));
    System.out.println("The loudest song is " + r.getLoudestTitle(mySongs) + " with a loudness of " + r.getLoudest(mySongs));
    System.out.println("The average obscenity of songs from 1950s is: " + r.getAvgObs50s(mySongs));
    System.out.println("The average obscenity of songs from 1960s is: " + r.getAvgObs60s(mySongs));
    System.out.println("The average obscenity of songs from 1970s is: " + r.getAvgObs70s(mySongs));
    System.out.println("The average obscenity of songs from 1980s is: " + r.getAvgObs80s(mySongs));
    System.out.println("The average obscenity of songs from 1990s is: " + r.getAvgObs90s(mySongs));
    System.out.println("The average obscenity of songs from 2000s is: " + r.getAvgObs2000s(mySongs));
    System.out.println("The average obscenity of songs from 2010s is: " + r.getAvgObs2010s(mySongs));
    System.out.println("The number of songs with Michael Jackson as the artist is: " + r.getSongMichaelJackson(mySongs));
    System.out.println("The number of songs with Whiteney Houston as the artist is: " + r.getSongWhitneyHouston(mySongs));

    



    }
}
