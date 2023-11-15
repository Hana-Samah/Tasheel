package newpackage;
import java.util.*;

    /***
     *Assistent class extends PInformation class has 1 data fields it's salary 
     * has 3 constructors  
     * has 3 method without method super class 
     ***/
public class Assistent extends PInformation {

   private double salary;
    
      /***
     * Array list datelist of type Date
     */
    public static ArrayList<Assistent> empList = new ArrayList<Assistent>();
    
    /***
     *Construct a default arguments
    ***/
    public Assistent() {
    }
    
    /***
     *Construct arguments with the name, id 
    ***/
    
    public Assistent(String name, int id) {
        setName(name);
        setId(id);
    }
    
    /***
     *Construct arguments with the name, id and salary
    ***/
  public Assistent(String name, long id, double salary) {
        super(name, id);
        this.salary = salary;
    }
  
    
    /***
    * getSalary() method don't take anything and  return double
     * @return the salary
     */

    public double getSalary() {
        return salary;
    }

   
    /***
      *setSalary() method take double salary and give value for salary 
     * @param salary set and store the salary
     */

    public void setSalary(double salary) {
        this.salary = 3000;
    }
    
    
    /***
    * inform() method override from super class PInformation don't take anything and return a String
    *ask manager to enter informtion of the assistent name, id and salary
    * we use Exceptions Handling in enter the Integer because maybe the user enters a Character 
    * @return the information of the assistent 
    */


    @Override
    public String inform() {
       
          Scanner in2 = new Scanner(System.in);

        try{
                Assistent e = new Assistent();    
        System.out.println(" Enter the information assistent that you want to add");
        System.out.println("name:");
        String name = in2.next();
        System.out.println("id:");
        long Id = in2.nextLong();
        e.setName(name);
        e.setId(Id);
        e.setSalary(3000);
        Assistent.empList.add(e);
            }
        catch (InputMismatchException h) {
          System.err.println("Enter a number please!!");}
       return "the assistant has been added";
        
    
    }

    /***
     *toString() method don't take anything 
    * @return the information of the Assistent such as name, id  and the salary of the assistent
    */

    @Override
    public String toString() {
        return super.toString();
    }

}
