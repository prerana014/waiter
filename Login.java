package Hotelmanagement;

public class Login {
	
	

	public static boolean authenticate(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("designlab")&& password.equals("design")) {
			return true;
		}
		return false;
	}
		
	}


