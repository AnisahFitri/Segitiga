/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author heryanto
 */import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Segitiga[] s;
        s = new Segitiga[3];
     
    for(int i=0; i<3; i++){
        s[i] = new Segitiga();
        System.out.println("Segitiga ");
        System.out.print("Alas     = ");
        s[i].a = scan.nextInt();
        System.out.print("Tinggi   = ");
        s[i].t = scan.nextInt();
        s[i].m = Math.sqrt((s[i].a*s[i].a) + (s[i].t*s[i].t));
        s[i].l = (s[i].a * s[i].t) / 2;
        s[i].kll = s[i].a + s[i].t + s[i].m;
        
        System.out.println("");
    }    
        
        
        System.out.println("Hasil");
        
        for(int i=0; i<3; i++){
        
        System.out.println("Luas     = "+s[i].l);
        System.out.println("Keliling = "+s[i].kll);
        }
    }
    private int a;
    private int t;
    private double m;
    private int l;
    private double kll;
    
}
