package Lesson14;

public class VideoPlayer implements Media{
    private String movieName;

    public VideoPlayer(String movieName){
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public void play() {
        System.out.println("Playing movie:..." + movieName);
    }

    @Override
    public void stop() {
        System.out.println("Stopped movie..." + movieName);
    }
}
