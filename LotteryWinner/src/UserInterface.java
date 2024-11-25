import java.util.Scanner;
public class UserInterface 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ticket id");
		String TicketID = sc.nextLine();
		System.out.println("Enter the unlucky code");
		String unluckyCode = sc.nextLine();
		
		int unluckyCount = TicketID.split(unluckyCode,-1).length -1;
		
		if(unluckyCount == 0) {
			System.out.println(TicketID + "is lucky ticket");
		}else if(unluckyCount<3){
			System.out.println(TicketID +"is partially lucky");
		}else {
			System.out.println(TicketID +"is unlucky ticket");
		}
	}
}