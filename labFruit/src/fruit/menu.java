/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUC THAN
 */
public class menu extends ArrayList<String>{
    public menu(){super();}
    public int getChoice(){
        int i,choice;
        for(i=0;i<this.size();i++)
            System.out.println((i+1) + "." + this.get(i));
        System.out.println("Choose:");
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
