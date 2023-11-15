/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author الكمبيوتر
 */

    
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

    /**
     *Payment class has 4 data fields CardName, ExpirationDatemonth, ExpirationDateyear and CreditCardNum 
     * has 2 constructors  
     *has 9 method 
     **/
public class Payment {

    private String CardName;
    private int ExpirationDatemonth;
    private int ExpirationDateyear;
    private long CreditCardNum;

    /***
     *Construct a default arguments
    ***/
    public Payment() {
    }

     /***
     *Construct arguments with the CardName, ExpirationDatemonth, CreditCardNum and ExpirationDateyear
    ***/
    public Payment(String CardName, int ExpirationDatemonth, long CreditCardNum,int ExpirationDateyear) {
        this.CardName = CardName;
        this.ExpirationDatemonth = ExpirationDatemonth;
        this.ExpirationDateyear = ExpirationDateyear;
        this.CreditCardNum = CreditCardNum;

    }

    /**
     * setCardName() 
     * @param CardName take String CardName and store it in CardName
    **/
     
    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

     /***
     * setExpirationDatemonth() 
     * @param ExpirationDatemonth take int ExpirationDatemonth and store it as ExpirationDatemonth
     */
    public void setExpirationDatemonth(int ExpirationDatemonth) {
        this.ExpirationDatemonth = ExpirationDatemonth;
    }

     /***
     *setCreditCardNum() method take long CreditCardNum and store it in CreditCardNum 
     * @param CreditCardNum 
     */
    public void setCreditCardNum(long CreditCardNum) {
        this.CreditCardNum = CreditCardNum;
    }
    
     /***
     *setExpirationDateyear() 
     * @param ExpirationDateyear  method take int ExpirationDateyear and store it in ExpirationDateyear
     */
    public void setExpirationDateyear(int ExpirationDateyear) {
        this.ExpirationDateyear = ExpirationDateyear;
    }

     /***
     *ask() method don't take anything and don't return
     *use scanner to take String card name, long card number, int Date month and int Date year from user and do set for all
     * we use Exceptions Handling in enter card number,Date month and Date year because maybe the user enter Character 
    ***/
    public void ask() {
        try{
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your credit card information\n please enter your card name: ");
        String CardName = in.nextLine();
        System.out.println("please enter your credit card number:  ");
        long CreditCardNum = in.nextLong();
        System.out.println("please enter expiration Date month: ");
        int ExpirationDatemonth = in.nextInt();
        System.out.println("please enter expiration Date year: ");
        int ExpirationDateyear = in.nextInt();
        System.out.println("");
        setCardName(CardName);
        setExpirationDatemonth(ExpirationDatemonth);
        setExpirationDateyear(ExpirationDateyear);
        setCreditCardNum(CreditCardNum);
}catch(InputMismatchException n){System.err.println("Enter a number please!!");}
    }

}
