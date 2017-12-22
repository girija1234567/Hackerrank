package girija;

public class Student {
	String name;
	int roll;
	Student(String n,int r)
	{
		name=n;
		roll=r;
	}
	 void display()
	{
		System.out.print("my name:"+name);
		System.out.print(" ");
		System.out.println(" and roll:"+roll);
	}

	public static void main(String[] args) {
		Student[] s1=new Student[4];
		s1[0]=new Student("girija",10);
		s1[1]=new Student("geetha",20);
		s1[2]=new Student("chandana",30);
		s1[3]=new Student("chandu",30);
		for(Student s:s1)
		s.display();
		
	}

}
