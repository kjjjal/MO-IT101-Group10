
package com.motorph.motorph1;

import java.text.DecimalFormat;

public class pagibigComputation {
    MotorPH mph = new MotorPH();
    public Double pagibigContribution = 0.0;
    Double basePay;

    public pagibigComputation(Double pBasePay) {   
        basePay = pBasePay;
        DecimalFormat decimalformat = new DecimalFormat("##,###.##");
        if (basePay >= 1000.0 && basePay <= 1500.00) {
            pagibigContribution = basePay * 0.01;
        } else if (basePay > 1500.0) {
            pagibigContribution = basePay * 0.01;
            if (pagibigContribution > 100){
                pagibigContribution = 100.0;
            }
        } 
        System.out.println(pagibigContribution);
    }
}
