
/*
 * This is a driver class that can be used to create and test objects
 */
public class Driver {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Create a new student
		Student Eli = new Student();
		Eli.setFirstName("Eli");
		Eli.setLastName("Hanna");
		Eli.setEmail("ehanna2@asu.edu");
		
		System.out.println(Eli.getEmail());
		
		
		//Create a new Teacher
		Teacher Sally = new Teacher();
		Sally.setFirstName("Sally");
		Sally.setLastName("Doe");
		Sally.setEmail("sdoe@asu.edu");
		
		Sally.setBio("Dr. Doe has a PhD in Math.");
		
		
		//Create a Prerequisite
		
		Prerequisite CalculusI = new Prerequisite();
		CalculusI.setCourseID("MAT265");
		CalculusI.setGrade(2.0);
		
		
		//Create a Course
		Course CalculusII = new Course();
		CalculusII.setCourseID("MAT266");
		CalculusII.setCourseName("Calculus for Engineers II");
		CalculusII.setCourseHomePage("www.learninglink.com/Calc2");
		CalculusII.setSubject("Mathematics");
		CalculusII.setCourseOverview("Methods of integration, applications of calculus, elements of analytic geometry, improper integrals");
		CalculusII.setPrereq(CalculusI);
		CalculusII.setInstructor(Sally);
		CalculusII.setWhoClassFor("Students who want to learn integrals!");
		CalculusII.setBriefSyllabus("This is the second class in our Calculus for Engineers series.");
		CalculusII.setCourseDifficulty("Hard");
		CalculusII.setCourseTotalHours(200);
		CalculusII.setUserRating(4.5);
		String[] modules = {"Integration", "Taylor Series", "Parametric Curves", "Polar Equations"};
		CalculusII.setModules(modules);
		
		//ASSIGN TEACHER SALLY TO TEACH CALCULUS II
		Course[] SallysCourses = {CalculusII};
		Sally.setCoursesTeaching(SallysCourses); 
		
	
		
		

	}

}
