package com.Mankind;

public class Worker  extends  Human{
    private double weekSalary;
    private double workHours;

    public Worker(String firstName, String lastName, double weekSalary, double workHours) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkHours(workHours);
    }

    private void setWeekSalary(double weekSalary) {
        if(weekSalary <=10){
            throw  new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private void setWorkHours(double workHours) {
        if(workHours<1 || workHours>12) {
            throw  new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHours = workHours;
    }

    private  double  getSalayPerHour(){
        return this.weekSalary / (this.workHours*7);
    }



    @Override
    public String toString() {
          return String.format("First Name: %s\nLast Name: %s\nWeek Salary: %.2f\nHours per day: %.2f\nSalary per hour: %.2f\n"
                ,super.getFirstName(),super.getLastName(),this.weekSalary,this.workHours,this.getSalayPerHour());
    }
}
