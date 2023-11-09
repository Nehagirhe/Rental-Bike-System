package model;

public class ContactUser {
private int sno;
private String cname;
private String cemail;
private String csub;
private String cmsg;

public ContactUser(int sno, String cname, String cemail, String csub, String cmsg) {
	super();
	this.sno = sno;
	this.cname = cname;
	this.cemail = cemail;
	this.csub = csub;
	this.cmsg = cmsg;
}
public ContactUser(String cname, String cemail, String csub, String cmsg) {
	super();
	this.cname = cname;
	this.cemail = cemail;
	this.csub = csub;
	this.cmsg = cmsg;
}
public ContactUser() {
	super();
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getCsub() {
	return csub;
}
public void setCsub(String csub) {
	this.csub = csub;
}
public String getCmsg() {
	return cmsg;
}
public void setCmsg(String cmsg) {
	this.cmsg = cmsg;
}
@Override
public String toString() {
	return "ContactUser [sno=" + sno + ", cname=" + cname + ", cemail=" + cemail + ", csub=" + csub + ", cmsg=" + cmsg
			+ "]";
}

	
}
