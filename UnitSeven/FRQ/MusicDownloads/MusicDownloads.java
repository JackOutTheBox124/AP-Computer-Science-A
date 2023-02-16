package UnitSeven.FRQ.MusicDownloads;

import java.util.*;

public class MusicDownloads
{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {
    downloadList = new ArrayList<DownloadInfo>();
  }

  /*  Question 1 - part A */
  public DownloadInfo getDownloadInfo( String title ) {
    // write part A here
    for (DownloadInfo d : downloadList) {
      if (d.getTitle().equals(title)) {
        return d;
      }
    }
    return null;
  }

  /* Question 1 - part B */
  public void updateDownloads( List<String> titles)
  {
    //write part B here
    for (String s : titles) {
      DownloadInfo d = getDownloadInfo(s);
      if (d == null) {
        downloadList.add(new DownloadInfo(s));
      } else {
        d.incrementTimesDownloaded();
      }
    }
  }

  public String toString()
  {
    return "" + downloadList;

  }
}