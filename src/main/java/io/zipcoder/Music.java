package io.zipcoder;

import com.sun.deploy.security.SelectableSecurityManager;

public class Music
{

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection)
    {

        int nextSong = 0;
        int previousSong = 0;
        int Index = 0;

        for (int i = 0; i < playList.length; i++)
        {
            if ( selection == playList[i])
            {
                Index = i;

                if (Index > startIndex)
                {
                    nextSong = Index - startIndex;
                    if (Index < playList.length - 1)
                    {
                    previousSong = playList.length - 1 - Index;
                    }
                }
             }
          }
                if (nextSong > previousSong && previousSong != 0)
                 {
                        return previousSong;
                 }
                else
                 {
                        return nextSong;

                 }


    }


}


