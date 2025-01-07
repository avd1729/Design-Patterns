package state;

public class Driver {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.play();
        mediaPlayer.play(); //
        mediaPlayer.pause();
        mediaPlayer.stop();
        mediaPlayer.pause();
        mediaPlayer.pause(); //
        mediaPlayer.stop();
        mediaPlayer.play();
        mediaPlayer.play(); //
    }
}
