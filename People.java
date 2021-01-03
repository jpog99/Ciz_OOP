package lolll;


public abstract class People 
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
    
    //class constructor
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

    //abstract function to be defined in children classes (Member and Trainer)
    public abstract void printInfo();
    
}
