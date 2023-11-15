package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/*** Handicapped class extends Trolley class has no data fields without super data fields
has 1 Construct
 has 2 method without method from super clas
 ***/
class Handicapped extends Trolley {


 /*** 
 * Construct a default arguments 
 ***/  
    public Handicapped() {
    }

 
   /***
     *ask() method 
     * ask the user about the type of the trolly if he wants normal one 
     * or elctric trolly then return the type and price as string
     * we use Exceptions Handling in choose the number type of the Handicapped 
     *  if user  enter character it will show an error massage
     *@return String type of trolly and price
     **/
    public String ask() {
          Scanner in2 = new Scanner(System.in);
          do {
        try {
            Scanner in3 = new Scanner(System.in);
            System.out.println("choose the number type of Baby cart you want\n1-elctric Trolly\t2-normal Trolly");
            int s = in2.nextInt();
            switch (s) {
                case 1:
                    return typeTrolly = "elctric_Trolly" + ", price = 40.0 SR";
                case 2:
                    return typeTrolly = "normal_Trolly" + ", price = 30.0 SR";
            }
            
        }catch(NullPointerException n)
     {System.err.println("WE HAVE FOUND AN ERROR !!,ADD EMPLOYEE ERORR ");}
        catch(InputMismatchException e){System.err.println("Enter a number please!!");}    
        } while (true);
    }
      
    /***
     *toString() method override from super class Trolley don't take anything 
     *@return the information of trolly such as type, assistent name and date of book
     ***/
    @Override
    public String toString() {
        return " Handicapped Trolly is ready{ type: " + typeTrolly + ", assistent:  " + emp + " " + date;
    }

}
