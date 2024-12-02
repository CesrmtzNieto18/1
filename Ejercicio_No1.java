
import javax.swing.JOptionPane;
import java.util.Scanner;
import sun.util.locale.ParseStatus;
public class Ejercicio_No1 {
    
     public static void main(String args[]){
             Scanner sc = new Scanner (System.in);
             int A=0, B=0, r;
              A=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de A"));
              B=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de B"));
              if(A<B){
               JOptionPane.showMessageDialog(null,B+ " Es mayor que " +A);
                  
              }
              else if(B<A){
                   JOptionPane.showMessageDialog(null,A+ " Es mayor que " +B);
                      
                      }
     }
    
}
