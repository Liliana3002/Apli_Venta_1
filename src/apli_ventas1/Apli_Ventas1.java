/*Una empresa que se dedica a la venta de desinfectantes necesita un programa
para gestioanr las factura. En cada factura figura: el código del artículo, 
la cantidad vendida en litros y el precio por litro. 
Se pide 5 facturas introducidas: Factuta total, cantidad en litros vendidos del artículo 1 
y cuántas facturas se emitieorn de más de $600*/
package apli_ventas1;

import javax.swing.JOptionPane;

public class Apli_Ventas1 {

    public static void main(String[] args) {
        //Declaración de variables
        int codigo, litros,LA1=0, conteoM600=0;
        float pL, imF, fT=0; 
        
        //Pedir los datos:
        for (int f=1; f<=5; f++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog ("Artículo N°" +f+ "\nDigite el código:"));
            litros = Integer.parseInt(JOptionPane.showInputDialog ("Artículo N°" +f+ "\nDigite la cantidad en litros:"));
            pL = Float.parseFloat(JOptionPane.showInputDialog ("Artículo N°" +f+ "\nDigite el precio por litro:"));
            
        //Hacer los cálculos:
            imF = (float) litros*pL;//Importe factura
            fT =imF;//Suma de las facturas
            
        //Condición if, si el código es 1
            if (codigo == 1){
                LA1 +=litros;//sumar todos los litros del codigo
            }
            if (imF>600){
                conteoM600++;//Suma de las facturas mayores de 600
            }
        }
        JOptionPane.showMessageDialog(null,"Resumen de ventas:\n"
        +"Total de la factura 1:\n" +fT+
         "\nCantidad de litros vendidos del artículo 1:\n" +LA1+
         "\nCantidad de facturas mayores a $600:\n" +conteoM600);   
    }
    
}
