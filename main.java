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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Employee[] employee = new Employee[2];
        SalariedEmployee se = new SalariedEmployee();
        HourlyEmployee he = new HourlyEmployee();
        
        se.setSalary(20);
        he.setHoursWorked(2);
        he.setHourlyPayment(6);
        employee[0]= se;
        employee[1]= he;
        
        for(Employee a : employee){
            System.out.println(a.payment());
            
        }
    }
    
}
