package Lesson14;

public class MusicPlayer implements Media{

    private String songName;

    public MusicPlayer(String songName){
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.println("Playing song..." + songName);
    }

    @Override
    public void stop() {
        System.out.println("Stopped song!" + songName);
    }
}
