package lolll;


public class Member extends People
{
	private int period;
	private int currentMonth = 0;
	private Record[] record;
	
	

    
    public Member(String trnName, String trnGender, int trnAge, String trnPhoneNum, String trnAddLine1, String trnAddLine2, String trnAddCity, String trnAddState, int trnAddPostcode, int period) 
    {

    	super (trnName,trnGender,trnAge, trnPhoneNum, trnAddLine1,trnAddLine2, trnAddCity, trnAddState, trnAddPostcode);
    	this.period = period;
    	this.record = new Record[period];	
    }
    
    
    
    public Record getCurrentRecord()
    {
        return record[currentMonth];
    }
    
    public Record[] getAllRecord()
    {
        return record;
    }
    
    public void addRecord(String date, double weight, double height) {
    	//create bmi object and calculate bmi and category
    	BMI bmiObject = new BMI();
    	double bmi = bmiObject.calcBMI(weight, height);
    	String catBMI = bmiObject.bmiCat(bmi); 
    	
    	//save all the data in the record object
    	record[currentMonth] = new Record(weight,height,bmi,catBMI,date);
    }
    
    public void incurCurentMonth() {
    	currentMonth++; //increment currentMonth value for next input 
    }
    
    

}
