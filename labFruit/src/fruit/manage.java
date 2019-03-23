/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

import java.util.ArrayList;

/**
 *
 * @author CUC THAN
 */
public class manage {
    myTools mt = new myTools();
    ArrayList<fruit> list = new ArrayList<>();
    shoppingCart sp = new shoppingCart();
    public void add()
    {
        String id = mt.getString("Input ID:", "not em");
        String name = mt.getString("Input name:", "not et");
        String origin = mt.getString("Input origin:", "not et");
        int price = mt.getInteger("Input Price:", "not <0", "not format");
        int quantity=mt.getInteger("Input quantity", "not <0", "not format");
        list.add(new fruit(id,name,origin,price,quantity));
        
    }
    public void view()
    {
        sp.show();
    }
    public int search(String find){
        int temp=-1;
        for(int i=0;i<list.size();i++)
            if(list.get(i).getId().equals(find))
                return i;
            
        return temp;
                    
    }
    public void shop(){
        if(list.isEmpty())
            System.out.println("empty");
        else{
            boolean check=true;
            int total=0;
            String cont="";
            String find;
            ArrayList<fruitOrder> temp = new ArrayList<>();
            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i).getId() + list.get(i).getName() + list.get(i).getOrigin() + list.get(i).getPrice());
            do{
                 find= mt.getString("Select :", "not e");
                if(search(find)==-1)
                    System.out.println("No");
                
                System.out.println("You select:" + list.get(search(find)).getName());
                int quantity = mt.getInteger("Please input quantity:", "Not<0", "Not format");
                temp.add(new fruitOrder(list.get(search(find)).getId(), list.get(search(find)).getName(), list.get(search(find)).getOrigin(),list.get(search(find)).getPrice(),quantity));
                cont=mt.getString("Do u want to order now(y/n): ", "Not e");   

               if(cont.equalsIgnoreCase("y")) check=false;
            }while(search(find)!=-1 || check==true);
            
            if(cont.equalsIgnoreCase("y"))
            {
                System.out.println("Product|Quantity|Price|Amount");
                for(int i=0;i<temp.size();i++){
                    System.out.println(temp.get(i).getName() + temp.get(i).getQuantity()  + temp.get(i).getPrice() + temp.get(i).getAmount());
                    total+=temp.get(i).getAmount();
                }
                System.out.println(total);
                String name=mt.getString("Input name", "N");
                addToCart(name,temp);
            }
        }
    }
    public void addToCart(String name, ArrayList<fruitOrder> temp)
    {
        for(int i=0;i<temp.size();i++)
            sp.add(name, temp.get(i));
    }
    
    
}
