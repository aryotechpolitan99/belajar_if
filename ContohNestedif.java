public class ContohNestedif{
	public static void main(String[] args){
	//username dan password yang diinput user
	String username = "admin"; // 
	String password = "secret";
	
	// proses login
	if(username == "admin"){ // username yang terdaftar
		// username ditemukan
		if(password == "secret"){ // password yang seharusnya benar
			// username ditemukan dan password benar
			System.out.println("berhasil login");
		}
		else{
		// username ditemukan tapi password salah
			System.out.println("Password salah");
		}
	}
	else{
		System.out.println("Username tidak ditemukan");
	}
	}
}