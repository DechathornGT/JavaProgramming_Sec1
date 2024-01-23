
public class PersonalInfo {
	private Person name; 
	private Date bDay;
	private int personID;
	
	//Default Constructor
	PersonalInfo(){
		name = new Person(); //firstName="",lastName=""
		bDay= new Date();	//dMonth = 1, dDay = 1, dYear = 1900
		personID = 0;
	}
	
	//Constructor with parameter
	PersonalInfo(String first,String last,int month,int day,int year,int ID){
		//initialize the object name
		name = new Person(first,last);
		//initialize the object bDay
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	//Method to return the string containing personal information
	public String toString() {
		return "Name: " + name.toString() + "\n" + "Date of birth: "+bDay.toString()+"\n"+"Personal ID: "+personID;
	}
}
