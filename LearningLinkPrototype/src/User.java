/*
 * Arizona State University SER315 Spring A 2017 - Team B
 * General User class. This class is parent to @Student and @Instructor
 */


public class User {

	protected String userID;
	protected String password;
	protected boolean loginStatus;
	protected String firstName;
	protected String lastName;
	protected String email;
	private String inputPassword;
	private String inputUsername;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	protected String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	/*
	 * Validates the user's username and password.
	 * If the username and password are valid, returns TRUE
	 * Otherwise, returns FALSE
	 */
	public boolean validate(String inputUsername, String inputPassword) {
		if(inputPassword.equals(password) && inputUsername.equals(userID)) {
			setLoginStatus(true);
			return true;
		}
		return false;
	}

}
