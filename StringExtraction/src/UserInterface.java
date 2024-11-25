import java.util.Scanner;

public class UserInterface {
	
	public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the String");
       String s=sc.nextLine();
       System.out.println("Enter First Index");
       int index1=sc.nextInt();
       System.out.println("Enter Second Index");
       int index2=sc.nextInt();
       
       UserInterface ui=new UserInterface();
       System.out.println(ui.extractString(s,index1,index2));
    }
	
	public String extractString(String sentence,int number1,int number2)
    {
        String index=" ";
        try 
        {
            if(number1<0 || number2 >=sentence.length() || number1 > number2)
            {
                throw new Exception();
            
            }
            String sub=sentence.substring(number1,number2);
            index="The output string is "+sub+".";
        } catch(Exception e)
        {
            index="Invalid index position.";
        }
        finally
        {
            index +=" Thanks for using the application.";
        }
    
        return index;
    }

}
