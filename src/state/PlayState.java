package state;

public class PlayState implements MediaPlayerState{

    MediaPlayer mediaPlayer;
    public PlayState(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    @Override
    public void play() {
        System.out.println("Already Playing..");
    }

    @Override
    public void pause() {
        mediaPlayer.setState(mediaPlayer.pauseState);
    }

    @Override
    public void stop() {
        mediaPlayer.setState(mediaPlayer.stopState);
    }
}
