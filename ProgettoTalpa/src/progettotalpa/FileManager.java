/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettotalpa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author sarap
 */
public class FileManager {
    private String csvFile = "record.txt";
    
    public String leggi() throws FileNotFoundException, IOException{
        String rec = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))){
            String line;
            line = reader.readLine();
            rec = line;
        }
        return rec;
    }
    
    public String scrivi(int o) throws IOException{
        FileWriter writer = new FileWriter(csvFile); // sovrascrive il file
        writer.write(""+o);
        writer.close();
        return ""+o;
    }
    
    
}
