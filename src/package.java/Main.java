public class Main {

	public static void main(String[] args) {
	   

       StudentGroup studentGroup = new StudentGroup(3);

         Student s1 = new Student();

         s1.setId(1);

         s1.setFullName("name1");

         s1.setBirthDate(new Date("10/08/1994"));

         s1.setAvgMark(90.9);

         Student s2 = new Student();

         s2.setId(1);

         s2.setFullName("name1");

         s2.setBirthDate(new Date("10/03/1994"));

         s2.setAvgMark(80.9);

         Student s3 = new Student();

         s3.setId(1);

         s3.setFullName("name1");

         s3.setBirthDate(new Date("10/02/1994"));

         s3.setAvgMark(78.9);

 

 

         Student st[]= new Student[3];

         st[0]=s1;

         st[1]=s2;

         st[2]=s3;

 

         studentGroup.setStudents(st);

         studentGroup.getStudents();
	
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
