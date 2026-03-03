/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author paolucci.sara
 */
public class Gestore extends Thread{
     private ArrayList<Buca> buche;
    private Giocatore giocatore;
    private boolean inGioco;

    public Gestore(int numeroBuche, Giocatore giocatore) {
        this.giocatore = giocatore;
        this.inGioco = true;
        this.buche = new ArrayList<>();

        for (int i = 0; i < numeroBuche; i++) {
            buche.add(new Buca());
        }
    }
    
     @Override
    public void run() {
        Random rand = new Random();

        while (inGioco) {
            int index = rand.nextInt(buche.size());
            Buca b = buche.get(index);

            if (!b.isOccupata()) {
                Talpa t = new Talpa(b);
                t.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public void colpisci(int index) {
        Buca b = buche.get(index);

        if (b.isOccupata()) {
            giocatore.aumentaPunteggio();
            b.setOccupata(false);
        }
    }

    public ArrayList<Buca> getBuche() {
        return buche;
    }

    public Giocatore getGiocatore() {
        return giocatore;
    }

    public void ferma() {
        inGioco = false;
    }


}
