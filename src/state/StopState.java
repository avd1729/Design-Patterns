package state;

public class StopState implements MediaPlayerState{

    MediaPlayer mediaPlayer;
    public StopState(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play() {
        mediaPlayer.setState(mediaPlayer.playState);
    }

    @Override
    public void pause() {
        mediaPlayer.setState(mediaPlayer.pauseState);
    }

    @Override
    public void stop() {
        System.out.println("Already Stopped..");
    }
}
