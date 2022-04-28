package ghTest01;

public class Main {

	public static void main(String[] args) {
		
		Teacher2 t1 = new Teacher2();
		Student s1 = new Student();		
		
		s1.name = "Al-Raffy Sarip";
		s1.idNumber = "2020-0509";
		
		t1.name = "Yassin Mohammad";
		t1.idNumber = "2020-0069";
		
		System.out.println("Student's Name: " + s1.idNumber + " " + s1.name);
		System.out.println("Teacher's Name: " + t1.idNumber + " " + t1.name);

	}

}
