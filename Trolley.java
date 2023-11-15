package newpackage;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner; 

    /***
     *Trolley class is super calss has 4 data fields emp, date, typeTrolly and trolist
has 1 constructors  
has 10 method  
     ***/
public class Trolley  {
    public Assistent emp;
    public Date date;
    public String typeTrolly;
    
      /***
     * Array list trolist of type Trolley
     ***/
    public static ArrayList<Trolley> trolist = new ArrayList<Trolley>();   
    
   /***
    * constructors no-argomen conostractor
    ***/
    public Trolley() {
    }

     /***
    * getTypeTrolly() method don't take anything and  return String
     * @return the trolly type
     */
    public String getTypeTrolly() {
        return typeTrolly;
    }

    /**
     * /***
      *setTypeTrolly() method take String typeTrolly and save it in typeTrolly 
     * @param typeTrolly set and store the trolly type
     */
    public void setTypeTrolly(String typeTrolly) {
        this.typeTrolly = typeTrolly;
    }
   
    /***
    * getDate() method don't take anything and returns Date date
    * @return the date of the appointment
    */
    public Date getDate() {
        return date;
    }
    /**
    * setDate() method take Date date and save it in date 
     @param date set the date of the appointment
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
 
     /***
     *getEmp() method that return an assestant  
     * @return returns Assistent emp information
     */
    public Assistent getEmp() {
        return emp;
    }
    /**
     * /***
      *setEmp() method take Assistent emp and save it in emp 
     * @param emp object of assestant to save 
     */
    public void setEmp(Assistent emp) {
        this.emp = emp;
    }
    
    /**
     * cancle() 
     * method don't take anything and return String use a scanner to
     * take Integer form users choice index of objec that you want remove 
     * we use Exceptions Handling in enter the number that want remove because maybe the user enters a character instead of the number
     * print massage if remove and if the user enter character it will show massage too
     * @return 
     */
   public String cancle() {
       int c=0;
        Scanner in2 = new Scanner(System.in);
        try {
            Trolley t = new Trolley();
            myAppointments();
            System.out.println("which Appointment you want to cancle? ");
            c = in2.nextInt();
            t.trolist.remove(c);
        } catch (InputMismatchException n) {
            System.err.println("Enter a number please!!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("there is no "+c+" in the list!");
        }
        return "your Appointment has been deleted!!";
    }
    
     /***
     * myAppointments() method don't take and return anything  
     * print all Appointment if there no Appointment it will show massage
    ***/
    public void myAppointments() {
        try{
        if (trolist.isEmpty()) {
            System.out.println("there is no Appointments !! ");
        } else {
            System.out.println("all your Appointments :");
            for (int i = 0; i < trolist.size(); i++) {
                if (trolist.get(i) != null) {
                    System.out.print(i);
                    System.out.print(" " + trolist.get(i) + "\n");
                }
            }
                }
            }catch(IndexOutOfBoundsException e){System.err.print(e);}
            }
        
    
    
    /**
     * /***
    * needs() method take int index and return Assistent
    *ask customer if there need assistent or no 
    * take String form users yes or no 
    * we use Exceptions Handling in enter the String because maybe the user enters a Integer 
    *print Assistent informaion if the user enter yes
     * @param index the index is a index of the assestant we want to call
     * @return the information of the assestant we have called
     */
    public Assistent needs(int index) {
        
         Scanner in1 = new Scanner(System.in);
        try {
            System.out.println("do you need assistent help you?");
            String a = in1.nextLine();
            if (a.equalsIgnoreCase("yes")) {
                for (int j = 0; j < Assistent.empList.size(); j++) {
                    return Assistent.empList.get(index);
                }
            }
        } catch (InputMismatchException n) {
            System.err.println("Enter a number please!!");
        }catch(IndexOutOfBoundsException m){System.err.println("Sorry , all our assestants are out of bounds!");}
        return null;
    }
   
}
