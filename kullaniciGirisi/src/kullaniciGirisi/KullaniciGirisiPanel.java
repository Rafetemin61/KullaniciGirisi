package kullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisiPanel {

	public static void main(String[] args) {
		String sys_kul_adı = "ozgenur";
		String parola = "615300";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kullanici Adi :");
		
		String kullanıcı_adı = scan.nextLine();
		
		System.out.println("Parola :");
		
		String kul_parola = scan.nextLine();
		
		
		if( !(sys_kul_adı.equals(kullanıcı_adı)) &&  !(parola.equals(kul_parola))) {
			System.out.println("Kullanici Adi ve Giris Yanlis");
			
		}
		else if ( (sys_kul_adı.equals(kullanıcı_adı)) &&  !(parola.equals(kul_parola))) {
			System.out.println("Parola Yanlis");
		}
		else if ( !(sys_kul_adı.equals(kullanıcı_adı)) &&  (parola.equals(kul_parola))) {
			System.out.println("Kullanici Adi Yanlis");
		}
		else {
             
			System.out.println("Giris Basarili..");
		}
		
	}   
		
	

}
