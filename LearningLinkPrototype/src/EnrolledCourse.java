
public class EnrolledCourse extends Course {

	private int percentCompleted;
	private int[] moduleGrades;
	private int overallGrade;
	private boolean completed;
		
	public EnrolledCourse() {
		// TODO Auto-generated constructor stub
	}
	
	private int calculatePercentComplete(){
		//TODO determine how to calculate
		return percentCompleted;
	}
	
	public int getPercentCompleted(){
		return percentCompleted;
	}
	
	public int[] getModuleGrades(){
	
		return moduleGrades;
	}
	
	private double calculateOverallGrade(){
		//TODO Add calculation
		return overallGrade;
	}
	
	public double getOverallGrade(){
		return overallGrade;
	}
	
	//private CompletedCourse courseCompleted(){
		
		//Need to see how this works
	//}
}