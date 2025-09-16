// File: MusicPlayerDemo.java
interface MusicPlayer {
    void play();
    void pause();
}

class Spotify implements MusicPlayer {
    public void play() {
        System.out.println("Spotify is playing music");
    }

    public void pause() {
        System.out.println("Spotify is paused");
    }

    public static void main(String[] args) {
        Spotify s = new Spotify();
        s.play();
        s.pause();
    }
}

/*
OUTPUT :
Spotify is playing music
Spotify is paused
*/