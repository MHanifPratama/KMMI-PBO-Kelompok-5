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
public class SalariedEmployee extends Employee{
    private int salary;


    public int setSalary(int salary){
        return this.salary = salary;
    }

    @Override
    public int payment(){
        return salary;
    }
}
