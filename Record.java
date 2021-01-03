package lolll;

public class Record 
{
    private double weight;
    private double height;
    private double bmi;
    private String bmiCat;
    private String date;
    
    public Record(double weight, double height, double bmi, String bmiCat, String date) 
    {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
        this.bmiCat = bmiCat;
        this.date = date;
    }


    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    
    public double getBMI() {
    	return bmi;
    }
    
    public String getCatBMI() {
        return bmiCat;
    }
    
    public String getDate() {
        return date;
    }

    
}
