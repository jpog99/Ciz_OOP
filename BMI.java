package lolll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BMI 
{
    String bmiCategory;
    
    public double calcBMI(double weight, double height)
    {
        double bmi = weight / ( height * height);
        return bmi;
    }
    
    public String bmiCat(double bmi)
    {
        
        if(bmi < 18.5) 
        {
            return "Underweight";
        }else if (bmi < 25) 
        {
            return "Normal";
        }else if (bmi < 30) 
        {
            return "Overweight";
        }else 
        {
            return "Obese";
        }
    }
}
