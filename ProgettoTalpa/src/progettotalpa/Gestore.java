/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

import java.util.ArrayList;

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

}
