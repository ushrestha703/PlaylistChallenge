package io.zipcoder;

import com.sun.deploy.security.SelectableSecurityManager;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

       /* int goUp = 0;
        int goDown = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (!(playList[i % playList.length].equals(selection))) {
                goUp++;
            } else {
                break;
            }
        }
        for (int i = startIndex; i >= 0; i--) {
            if (!(playList[i % playList.length].equals(selection))) {
                goDown++;
            } else {
                break;
            }
        }
        if (goUp > goDown) {
            return goDown;
        }
        return goUp;
    }
    */


    //another method;
       int goDown = 0;
        int goUp = 0;

        for (int i = startIndex; i < playList.length; i++) {
           if (playList[i].equals(selection))
              break;
            if (i + 1 > playList.length)
               i = 0;
            goDown++;
        }

        for (int i = startIndex; i < playList.length; i--) {
            if (playList[i].equals(selection))
              break;
            if (i - 1 < 0)
               i = playList.length;
            goUp++;
        }

        if (goDown < goUp) {
            return goDown;
        }
        return goUp;

    }

}





