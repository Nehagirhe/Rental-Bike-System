package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.cj.protocol.Resultset;

//import controller.User;

public class UserDao {
	Connection getConnect() throws ClassNotFoundException, SQLException
	{
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Step 1");
		//step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/project","root","abc123");
		System.out.println("Step 2");
		
		return con;
	}

	public int insert(User u) throws ClassNotFoundException, SQLException {
		
		  Connection con=getConnect();     
		//step 3
		PreparedStatement st=con.prepareStatement("insert into signin_tbl (fname, lname, uemail, upass, ugender,urole) values(?,?,?,?,?,?)");
		st.setString(1, u.getFname());
		st.setString(2, u.getLname());
		st.setString(3, u.getUemail());
		st.setString(4, u.getUpass());
		st.setString(5, u.getUgender());
		st.setString(6, u.getUrole());
		
		System.out.println("Step 3");
		        
		//step4
		int a=st.executeUpdate();// insert update delete 
		System.out.println("Step 4");
		
		//step 5
		con.close();
		System.out.println("Step 5");
		return a;
	}

    public boolean checkuser1(String uemail, String upass) throws ClassNotFoundException, SQLException {
        Connection con = getConnect(); 

        String sql = "SELECT * FROM signin_tbl WHERE uemail=? AND upass=?";
        
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, uemail);
            st.setString(2, upass);

            try (ResultSet rs = st.executeQuery()) {
                boolean a = rs.next(); 
                return a;
            }
        }
    }

	public String checkuser(String uemail, String upass) throws ClassNotFoundException, SQLException {
      Connection con = getConnect(); 

      String sql = "SELECT urole FROM signin_tbl WHERE uemail=? AND upass=?";
      
       PreparedStatement st = con.prepareStatement(sql);
          st.setString(1, uemail);
          st.setString(2, upass);

           ResultSet rs = st.executeQuery();
              String urole =null;
              if(rs.next()){
              urole=rs.getString("urole");
              }
              con.close();
              return urole;
         
      }
 
	
	public ArrayList<User> getAllUser() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
			Connection con=getConnect();
			String sql ="SELECT * FROM signin_tbl";
			PreparedStatement st= con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			ArrayList<User> al=new ArrayList<>();
			while(rs.next()){
				User u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6));
				al.add(u);
			}
			con.close();
			return al;
		
		
	
	}

	public int DeleteUser(int uid) throws ClassNotFoundException, SQLException {
		Connection con=getConnect();
		PreparedStatement st=con.prepareStatement("DELETE FROM signin_tbl WHERE uid=?");
		st.setInt(1, uid);
		int a=st.executeUpdate();
		con.close();
		return a;
	}

	public ArrayList<BrandUser> Brand() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//step 1
		    Connection con=getConnect();
			String sql ="SELECT * FROM btable";
			PreparedStatement st= con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			ArrayList<BrandUser> bl=new ArrayList<>();
			while(rs.next()){
				BrandUser b=new BrandUser(rs.getInt(1),rs.getString(2));
				bl.add(b);
			}
			con.close();
			return bl;
		
		
	
	}
	
	public int addbrand(BrandUser b) throws ClassNotFoundException, SQLException {
		
		Connection con=getConnect();
		     
		//step 3
		PreparedStatement st=con.prepareStatement("insert into btable (Name) values(?)");
		//st.setInt(1, b.getNo());
		st.setString(1, b.getBname());
		
		System.out.println("Step 3");
		        
		//step4
		int a=st.executeUpdate();// insert update delete 
		System.out.println("Step 4");
		
		//step 5
		con.close();
		System.out.println("Step 5");
		return a;
	}


	public int addvehicle(VehicleUser v) throws ClassNotFoundException, SQLException {
		
		Connection con=getConnect();
		PreparedStatement st=con.prepareStatement("insert into vehicle_tbl (Brand,Price,BikeName,ModelNo,Description) values (?,?,?,?,?)");
		st.setString(1, v.getVbrand());
		st.setInt(2, v.getVprice());
		st.setString(3, v.getVname());
		st.setString(4, v.getMno());
		st.setString(5, v.getDescript());
		
		int a=st.executeUpdate();
		con.close();
		return a;	
	}
	

	public ArrayList<VehicleUser> ViewAllVehicle() throws ClassNotFoundException, SQLException {
		 Connection con=getConnect();
			String sql ="SELECT * FROM vehicle_tbl";
			PreparedStatement st= con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			ArrayList<VehicleUser> al2=new ArrayList<>();
			while(rs.next()){
			VehicleUser v=new VehicleUser(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6));
			al2.add(v);
			}
			con.close();
			return al2;
	}

	public int addcontactdata(ContactUser c) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		PreparedStatement st=con.prepareStatement("insert into contact_tbl (Name,Email,Subject,Message) values (?,?,?,?)");
		st.setString(1, c.getCname());
		st.setString(2, c.getCemail());
		st.setString(3, c.getCsub());
		st.setString(4, c.getCmsg());
		int a=st.executeUpdate();
		con.close();
		return a;
	}

//	public int addbooking(BookUser b) throws ClassNotFoundException, SQLException {
//		// TODO Auto-generated method stub
//		Connection con=getConnect();
//		PreparedStatement st=con.prepareStatement("insert into book_tbl (Sno,Email,Bike,Name,Date,Time) values(?,?,?,?,?,?)");
//        st.setInt(1, b.getSno());
//		st.setString(2, b.getEmail());
//        st.setString(3, b.getBike());
//        st.setString(4, b.getName());
//        st.setString(5, b.getDate());
//        st.setString(6, b.getTime());
//        int a=st.executeUpdate();
//        con.close();
//		return a;
//	}
//
	
	public int adbooking(BookUser b) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=getConnect();
		PreparedStatement st=con.prepareStatement("insert into book_tbl (Email,Bike,Name,Date,Time) values (?,?,?,?,?)");
		//st.setInt(1, b.getSno());
		st.setString(1, b.getEmail());
		st.setString(2, b.getBike());
		st.setString(3, b.getName());
		st.setString(4, b.getDate());
		st.setString(5, b.getTime());
		int a=st.executeUpdate();
		con.close();
		return a;
	}

	public ArrayList<BookUser> viewbooking() throws ClassNotFoundException, SQLException {
		Connection con=getConnect();
		String sql ="SELECT * FROM book_tbl";
		PreparedStatement st= con.prepareStatement(sql);
		ResultSet rs=st.executeQuery();
		ArrayList<BookUser> al2=new ArrayList<>();
		while(rs.next()){
		BookUser b=new BookUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
		al2.add(b);
		}
		con.close();
		return al2;
	}

	
	
	
	
//	public ArrayList<BookUser> ViewAllBooking() throws ClassNotFoundException, SQLException {
//			 Connection con=getConnect();
//				String sql ="SELECT * FROM book_tbl";
//				PreparedStatement st= con.prepareStatement(sql);
//				ResultSet rs=st.executeQuery();
//				ArrayList<BookUser> al2=new ArrayList<>();
//				while(rs.next()){
//				BookUser b=new BookUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
//				al2.add(b);
//				}
//				con.close();
//				return al2;
//	}

//	public void readonly(VehicleUser v) throws ClassNotFoundException, SQLException{
//		Connection con = getConnect(); 
//		PreparedStatement st = con.prepareStatement("SELECT BikeName FROM vehicle_tbl WHERE Brand = ?");
//	    System.out.println("Step 3");
//	    st.setString(1, v.getVbrand());
//	    
//	    ResultSet rs = st.executeQuery();
//	    
//	    if (rs.next()) {
//	        v.setVname(rs.getString("BikeName"));
//	        System.out.println("BikeName set to: " + v.getVname()); // Debugging statement
//	    } else {
//	        System.out.println("No matching record found for Brand: " + v.getVbrand()); // Debugging statement
//	    }
	    
	    // Step 5
//	    con.close();
//	    System.out.println("Step 5");
//	}
	
	
	public ArrayList<User> getLimitUser(int start, int total) throws ClassNotFoundException, SQLException {
		Connection con=getConnect();
		 
		 String sql="SELECT * FROM signin_tbl limit "+(start-1)+","+total;
		 PreparedStatement st=con.prepareStatement(sql);
		 
		 ResultSet rs= st.executeQuery();
		 
		 ArrayList<User> ul=new ArrayList<>();
		 
		 while(rs.next())
		 {
			 User u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(6));
		
			 ul.add(u);
		 }
		 
		
		 con.close();
		return ul;
	}

	
	public ArrayList<BookUser> getLimitHistory(int start, int total) throws ClassNotFoundException, SQLException {
		Connection con=getConnect();
		 
		 String sql="SELECT * FROM book_tbl limit "+(start-1)+","+total;
		 PreparedStatement st= con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			ArrayList<BookUser> al2=new ArrayList<>();
			while(rs.next()){
			BookUser b=new BookUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			al2.add(b);
			}
			con.close();
			return al2;
			}



	}
