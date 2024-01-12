package it.epicode.be.Audio;

import it.epicode.be.Multimedia.Multimedia;

public class Audio extends Multimedia {
    public Audio(String title, int durata, int volume) {
        super(title,durata,volume);
    }

    @Override
    public void playAudio() {
        super.playAudio();
    }

    @Override
    public void puntoesclamativoV() {
        super.puntoesclamativoV();
    }

    @Override
    public int alzavolume() {
        return super.alzavolume();
    }

    @Override
    public int abassavolume() {
        return super.abassavolume();
    }
}
