/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

import java.util.Scanner;

/**
 *
 * @author CUC THAN
 */
public class myTools {
    public String getString(String msg,String warning){
        String result="";
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(msg);
            result = sc.nextLine();
            if(result.trim().isEmpty()){
                System.out.println(warning);
            }
        } while(result.trim().isEmpty());
        return result;
    }
    
    public int getInteger(String msg,String warning1, String warning2)
    {
        int result=0;
        boolean check=true;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println(msg);
                result=Integer.parseInt(sc.nextLine());
                if(result<0)
                    System.out.println(warning1);
                else
                    check=true;
            }catch(NumberFormatException e){
                check=false;
                System.out.println(warning2);
            }
        }while(check=false||result<=0);
        return result;
    }
}
