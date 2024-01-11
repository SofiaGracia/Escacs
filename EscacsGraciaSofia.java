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
        int tauler[][] = new int[FIL + 1][COL + 1];

        //Hi ha que mostrar el tauler i després el menú 
        //Dos fors?
        tauler[FIL][COL] = 0;

        for (int fil = 1; fil <= FIL; fil++) {
            System.out.println("\n");
            for (int col = 1; col <= COL; col++) {
                System.out.print(tauler[fil][col]);

            }
        }

        //Mostrar menú. Farà falta un do while? Abdó ha possat un while
        int menu = Teclat.lligInt("1- Posar una peça\n2- Mostrar els moviments d’una peça\n3- Esborrar moviments\n4- Esborrar tauler\n5- Eixir", 1, 5);

        switch (menu) {
            case 1:
                System.out.println("1- Posar una peça");
                //Demanar opcions
                int opcions = Teclat.lligInt("Demanar tipus de peça (Torre, Alfil, Dama, Rei o Cavall).\n• Demanar coordenades on volem posar eixa peça.\n• Posar la peça en eixes coordenades.", 1, 3);
                
                switch (opcions){
                    case 1:
                        
                    case 2:
                        
                    case 3:
                        
                    default:
                
                }
            case 2:
                System.out.println("2- Mostrar els moviments d’una peça");

            case 3:
                System.out.println("3- Esborrar moviments");

            case 4:
                System.out.println("4- Esborrar tauler");

            case 5:
                System.out.println("5- Eixir");
                break;
            
            default:
                
        }

    }

}
