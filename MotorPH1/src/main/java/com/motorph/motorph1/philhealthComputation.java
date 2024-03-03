package com.motorph.motorph1;
import java.text.DecimalFormat;

public class philhealthComputation {
    public Double philhealthContribution = 0.0;
    public String formattedPhilhealthContribution;
    public philhealthComputation(Double pbasePay){
        Double basePay = pbasePay;
        philhealthContribution = 0.0;
        DecimalFormat decimalformat = new DecimalFormat("##,###.##");
            if (basePay <= 10000.0){
                philhealthContribution = 300.0;
                formattedPhilhealthContribution = decimalformat.format(philhealthContribution);
            } else if (basePay > 10000.0 && basePay < 60000.0) {
                philhealthContribution = (basePay * 0.03) / 2;
                formattedPhilhealthContribution = decimalformat.format(philhealthContribution);
                System.out.println(formattedPhilhealthContribution);
                                    
            } else if (basePay >= 60000.0) {
                philhealthContribution = 900.0;
                formattedPhilhealthContribution = decimalformat.format(philhealthContribution);
                System.out.println(formattedPhilhealthContribution);
            }
    }
}
