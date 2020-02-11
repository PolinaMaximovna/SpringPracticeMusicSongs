package ru.java.course.SpringPractice;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
        private List<Music> musicList = new ArrayList<>() ;

        public int getVolume() {
            return volume;
        }

        public String getName() {
            return name;
        }

        private String name;

        public void setName(String name) {
            this.name = name;
        }


        private int volume;

        public void setVolume(int volume) {
            this.volume = volume;
        }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }


    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
