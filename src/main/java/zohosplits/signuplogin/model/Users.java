package zohosplits.signuplogin.model;

public class Users {
	private String userName;
	private int userID;
	private String emailID;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserID() {
		System.out.println(this.userID);
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
		System.out.println(this.userID);
	}
	public String getEmailID() {
		return emailID;
	}
	public  void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
