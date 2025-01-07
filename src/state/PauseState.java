package state;

public class PauseState implements MediaPlayerState{
    MediaPlayer mediaPlayer;

    public PauseState(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        mediaPlayer.setState(mediaPlayer.playState);
    }

    @Override
    public void pause() {
        System.out.println("Already Paused..");
    }

    @Override
    public void stop() {
        mediaPlayer.setState(mediaPlayer.stopState);
    }
}
