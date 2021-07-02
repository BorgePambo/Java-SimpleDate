package javaapp05;

import java.util.Date;


public class JavaApp05 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date data = new Date();
            
        data.setMonth(7);
        data.setDate(10);
        data.setMonth(11);
        
        System.out.println(data.getTime());
        
        
    }
    
}
