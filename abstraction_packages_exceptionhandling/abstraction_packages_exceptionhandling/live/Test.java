package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone sax = new Saxophone();
        sax.play();

        Playable p;

        p = veena;
        p.play();

        p = sax;
        p.play();
    }
}
