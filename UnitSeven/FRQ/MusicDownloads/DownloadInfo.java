package UnitSeven.FRQ.MusicDownloads;

public class DownloadInfo
{
  private String theTitle;
  private int timesDownloaded; //can't be static or else we couldn't use in other class

  public DownloadInfo( String title )
  {
    theTitle = title;
    timesDownloaded = 1;
  }

  public String getTitle()
  {
    return theTitle;
  }

  public void incrementTimesDownloaded()
  {
    timesDownloaded++;
  }

  public String toString()
  {
    return theTitle + " " + timesDownloaded;
  }
}