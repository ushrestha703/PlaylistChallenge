package io.zipcoder;

import com.sun.deploy.security.SelectableSecurityManager;

public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int goDown = 0;
        int goUp = 0;

        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i].equals(selection))
                break;
            if (i + 1 > playList.length)
                i = -1;
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





