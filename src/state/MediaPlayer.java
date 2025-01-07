package state;

public class MediaPlayer {
    MediaPlayerState playState;
    MediaPlayerState pauseState;
    MediaPlayerState stopState;
    MediaPlayerState state;

    public MediaPlayer(){
        playState = new PlayState(this);
        pauseState = new PauseState(this);
        stopState = new StopState(this);

        state = stopState;
    }

    public void play(){
        state.play();
    }

    public void pause(){
        state.pause();
    }

    public void stop(){
        state.stop();
    }

    public void setState(MediaPlayerState state){
        this.state = state;
    }
}
