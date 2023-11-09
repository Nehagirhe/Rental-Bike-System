package model;

public class BrandUser {
private int no;
private String bname;
public BrandUser() {
	super();
}


public int getNo() {
	return no;
}
//public BrandUser(String bname) {
//	super();
//	this.bname = bname;
//}
public void setNo(int no) {
	this.no = no;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}


@Override
public String toString() {
	return "BrandUser [no=" + no + ", bname=" + bname + "]";
}

//public BrandUser(String no2, String string) {
//	super();
//	// TODO Auto-generated constructor stub
//}
public BrandUser(String bname) {
	super();
	this.bname = bname;
}
public BrandUser(int no, String bname) {
	super();
	this.no = no;
	this.bname = bname;
}



}
