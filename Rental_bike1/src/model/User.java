package model;

public class User {
 private int uid;	
 private String fname;
 private String lname;
 private String uemail;
 private String upass;
 private String ugender;
 private String urole;
 

 
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}

public User(int uid, String fname, String lname, String uemail, String ugender) {
	super();
	this.uid = uid;
	this.fname = fname;
	this.lname = lname;
	this.uemail = uemail;
	this.ugender = ugender;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
public String getUgender() {
	return ugender;
}
public void setUgender(String ugender) {
	this.ugender = ugender;
}
public String getUrole() {
	return urole;
}
public void setUrole(String urole) {
	this.urole = urole;
}
public User(String fname, String lname, String uemail, String upass, String ugender, String urole) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.uemail = uemail;
	this.upass = upass;
	this.ugender = ugender;
	this.urole = urole;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + ", uemail=" + uemail + ", upass=" + upass + ", ugender="
			+ ugender + ", urole=" + urole + "]";
}
public User(String fname, String lname, String upass, String ugender, String urole) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.upass = upass;
	this.ugender = ugender;
	this.urole = urole;
}
public User(int uid, String fname, String lname, String uemail, String upass, String ugender, String urole) {
	super();
	this.uid = uid;
	this.fname = fname;
	this.lname = lname;
	this.uemail = uemail;
	this.upass = upass;
	this.ugender = ugender;
	this.urole = urole;
}

 
}
