package lolll;


public class Member extends People implements BMI //inheriting abstract class People and interface BMI
{
	private int period;
	private int currentMonth = 0;
	private Record[] record;

    //class constructor
    public Member(String trnName, String trnGender, int trnAge, String trnPhoneNum, String trnAddLine1, String trnAddLine2, String trnAddCity, String trnAddState, int trnAddPostcode, int period) 
    {

    	super (trnName,trnGender,trnAge, trnPhoneNum, trnAddLine1,trnAddLine2, trnAddCity, trnAddState, trnAddPostcode);
    	this.period = period;
    	this.record = new Record[period];	
    }        
    
    //return Record for current month only
    public Record getCurrentRecord()
    {
        return record[currentMonth];
    }
    
    //return the whole Record array
    public Record[] getAllRecord()
    {
        return record;
    }
    
    //creating new Record object and save that object into array
    public void addRecord(String date, double weight, double height) {
    	double bmi = this.calcBMI(weight, height);
    	String catBMI = this.bmiCat(bmi);
    	record[currentMonth] = new Record(weight,height,bmi,catBMI,date);
    }
    
    //increment currentMonth value for next input 
    public void incurCurentMonth() {
    	currentMonth++;
    }


	//define body of function from BMI interface
	public double calcBMI(double weight, double height) {
		double bmi = weight / ( height * height);
        return bmi;
	}


	//define body of function from BMI interface
	public String bmiCat(double bmi) {
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



	//define body of function from abstract class People
	public void printInfo() {
	      System.out.println("Username : " + name);
	      System.out.println("Gender(Male/Female) : " + gender);
	      System.out.println("Age : " + age);
	      System.out.println("Phone Number : " + phoneNum);
	      System.out.println("Address Line 1 : " + addLine1);
	      System.out.println("Address Line 2 : " + addLine2);
	      System.out.println("City : " + addCity);
	      System.out.println("State : " + addState);
	      System.out.println("Postcode : " + addPostcode);	
	}
    
    

}
