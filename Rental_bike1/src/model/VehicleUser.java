package model;

public class VehicleUser {
private int srno;
private String vbrand;
private int vprice;
private String vname;
private String mno;
private String descript;

public VehicleUser() {
	super();
}
//
public VehicleUser(String vbrand) {
	super();
	this.vbrand = vbrand;
}
//
//public VehicleUser(int srno, String vbrand) {
//	super();
//	this.srno = srno;
//	this.vbrand = vbrand;
//}

//public VehicleUser(String vname) {
//	super();
//	this.vname = vname;
//}

public VehicleUser(int srno, String vbrand, int vprice, String vname, String mno, String descript) {
	super();
	this.srno = srno;
	this.vbrand = vbrand;
	this.vprice = vprice;
	this.vname = vname;
	this.mno = mno;
	this.descript = descript;
}

//public VehicleUser(String vbrand) {
//	super();
//	this.vbrand = vbrand;
//}

public VehicleUser(String vbrand, int vprice, String vname, String mno, String descript) {
	super();
	this.vbrand = vbrand;
	this.vprice = vprice;
	this.vname = vname;
	this.mno = mno;
	this.descript = descript;
}

public int getSrno() {
	return srno;
}

public void setSrno(int srno) {
	this.srno = srno;
}

public String getVbrand() {
	return vbrand;
}

public void setVbrand(String vbrand) {
	this.vbrand = vbrand;
}

public int getVprice() {
	return vprice;
}

public void setVprice(int vprice) {
	this.vprice = vprice;
}

public String getVname() {
	return vname;
}

public void setVname(String vname) {
	this.vname = vname;
}

public String getMno() {
	return mno;
}

public void setMno(String mno) {
	this.mno = mno;
}

public String getDescript() {
	return descript;
}

public void setDescript(String descript) {
	this.descript = descript;
}

@Override
public String toString() {
	return "VehicleUser [vbrand=" + vbrand + ", vprice=" + vprice + ", vname=" + vname + ", mno=" + mno + ", descript="
			+ descript + "]";
}



}
