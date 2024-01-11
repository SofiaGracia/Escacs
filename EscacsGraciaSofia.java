/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escacsgraciasofia;

import Teclat.Teclat;

/**
 *
 * @author sofia
 */
public class EscacsGraciaSofia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Preguntar per quantes files i columnes
        int preguntcol = Teclat.lligInt("Quantes columnes vols que tinga el tauler?", 5, 9);
        
        int preguntfil = Teclat.lligInt("Quantes files vols que tinga el tauler?", 5, 9);
        
        final int COL = preguntcol;
        final int FIL = preguntfil;
        
        //Matriu del tauler. Hem posat +1 perque un tauler no comença per 0?
        int tauler[][] = new int [FIL+1][COL+1];
        
        //Hi ha que mostrar el tauler i després el menú 
        //Dos fors?
        
        tauler[FIL][COL] = 0;
        
        for (int fil = 1; fil <= FIL; fil++) {
            System.out.println("\n");
            for (int col = 1; col <= COL; col++) {
                System.out.print(tauler[fil][col]);
                
            }
            
        }
        
        
    }
    
}
