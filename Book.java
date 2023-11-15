package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /***
     *Book interface don't have any data fields
     *no constructors  
     *has 3 abstract method  
     ***/
public interface Book {
      /***
    * addEmp() abstract method don't take anything and return String
    ***/
   public abstract void addEmp();
  /***
    * removeEmp() abstract method don't take and return anything 
    ***/   
   public abstract void removeEmp();
     /***
    * updateEmployee() abstract method don't take and return anything
    ***/
   public abstract void updateEmployee();
   
    /***
    * updateEmployee() abstract method don't take and return anything
    ***/
   public abstract void displayall();
}
