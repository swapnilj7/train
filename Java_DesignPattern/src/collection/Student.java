package collection;

import java.util.Comparator;

public class Student {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
  
    public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

public static Comparator compaire=new Comparator<Student>() {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int studentage1 = o1.getStudentage();
		int studentage2 = o2.getStudentage();
		
		
		return studentage1-studentage2;
	}
	
};

public Comparable cmpbl=new Comparable<Student>() {

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
};
public static Comparator comp=new Comparator<Student>() {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
};
public static Comparator comparename=new Comparator<Student>(){

	@Override
	public int compare(Student o1, Student o2) {
		String studentage1 = o1.getStudentname().toUpperCase();
		String studentage2 = o2.getStudentname().toUpperCase();
		return studentage1.compareTo(studentage2);
		
		//descending order
		//return studentage2.compareTo(studentage1);
	}
	
};
  

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
}