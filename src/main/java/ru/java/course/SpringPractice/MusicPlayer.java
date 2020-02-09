package ru.java.course.SpringPractice;

    public class MusicPlayer {
        private Music music;

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



        public MusicPlayer(){}

        // IoC
        public MusicPlayer(Music music) {
            this.music = music;
        }
        public void setMusic(Music music){
            this.music = music;
        }

        public void playMusic() {
            System.out.println("Playing: " + music.getSong());
        }


    }
