package newpackage;


import java.util.InputMismatchException;
import java.util.Scanner;
import newpackage.PInformation;

    /***
     *customer class extends PInformation class has 1 data fields it's phone Number
     * has 2 constructors  
     *has 4 method without method super class 
     ***/

public class customer extends PInformation {
    
    private long phoneNumber;
    
    /***
     *Construct a default arguments
    ***/
    public customer() {
    }
    
    /***
     *Construct arguments with the name, id and phone Number
    ***/
    public customer(String name, long id, long phoneNumber) {
        setPhoneNumber(phoneNumber);
        setName(name);
        setId(id);
    }
    
   /***
     * getphoneNumber() method don't take anything and  return long
     * @return the Phone Number
     */

    public long getphoneNumber() {
        return phoneNumber;
    }
/***
     *setPhoneNumber() method take long phoneNumber and save it in phoneNumber 
     * @param phoneNumber set and store the phone Number
     */

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
/***
    * inform() method override from super class PInformation don't take anything and return a String
    *ask customer to enter informtion name, id and phone number
    * we use Exceptions Handling in enter the Integer because maybe the user enters a Character 
    * @return the information of the customer 
    */

    @Override
    public String inform() {
        Scanner in2 = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Name:");
        String name = in.nextLine();
        setName(name);
        try {
            System.out.println("Id:");
            long id = in2.nextLong();
            setId(id);
        } catch (InputMismatchException n) {
            System.err.println("Enter a number please!!");
        }
        try {
            System.out.println("phone number:");
            long phoneNumber = in.nextLong();
            setPhoneNumber(phoneNumber);

        } catch (InputMismatchException n) {
            System.err.println("Enter a number please!!");
        }
        return "Name: " + name + ", Id: " + id + " phone Number :" + phoneNumber;

    }

   /***
     *toString() method don't take anything 
    * @return the information of the customer such as name, id  and the phone Number of the customer
    */

    @Override
    public String toString() {
        return super.toString() + ", phone number: " + getphoneNumber();
    }
}
