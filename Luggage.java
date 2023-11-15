package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Scanner;

/*** Luggage class extends Trolley class has no data fields without super data fields
has 1 Construct
 has 2 method without method from super clas
 ***/
 public class Luggage extends Trolley {
    
 /*** 
 * Construct a default arguments 
 ***/ 
    public Luggage() {
    }
    
  /**ask()
     * use a scanner to enter weights form users
     * and retunr a price according to weight if it more than 60 KG return 100 SR 
     * if it less than 60 KG return 50 SR
     * we use Exceptions Handling in enter the weights
     * because maybe the user enters a character instead of the number 
     * if enter character it will show error massage
     * @return String type of the trolly and  its price
     * 
    ***/
     public String ask() {
         Scanner in1 = new Scanner(System.in);
         try {
             System.out.println("Enter all baggage weights");
             double d = in1.nextDouble();
             if (d > 60.0) {
                 return typeTrolly = "big_Trolly" + ", price = 100.0 SR";
             } else {
                 return typeTrolly = "small_Trolly" + ", price = 50.0 SR";
             }
         } catch (NullPointerException n) {
             System.err.println("WE HAVE FOUND AN ERROR !!,ADD EMPLOYEE ERORR ");
         }
         catch(InputMismatchException e){System.err.println("Enter a number please!!");}    

         return null;
     }
     
    /***
     *toString() method override from super class Trolley don't take anything 
     *@return the information of trolly such as type, assistent name and date of book
     ***/
    @Override
    public String toString() {
        return "Luggage Trolly is ready {type: "+typeTrolly+" , assistent:  " + emp +"  "+date+'}';
    }

   
      

   

}

