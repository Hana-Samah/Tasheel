package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


    /***
     *PInformation class is super and abstract calss has 2 data fields name and id
     *has 2 Construct 
     *has 5 method and 1 abstract method
     ***/
public abstract class PInformation {

    String name;
    long id;

  /*** 
 * Construct a default arguments 
 ***/ 
    public PInformation() {
    }
    
    /***
     * Construct arguments with the name and Id  
    ***/
    public PInformation(String name, long id) {
        this.name = name;
        this.id = id;
    }

  
/**
   * getName() method don't take anything and return String
   * @return String Name of information
   */
    public String getName() {
        return name;
    }
    
 
/**
 * setName() method take String name and save it in name and don't return anything
 * @param name set the Id of information
 */

    public void setName(String name) {
        this.name = name;
    }
    
  
  
 /**
  * getId() method don't take anything and return long
  * @return long id of information
  */
    public long getId() {
        return id;
    }
    
  
/**
     * setId() method take long id and save it in id and don't return anything
     * @param id set the Id of information
     */

    public void setId(long id) {
        this.id = id;
    }
    
 
 /**
   * inform() abstract method 
   * @return String
   */

    public abstract String inform() ;
    
/***
     *toString() method override don't take anything 
    * @return the information name and id 
    */  
    @Override
    public String toString() {
        return "Name: " + name + ", Id: " + id;
    }
}
