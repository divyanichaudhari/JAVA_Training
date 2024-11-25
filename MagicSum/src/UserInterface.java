import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the array size");
       int size1=sc.nextInt();
       
       if(size1<1 || size1>5)
       {
           System.out.println(size1+" is an invalid array size");
           return;
       }
      
      
       int[] num1=new int[size1];
        System.out.println("Enter the numbers");
       for(int i=0;i<size1;i++)
       {
          num1[i]=sc.nextInt();
           if(num1[i]<=0 || num1[i]>=100)
           {
               System.out.println(num1[i]+" is an invalid input");
               return;
           }
       }
         
          int[] primeSums =new int[size1];
          int count=0;
           for(int num:num1)
           {
               if(isPrime(num) && isSumOfConsecutivePrime(num))
               {
                   primeSums[count++]=num;
                    
                   }
           }
           if(count >0)
           {
               System.out.println("The sum of prime numbers is ");
               for(int i=0;i<count;i++)
               {
                   System.out.println(primeSums[i]);
               }
           }else
               {
                   System.out.println("The "+size1+" numbers are not sum of prime numbers");
               }
           }
    
       public static boolean isPrime(int num)
       {
           if(num<=1)
           {
               return false;
           }
           for(int i=2;i<num;i++)
           {
               if(num%i==0)
               {
                   return false;
               }
           }
       return true;
          }
      
           
    public static boolean isSumOfConsecutivePrime(int num)
    {
        int sum=0;
        for(int i=2;sum<num;i++)
        {
            if(isPrime(i))
            {
                sum +=i;
                if(sum==num)
                {
                    
                    return true;
                }
            }
        }
        return false;
    
            
                }
            }
    