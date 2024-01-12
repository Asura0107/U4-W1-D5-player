import it.epicode.be.Audio.Audio;
import it.epicode.be.Image.Image;
import it.epicode.be.Multimedia.Multimedia;
import it.epicode.be.Video.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main player = new Main();
//è da istanziare dato che mi trovo dentro una class static mentre inizio() non lo è.
        player.inizio();


    }
// come parametro di volume uso un oggetto multimedia basato sulla classe Multimedia
    public void volume(Multimedia multimedia) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("vuoi alzare il volume o lo voui abbassare? 0->no  1-> alza  2->abbassa");
        int d = scan1.nextInt();
        scan1.nextLine();

        switch (d) {
            case 0:
                System.out.println("sto bene così");
                break;
            case 1:
                multimedia.alzavolume();
                break;
            case 2:
                multimedia.abassavolume();
                break;


        }

    }

    public void luce(Multimedia multimedia){
        Scanner scan2 = new Scanner(System.in);
        System.out.println("vuoi alzare la luminosità o lo voui abbassare? 0->no  1-> alza  2->abbassa");
        int e = scan2.nextInt();
        scan2.nextLine();

        switch (e) {
            case 0:
                System.out.println("sto bene così");
                break;
            case 1:
                multimedia.morelux();
                break;
            case 2:
                multimedia.lesslux();
                break;


        }
    }

    public void inizio() {
        Scanner scan = new Scanner(System.in);
        Multimedia[] multimedia = new Multimedia[5];

        for (int i = 0; i < multimedia.length; i++) {
            System.out.println("Inserisci il tipo di file multimediale che vuoi inserire: 1->audio   2->immagine  3->video ");
            int str = scan.nextInt();
            scan.nextLine();
            if (str != 0) {

                switch (str) {
                    case 1:
                        System.out.println("Inserci il titolo di un audio che vuoi ascoltare: ");
                        String title = scan.nextLine();
                        scan.nextLine();

                        System.out.println("Inserci la durata: ");
                        int durata = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Inserci il volume: ");
                        int vol = scan.nextInt();
                        scan.nextLine();


                        multimedia[i] = new Audio(title, durata, vol);
                        volume(multimedia[i]);
                        multimedia[i].playAudio();
                        break;

                    case 2:
                        System.out.println("Inserci il titolo dell'immagine: ");
                        String title1 = scan.nextLine();

                        System.out.println("Inserci la luminosità: ");
                        int lux = scan.nextInt();
                        scan.nextLine();

                        multimedia[i] = new Image(title1, lux);
                        luce(multimedia[i]);
                        multimedia[i].show();
                        break;

                    case 3:
                        System.out.println("Inserci il titolo di un audio che vuoi ascoltare: ");
                        String title2 = scan.nextLine();

                        System.out.println("Inserci la durata: ");
                        int durata1 = scan.nextInt();

                        System.out.println("Inserci il volume: ");
                        int vol1 = scan.nextInt();

                        System.out.println("Inserci la luminosità: ");
                        int lux1 = scan.nextInt();
                        multimedia[i] = new Video(title2, durata1, vol1, lux1);
                        volume(multimedia[i]);
                        luce(multimedia[i]);

                        multimedia[i].playVideo();
                        break;

                    default:
                        System.out.println("non è possibile visualizzare questo tipo di file");
                        break;


                }
            } else {
                System.out.println("Exit");
                break;
            }
        }
        scan.close();

    }
}