
package com.motorph.motorph1;
import java.text.DecimalFormat;

public class sssComputation {
    
    Double basePay;
    public Double sssContribution;
    public String formattedSssContribution;
    public sssComputation(Double pBasePay){
        basePay = pBasePay;
        sssContribution = 135.0;
            Double sssCompensation = 3250.0;
            Double SCom = 500.0;
            Double SCon = 22.5;
            Double maxSssCompensation = 24750.0;
            DecimalFormat decimalformat = new DecimalFormat("##,###.##");
            formattedSssContribution = decimalformat.format(sssContribution);
            if (basePay >= sssCompensation){
                while (sssCompensation <= basePay){ 
                    if (sssCompensation > 24750){
                        break;
                    }
                    sssCompensation = sssCompensation + SCom;
                    sssContribution = sssContribution + SCon;
                    formattedSssContribution = decimalformat.format(sssContribution);
                }
            } 
    }
}
