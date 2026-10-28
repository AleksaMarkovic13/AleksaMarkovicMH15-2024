package vezbe;
import java.util.Scanner;
public class Main {
	
	public static void prvaVezba() {
		
		//int broj=55;
		//System.out.print(broj+"\n");
		//double decimalni=45.5;
		//String tekst="nas prvi string";
		//System.out.println("uneto je:"+broj+decimalni+tekst);
		Scanner sc=new Scanner(System.in);
		System.out.println("unesite broj");
		int unos=sc.nextInt();
		while(unos<0 || unos>20) {
			System.out.println("pogresan unos");
			prvaVezba();
			
		}
		
			
		
		for(int i=0;i<unos;i++) {
			System.out.println(i+1);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		prvaVezba();
		
		
	}
	

}
