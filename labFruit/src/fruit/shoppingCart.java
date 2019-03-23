/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;
/**
 *
 * @author CUC THAN
 */
public class shoppingCart {
    Hashtable<String,ArrayList<fruitOrder>> ht = new Hashtable<>();
    
    public void add(String key, fruitOrder value)
    {
        ArrayList<fruitOrder> l ;
        l=ht.get(key);
        if(l.isEmpty())
        {
            l=new ArrayList<>();
            ht.put(key, l);
        }
         l.add(value);
        
    }
    
    public void show()
    {
        Set <String> keySet = ht.keySet();
        for(String key: keySet)
        {
            System.out.println(key );
            for (fruitOrder object : ht.get(key)) {
                System.out.println(object.toString());
            }
        }
    }
}
