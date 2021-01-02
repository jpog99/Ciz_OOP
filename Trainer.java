package lolll;


public class Trainer extends People 
{
    
    public Trainer(String trnName, String trnGender, int trnAge, String trnPhoneNum, String trnAddLine1, String trnAddLine2, String trnAddCity, String trnAddState, int trnAddPostcode) 
    {
    	super (trnName,trnGender,trnAge, trnPhoneNum, trnAddLine1,trnAddLine2, trnAddCity, trnAddState, trnAddPostcode);
    	//same as calling People constructor 
    	
    }
    
    public void showTrainerInfo()
    {
            System.out.println("Coach Name : " + name);
            System.out.println("Gender : " + gender);
            System.out.println("Age : " + age);
            System.out.println("Phone Number  : " + phoneNum);
            System.out.println("Address Line 1 : " + addLine1);
            System.out.println("Address Line 2 : " + addLine2);
            System.out.println("City : " + addCity);
            System.out.println("State : " + addState);
            System.out.println("Postcode : " + addPostcode);
        
    }
    
    public String getName() {
    	return name;
    }
}
