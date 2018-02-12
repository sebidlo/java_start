/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabliczka_mnozenia;

/**
 *
 * @author sebek
 */
public class Tabliczka_mnozenia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int j=1; j<=10;j++)
        {
            if (j % 2 ==0)
                continue;
            for (int i=1; i<=10;i++)
            {
                System.out.print(" "+i*j);

            }
        System.out.println("");
        }
    }
    
}
