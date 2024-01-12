package it.epicode.be.Video;

import it.epicode.be.Multimedia.Multimedia;

public class Video extends Multimedia {
    public int lux;

    public Video(String title, int durata, int volume, int lux) {
        super(title, durata, volume);
        this.lux=lux;
    }

    @Override
    public void asteriscoL() {
        super.asteriscoL();
    }

    @Override
    public int morelux() {
        return super.morelux();
    }

    @Override
    public int lesslux() {
        return super.lesslux();
    }

    @Override
    public void playVideo() {
        super.playVideo();
    }
}
