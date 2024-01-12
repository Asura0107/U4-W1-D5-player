package it.epicode.be.Multimedia;

public abstract class Multimedia {
    public int durata;
    public int volume;
    public int lux;
    public String title;

    //costruttore Audio
    public Multimedia(String title, int durata, int volume) {
        this.title = title;
        this.durata = durata;
        this.volume = volume;

    }

    //costruttore immagine
    public Multimedia(String title, int lux) {
        this.title = title;

        this.lux = lux;
    }

    public void puntoesclamativoV() {
        for (int i = 0; i < this.volume; i++) {
            System.out.print("!");
        }
    }

    public void asteriscoL() {
        for (int i = 0; i < this.lux; i++) {
            System.out.print("*");
        }
    }



    public void playAudio() {
        for (int i = 0; i < this.durata; i++) {

            System.out.print(this.title + " ");
            puntoesclamativoV();
            System.out.println();
        }
    }

    public void playVideo() {
        for (int i = 0; i < this.durata; i++) {

            System.out.print(this.title + " ");
            puntoesclamativoV();
            System.out.print(" ");

            asteriscoL();

            System.out.println();
        }
    }

    public void show() {


        System.out.print(this.title + " ");

        asteriscoL();

        System.out.println();

    }

    public int alzavolume() {
        return this.volume += 1;
    }

    public int abassavolume() {
        if (this.volume>0){
            this.volume -= 1;
        }
        return this.volume;
    }

    public int morelux() {
        return this.lux += 1;
    }

    public int lesslux() {
        if (this.lux>0){
            this.lux -= 1;
        }
        return this.lux;
    }

}
