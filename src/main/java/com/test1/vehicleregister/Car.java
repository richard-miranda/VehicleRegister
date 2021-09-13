package com.test1.vehicleregister;

import java.time.Year;

/**
 * Class that determines what will be the attributes of the car class
 * @author Richard
 */
public class Car {
    
    private String carBrand, carModel, carOwnerName, ownerEmail;
    private long codeRenavam, ownerPhone;
    private Year carYear;

    /**
     * @return the carBrand
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * @param carBrand the carBrand to set
     */
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    /**
     * @return the carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * @return the carOwner
     */
    public String getCarOwner() {
        return carOwnerName;
    }

    /**
     * @param carOwner the carOwner to set
     */
    public void setCarOwner(String carOwner) {
        this.carOwnerName = carOwner;
    }

    /**
     * @return the ownerEmail
     */
    public String getOwnerEmail() {
        return ownerEmail;
    }

    /**
     * @param ownerEmail the ownerEmail to set
     */
    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    /**
     * @return the codeRenavam
     */
    public long getCodeRenavam() {
        return codeRenavam;
    }

    /**
     * @param codeRenavam the codeRenavam to set
     */
    public void setCodeRenavam(long codeRenavam) {
        this.codeRenavam = codeRenavam;
    }

    /**
     * @return the ownerPhone
     */
    public long getOwnerPhone() {
        return ownerPhone;
    }

    /**
     * @param ownerPhone the ownerPhone to set
     */
    public void setOwnerPhone(long ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    /**
     * @return the carYear
     */
    public Year getCarYear() {
        return carYear;
    }

    /**
     * @param carYear the carYear to set
     */
    public void setCarYear(Year carYear) {
        this.carYear = carYear;
    }
    /**Method to return in string format all of the class atributtes
     **/
    @Override
    public String toString(){
        return "Name: " + carOwnerName + "Car Model: " + carModel + "Car Brand: " + carBrand 
                + "Car Year: " + carYear + "Owner's Phone: " + ownerPhone + 
                "Owner's Email: " + ownerEmail + "Renavam Code: " + codeRenavam;
    }
    
}
