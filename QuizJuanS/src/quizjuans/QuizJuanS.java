/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizjuans;

import javax.swing.JOptionPane;

/**
 *
 * @author jdsan
 */
public class QuizJuanS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Leer nombre
       String Nombre= JOptionPane.showInputDialog("Ingrese su nombre");
       //Leer apellido
       String Apellido= JOptionPane.showInputDialog("Ingrese su apellido");
       //Leer salario 
       String salarioTexto = JOptionPane.showInputDialog("Ingrese el salario individual:");
      double salarioIndividual = Double.parseDouble(salarioTexto);
       //Monto total a pagar 
       
      //Seguro de Enfermedad y Maternidad (SEM) CCSS al 9.25% del salario. 
      double SEM = salarioIndividual * 0.0925;
      
      // Invalidez, Vejez y Muerte (IVM) CCSS al 5.08% del salario.
      double IVM = salarioIndividual * 0.0508;
      
      /*Impuesto al salario (Gobierno):
0 % Debajo de ₡922.000,00
10%: Sobre el exceso de ₡922.000, hasta ₡1.352.000
15%: Sobre el exceso de ₡1.352.000, hasta ₡2.373.000
20%: Sobre el exceso de ₡2.373.000, Superior*/
      if (salarioIndividual<=922000.00){
            double Impuestos0 = salarioIndividual*0;
            if (salarioIndividual>=1352.000){
                double Impuestos10 = (salarioIndividual-922000.00)*0.01;
                if (salarioIndividual = 2373.000){
                    double Impuestos15 = (salarioIndividual-1352.000)*0.015;
                    if (salarioIndividual>2373.000){
                        double Impuestos20 = (salarioIndividual-1352.000)*0.020;}
//Deducciones
double DED = salarioIndividual * 0.025;
// Salario Total
double salarioTotal = salarioIndividual-SEM-IVM-DED
 
//Print
   JOptionPane.showMessageDialog(null, "El salario es " + suma + "₡ " + salarioTotal);
                    
                    
                
                
            
     
    }
    
}
