
import java.util.Scanner;
 
public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
    System.out.println("Enter the number of chances");   
    int chance=sc.nextInt();
    
    if(chance<1 || chance>5){
        System.out.println("Your chance "+chance+" is out of range(1-5)");
        return;
    }
   
   
    System.out.println("Enter the numbers");
    int sum=0;
    for(int i=0;i<chance;i++){
        int number=sc.nextInt();
        if(number<=0 || number >=10)
        {
            System.out.println(number+"is an invalid number");
          
        return;
        }
       int num2=sc.nextInt();
    if(num2<=0||num2>=10){
        System.out.println(num2+"is an invalid number");
        return;
    }
    sum=sum+number+num2;
    }
    boolean isPrime=true;
    for(int i=2;i<Math.sqrt(sum);i++){
        if(sum%i==0){
            isPrime=false;
            break;
        }
    }
    if(isPrime){
        System.out.println("The sum"+sum+"is a prime number.You won the game");
    }else{
        System.out.println("The sum"+sum+"is not a prime number.Better luck next time");
    }
    }
}
 