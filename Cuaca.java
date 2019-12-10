//Belajar IF saja
public class Cuaca{
	public static void main(String[] args){
		/*boolean hujan = true;
		if(hujan == true){ //bisa juga ditulis if(hujan)
			System.out.println("Bawa Payung");
		}
		
// Belajar IF-ELSE
		int nilai = 90;
		if(nilai > 75){
			System.out.println("Anda Lulus");
		}
		else{
			System.out.println("Anda Tidak Lulus");
		}
		
// Belajar IF-ELSE-IF
		boolean ujan = true;
		boolean adapayung = false;
		
		if(ujan == true && adapayung == true){
			System.out.println("Boleh Keluar Rumah");
		}
		else if(ujan == true && adapayung == false){
			System.out.println("Tidak Boleh Keluar Rumah");
		}
		else if(ujan == false && adapayung == true){
			System.out.println("Boleh Keluar Rumah tanpa menggunakan payung");
		}
		else{
			System.out.println("Boleh Keluar Rumah walaupun tidak ada payung");
		}
		*/
		
//latihan Cek Nilai
	try{ //cek proses tipe data
		int InputNilai = Integer.parseInt(args[0]);
		int n = InputNilai;
		
		if(n >= 85 && n<=100){
			System.out.println(n +" Adalah Grade A");
		}
		else if(n >= 75 && n <= 84){
			System.out.println(n +" Adalah Grade B");
		}
		else if(n >= 65 && n <= 74){
			System.out.println(n +" Adalah Grade C");
		}
		else if(n >= 45 && n <= 64){
			System.out.println(n +" Adalah Grade D");
		}
		else if(n >= 0 && n <= 44){
			System.out.println(n +" Adalah Grade E");
		}
		else{
			System.out.println(n +" Data tidak valid max = 100");
		}
	}
	catch(Exception e){ // jika tdk sesuai masuk proses catch
			System.out.println(e.getMessage()); // tampilkan pesan kenapa salah
			System.out.println("Tidak boleh diinput huruf"); 
	}
	}
}
