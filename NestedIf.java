public class NestedIf{
	public static void main(String[] args){
		boolean hujan = true;
		boolean adapayung = true;
		
		if(hujan == true){
			// dimana hari itu hujan
			if(adapayung == true){
			// hari hujan dan ada payung
				System.out.println("Boleh keluar rumah karena ada payung");
			else{
			// hari hujan dan tidak ada payung
				System.out.println("Tidak keluar rumah karena tidak ada payung");
			}
		}
		}
		else{
			// dimana hari itu tidak ada hujan
			if(adapayung == true){
			// hari tidak hujan dan ada payung
			System.out.println("Boleh keluar rumah dan boleh bawa payung");
			}
			else{
			// hari tidak hujan dan tidak ada payung
			System.out.println("Boleh keluar rumah meskipun tidak ada payung");
			}
		}
	}
}