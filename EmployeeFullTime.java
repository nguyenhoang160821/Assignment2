/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithi01;

/**
 *
 * @author admin
 */
public class EmployeeFullTime extends SalaryPolicy{
private float rate;
    public EmployeeFullTime(){
        this.rate = 4f;
    }
    public EmployeeFullTime(float rate, float baseSalary){
        super(baseSalary);
        this.rate = rate;
    }
    public float getFullSalary(){
        return rate * super.getSalary();
    }
}