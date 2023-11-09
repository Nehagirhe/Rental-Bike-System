package model;



public class BookUser {
	private int sno;
	private String email;
	private String bike;
	private String name;
	private String date;
	private String time;
	
	public BookUser() {
		super();
	}
	
	
//	public BookUser(int sno, String name, String date, String time) {
//		super();
//		this.sno = sno;
//		this.name = name;
//		this.date = date;
//		this.time = time;
//	}


//	public BookUser(String name, String date, String time) {
//		super();
//		this.name = name;
//		this.date = date;
//		this.time = time;
//	}


	public BookUser(String email, String bike, String name, String date, String time) {
		super();
		this.email = email;
		this.bike = bike;
		this.name = name;
		this.date = date;
		this.time = time;
	}
	
	public BookUser(int sno, String email, String bike, String name, String date, String time) {
		super();
		this.sno = sno;
		this.email = email;
		this.bike = bike;
		this.name = name;
		this.date = date;
		this.time = time;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "BookUser [sno=" + sno + ", email=" + email + ", bike=" + bike + ", name=" + name + ", date=" + date
				+ ", time=" + time + "]";
	}
	
	

}
