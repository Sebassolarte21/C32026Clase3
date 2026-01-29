/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_evaluada_1_sebastian_solarte;

import javax.swing.JOptionPane;

/**
 *
 * @author ssola
 */
public class PRACTICA_EVALUADA_1_Sebastian_Solarte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String NombreDeArticulo;
        int CodigoDeCategoria;
        int ValorCif;
        double Iva = 0.13;
        double peso;
        double Total;
        NombreDeArticulo = JOptionPane.showInputDialog(null, "Digite el nombre del articulo:");
        Iva = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el monto: "));
        Iva = Iva * 0.13;
        peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el peso: "));
        
        if (peso >= 500)
            peso = 20;
        else
            peso = 0;
        
        JOptionPane.showMessageDialog(null, "Nombre: " + NombreDeArticulo +"\n"+ 
                " $" +peso +"\n"+
                " $"+ Iva);
        
        
        
        
        
        
       
       
                
    }
    
}
