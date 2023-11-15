package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * *
 * Baby class extends Trolley class has 1 data fields it's troCap has 1
 * constructors has 4 method without the methods from super class *
 */
public class Baby extends Trolley {

    private String troCap;

    /**
     * *
     * Construct no-argument constructor *
     */
    public Baby() {
    }

    /**
     * *
     * ask() method don't take anything and return String type of trolley and
     * price use a scanner to take Integer form users we use Exceptions Handling
     * in choose the number type of Baby trolley you want because maybe the user
     * enters a character instead of the number print type of trolley and price
     * if user enter Integer if enter character it will show massage error
     *
     * @return *
     */
    public String ask() {
        Scanner in2 = new Scanner(System.in);
        do {
            try {
                System.out.println("choose the number type of Baby trolly you want\n1-singl trolly\t2-double trolly");
                Integer s = in2.nextInt();
                switch (s) {
                    case 1:
                        return typeTrolly = "single_trolly " + ", price = 50.0 SR";
                    case 2:
                        return typeTrolly = "double_trolly" + ", price = 60.0 SR";
                }
            } catch (InputMismatchException n) {
                System.err.println("Enter a number pleace!!");
            }
            catch(NullPointerException n)
     {System.err.println("WE HAVE FOUND AN ERROR !!,ADD EMPLOYEE ERORR ");}
        } while (true);

    }

    /**
     * *
     * getTroCap() method don't take anything and return String troCap
     *
     * @return troCap *
     */
    public String getTroCap() {
        return troCap;
    }

    /**
     * *
     * setTroCap() method take String troCap and save it in troCap and don't
     * return anything  
     * @param troCap
     */
    public void setTroCap(String troCap) {
        this.troCap = troCap;
    }

    /**
     * *
     * toString() method override from super class Trolley don't take anything
     * and return a String print the trolley type, assistant name and date
     *
     **@return
     */
    @Override
    public String toString() {
        return "Baby Trolly is ready {type: " + typeTrolly + ", assistent:  " + emp + "  " + date + '}';
    }

}
