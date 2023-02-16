package UnitSeven.FRQ.MusicDownloads;


import java.util.ArrayList;
import java.util.List;

public class MusicDownloadsRunner
{
  public static void main(String[] args)
  {

//creates new DownloadInfo objects and prints their title with # of times downloaded.
//each new object of "DownloadInfo" stores the songs title and set the # to 1 initially
//        DownloadInfo d1 = new DownloadInfo( "Dance" );
//        System.out.println( d1 );
//
//        DownloadInfo d2 = new DownloadInfo( "Stay" );
//        System.out.println( d2 );
//        System.out.println("**********************************");

//Adding new titles to an ArrayList called "songList"
    List<String> songList = new ArrayList<String>();
    songList.add( "Lights" );
    songList.add( "Aqualung" );
    songList.add( "Soul Sister" );
    songList.add( "Go Now" );
    songList.add( "Lights" );
    songList.add( "Soul Sister" );

//Create a new MusicDownloads object which is setting up for any ArrayList of songs passed in to be
//DownloadInfo objects that store the title and default of # times downloaded to 1.
    MusicDownloads md = new MusicDownloads();

//updateDownloads is checking the list above an empty list right now.
    //If they are already in the ArrayList stored in new "md" object, the # will be incremented
    //If not they will now be added to DownloadInfo
    md.updateDownloads( songList );
    System.out.println( md );
    System.out.println("**********************************");

//Displaying results when a song title is checked if it is in "md" object, which is now the songs above
    System.out.println( md.getDownloadInfo("Stay") );
    System.out.println( md.getDownloadInfo("Lights") );

    System.out.println("**********************************");

//Now adding lots more of the same songs to the songList
    songList = new ArrayList<String>();

    for( int i = 1; i < 6; i++)  songList.add( "Hey Jude" );
    for( int i = 1; i < 4; i++)  songList.add( "Soul Sister" );
    for( int i = 1; i < 11; i++) songList.add( "Aqualung" );

//Must update object md by calling the method again since new songs were added to the songList
    md.updateDownloads( songList );

//Displaying results when the newly added song titles are checked if they are in "md" object, which they are multiple times
    System.out.println( md.getDownloadInfo("Aqualung") );
    System.out.println( md );

  }
}
