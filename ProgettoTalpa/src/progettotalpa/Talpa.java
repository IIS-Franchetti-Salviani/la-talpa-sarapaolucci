/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

/**
 *
 * @author paolucci.sara
 */
public class Talpa extends Thread{
    private Buca buca;

    public Talpa(Buca buca) {
        this.buca = buca;
    }

    @Override
    public void run() {
        try {
            buca.setOccupata(true);

            Thread.sleep((int)(Math.random() * 1500) + 500);

            buca.setOccupata(false);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
