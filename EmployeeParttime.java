/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithijava;

/**
 *
 * @author admin
 */
public class EmployeeParttime extends SalaryPolicy{
    private final double rate;
    public EmployeeParttime(float baseSalary,double rate) {
        super(baseSalary);
        this.rate=2.5;
    }
    public double getSalary(){

        return rate * super.baseSalary;
    }
    public String toString(){
        return "SalaryPolicy{" + "Salary:"+'}';
    }
}




