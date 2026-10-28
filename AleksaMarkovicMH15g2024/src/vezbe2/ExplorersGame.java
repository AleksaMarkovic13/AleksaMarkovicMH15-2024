package vezbe2;

import java.util.Scanner;
public class ExplorersGame {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("dobrodosli u exporers igru");
		System.out.println("unesite vase ime:");
		String name=scanner.next();
		
		System.out.println("gde zelite da idete");
		String destination=scanner.next();
		
		Explorer explorer=new Explorer(name,destination);
		
		System.out.println("IGRA JE POCELA");
		
		while(explorer.isAlive()) {
			
			explorer.explore();
		
		
		if(!explorer.isAlive()) {
			System.out.println("explorer has perished");
			explorer.explorerDied();
			continue;
		}
		if(explorer.getKnowlage()>=100) {
			System.out.println("congratulations u r very lucky");
			break;
			
		}
		System.out.println("After"+explorer.getTurn()+"days of exploration we have the following stats");
		System.out.println("Supplies:"+explorer.getSupplies());
		System.out.println("Knowlage:"+explorer.getKnowlage());
		System.out.println("if u want to continue press 1,otherwise you r going home!");
		int choice=scanner.nextInt();
		
		if(choice==1) continue;
		else break;
		}
		System.out.println("ur final score is"+explorer.getKnowlage());
		scanner.close();
	}
	

}
