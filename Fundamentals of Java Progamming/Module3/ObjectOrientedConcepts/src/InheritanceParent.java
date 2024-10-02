public class InheritanceParent {

	private String studentID;
	private String studentName;
	private int studentAge;

	protected void setStudentID(String sid) {
		this.studentID = sid;
	}
	protected String getStudentID() {
		return studentID;
	}
	

	protected void setStudentName(String sn) {
		this.studentName = sn;
	}
	protected String getStudentName() {
		return studentName;
	}


	protected void setStudentAge(int sa) {
		this.studentAge = sa;
	}
	protected int getStudentAge() {
		return studentAge;
	}
}