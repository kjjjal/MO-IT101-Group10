package com.motorph.motorph1;
public class taxComputation {
    Double basePay;
    String formattedTax;
    Double totalContribution;
    public Double tax;
    public taxComputation(Double pBasePay, Double ptotalContribution){
        basePay = pBasePay;
        totalContribution = ptotalContribution;
        tax = 0.0;
        employeelogin emplogin = new employeelogin();
            if (basePay <= 20832.0) {
                tax = 0.0;    
            } else if (basePay > 20832 && basePay <= 33333.0){
                tax = ((basePay - totalContribution)-20833) * 0.2;
            } else if (basePay > 33333.0 && basePay <= 66667.0){
                tax = (((basePay - totalContribution )-33333) * 0.25) + 2500;
            } else if (basePay > 66667.0 && basePay <= 166667.0){
                tax = (((basePay - totalContribution )-33333) * 0.3) + 10833;
            } else if (basePay > 166667.0 && basePay <= 666667.0){
                tax = (((basePay - totalContribution )-66667) * 0.32) + 40833.33;
            } else if (basePay > 666667.0){
                tax = (((basePay - totalContribution )-666667) * 0.35) + 200833.33;
            }
        System.out.println("tax: " + tax);
    }
}
