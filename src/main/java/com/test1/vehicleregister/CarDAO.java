package com.test1.vehicleregister;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class that will manipulate the data insert on Car class atributtes
 * @author Richard
 */
public class CarDAO {
    
    private ArrayList<Car> cars = new ArrayList();
    
    /**
     * Method to add the car object into an array.
     * @param c
     **/
    public void addCar(Car c){
        cars.add(c);
        
    }
    /**
     * Method to return the arraylist of cars, it can be called in others classes.
     * @return arraylist of cars
     **/
    public ArrayList<Car> getCarsList(){
        return cars;
    }
    
    /**
    *Method to search for a name and return if exists on the ArrayList
     * @param ownerName
     * @return Car object that contains the owner name specified
    **/
    public ArrayList getOwnerName (String ownerName){
        ArrayList outputOwnerName = new ArrayList();
        for(Car car : cars){
            if(car.getCarOwner().toUpperCase().contains(ownerName.toUpperCase())){
                outputOwnerName.add(car);
            }
        }
        return outputOwnerName;
    }
    
    /**
     * Method to search for a brand name and return if exists
     * @param carBrand
     * @return Car object that contains the brand name specified
     **/
    public ArrayList getCarBrand (String carBrand){
        ArrayList outputBrandName = new ArrayList();
        for(Car car : cars){
            if(car.getCarBrand().toUpperCase().contains(carBrand.toUpperCase())){
                outputBrandName.add(car);
            }
        }
        return outputBrandName;
    }
    
    /**
     * Method to return all the information on the ArrayList
     * @return 
     **/
    public ArrayList<Car> getCars(){
        return cars;
    }
    
    
}
