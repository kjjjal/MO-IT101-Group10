
package com.motorph.motorph1;


public class pagibigComputation {
    public Double pagibigContribution = 0.0;
    Double basePay;

    public pagibigComputation(Double employeeloginBasePay) {   
        basePay = employeeloginBasePay;
        if (basePay >= 1000.0 && basePay <= 1500.00) {
            pagibigContribution = basePay * 0.01;
        } else if (basePay > 1500.0) {
            pagibigContribution = basePay * 0.02;
            if (pagibigContribution > 100){
                pagibigContribution = 100.0;
            }
        } 
        System.out.println(pagibigContribution);
    }
}
