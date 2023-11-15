  package newpackage;

import java.util.InputMismatchException;
import java.util.Scanner;
 /***
  * class Management extends Assistent class and implements Book interface it has 1 data fields it's employe 
  * has 1 Construct
  * has 7 method
  ***/
public class Management extends Assistent implements Book  {

  public Assistent assistent;
  
   /***
     *Construct a default arguments
    ***/
    public Management() {
    }
    
   /***
    * displayall() method don't take and return anything 
    * display all assistents by using array List method get()
    *  we use Exceptions Handling if the array is empty 
    ***/
 public void displayall(){
     try{
    for(int i = 0; i < Assistent.empList.size(); i++) {   
        System.out.println(i+" "+Assistent.empList.get(i)+" SALARY: "+Assistent.empList.get(i).getSalary());}; 
     }catch(NullPointerException n)
     {System.err.println("WE HAVE FOUND AN ERROR !!");}
     }

  /**
     * removeEmp() method don't take and return anything use scanner to take
     * assistent Index it's removes an assistent out of the Array by useing
     * remove method from Array list methods
     */

    public void removeEmp(){
        try{
        displayall();
         Scanner in2 = new Scanner(System.in);
        System.out.println("Enter the assistent index that you want to remove");
        int i = in2.nextInt();
        Assistent.empList.remove(i);
        System.out.println("assistent number: "+i+" Has been removed.");
    }catch(IndexOutOfBoundsException r){ System.err.println("the assestant number is out of bound!");}
        
    }
    
    
  /**
     * *
     * addEmp() method don't take anything and return string method that add a
     * new assistent to the array list by using add method print String, the
     * name and id of the new assistent and "has been added" stetment
     */

    public void addEmp() {
        
        
        assistent.inform();

  }
 
  /**
     * *
     * updateEmployee() method method don't take and return anything display all
     * assistent first then user choose an index of assisten to updates the
     * informaions of the assistent such name or id the method need another 3
     * method which is a getEmployeetName(), getEmployeetId() and
     * changEmployee() print massege if the update succesfull
   **
     */

     public void updateEmployee() {
         int cho=0;
         try{
            Scanner in3 = new Scanner(System.in);
           Scanner in2 = new Scanner(System.in);
        displayall();
        System.out.println("\n-------Please choose a number-------");
        System.out.println("1-update name\n2-update id ");
         do{
        System.out.println("Enter your chooce: ");
        cho = in2.nextInt();
      
        switch (cho) {
            case 1:
                System.out.println("enter the name you want update : ");
                String n2 = in3.nextLine();
                Assistent oldCName = getEmployeetName(n2);
                Assistent newCName = getEmployeetName(n2);
                if (oldCName == null) {
                    System.out.println("no Assistant with this name!!");
                } else {
                    System.out.println("Enter a new name : ");
                    String newName = in3.nextLine();
                    newCName.setName(newName);
                    changEmployee(newCName, oldCName);
                    System.out.println("update succesfull !!");

                }
                break;

            case 2:
                System.out.println("enter the id : ");
                long nu2 = in3.nextLong();
                Assistent oldCId = getEmployeetId(nu2);
                Assistent newCId =getEmployeetId(nu2);
                if (oldCId == null) {
                    System.out.println("no Assistant with this number!!");
                } else {
                    System.out.println("Enter a new number : ");
                    long newNumbere = in3.nextLong();
                    newCId.setId(newNumbere);
                   changEmployee(newCId, oldCId);
                    System.out.println("update succesfull !!");

                    break;
                }
        }
        } while(!(cho==1||cho==2));
         }catch(InputMismatchException n){System.err.println("please enret a number!");}
    }
     /**
     * getEmployeetName() method take String name and return Assistent it's
     * recevie a name and search or looking for the name if it in the array
     * Assistent list or not by using equals method return object of the
     * Assistent and if it not there ,return null.
     *
     * @param name  name if it in the array or no 
     * @return Assistent co 
     */
  public Assistent getEmployeetName(String name) {
        for (Assistent co : empList) {
            if (co.getName().equals(name)) {
                return co;
            }
        }
        return null;
    }
   
/**
     * *
     * getEmployeetId() method method take long id and return Assistent it's
     * recevie a is and search or looking for the id if it in the array
     * Assistent list or not by using equals method return object of the
     * Assistent and if it not there ,return null.
     * 
     * @param id the id if it in the array or no 
     * @return Assistent co 
     * 
     */

    public Assistent getEmployeetId(long id) {
        for (Assistent co : empList) {
            if (co.getId() == (id)) {
                return co;
            }
        }
        return null;
    }

/**
    * changEmployee() method take 2 object from Assistent and return boolean
     * it's helps to replace the informaions of the Assistent receive two
     * elements first the new informaion secend the old informaion then replace
     * the old by new return true if it worked or false if it doesn't 
     * 
    * @param newemp new Assistent new name and new Id 
    * @param oldemp old Assistent old name and old Id 
    * @return boolean true if it worked or false if it doesn't 
    */

    public boolean changEmployee(Assistent newemp, Assistent oldemp) {
        if (empList.size() > 0) {
            int index = -1;
            for (int i = 0; i < empList.size(); i++) {
                if (empList.get(i).getName().equals(oldemp.getName())) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                empList.get(index).setName(newemp.getName());
                empList.get(index).setId(newemp.getId());
                return true;
            }
        }
        return false;
    }
}    
