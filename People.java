package lolll;


public class People 
{
    protected String name;
    protected String gender;
    protected int age;
    protected String phoneNum;
    protected String addLine1;
    protected String addLine2;
    protected String addCity;
    protected String addState;
    protected int addPostcode;
    
    public People(String name, String gender, int age, String phoneNum, String addLine1, String addLine2, String addCity, String addState, int addPostcode) 
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNum = phoneNum;
        this.addLine1 = addLine1;
        this.addLine2 = addLine2;
        this.addCity = addCity;
        this.addState = addState;
        this.addPostcode = addPostcode;
    }
    
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
    
//    public Member(String name) 
//    {
//        this.name = name;
//    }
//    
//    public Trainer(String name) 
//    {
//        this.name = name;
//    }
}
