/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalexercise;

/**
 *
 * @author USER
 */
    class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int hourlyPayment;

    public int getHoursWorked(){
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }


    @Override
    public int payment() {
        return getHourlyPayment()*getHoursWorked();
    }
    
}
