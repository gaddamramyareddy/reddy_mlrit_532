import java.util.Date;

/**
 * Public class Comparable
 * {
	System.out.println"the student details are");
	
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	
	 


	 
	private int id;
	student s= new stduent();	
	int add(int id)
	void add(501);
	setid();
	System.out.println("+the student id is+" +id");
	getid();

	
	


	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private String fullName;
	string add(string name);
	setname();
	system.out.println("+the student full name is+");
	
	string name("Bunny Reddy")
	getname();
	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;
	static int(int year int month int date)
	setyear();
	setmonth();
	setdate();
	System.out.println(" "year" +year+ "month" +month+ "date" +date+")

	/**
	 * student average mark
	 */
	private double avgMark
	{
		double m1,m2;
		avg(m1,m2);
		return avg;
		getavg();

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
