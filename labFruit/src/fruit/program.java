/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author CUC THAN
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu m = new menu();
        manage ma = new manage();
        m.add("create fruit");
        m.add("view");
        m.add("shop");
        m.add("exit");
                
        int choice ;
        do{choice=m.getChoice();
        switch(choice){
            case 1: ma.add(); break;
            case 2: ma.view(); break;
            case 3: ma.shop();break;
        }
        }while(choice>0 && choice <5);
        
        
    }
    
}
