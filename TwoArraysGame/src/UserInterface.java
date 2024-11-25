import java.util.Scanner;
                                                                                                
public class UserInterface
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the size for the first array");
      int size1 = scanner.nextInt();
      if (size1 <= 0)
     {
         System.out.println(size1 + " is an invalid array size");
         return;
     }
 
 
     System.out.println("Enter the elements for the first array");
      int[] array1 = new int[size1];
      for (int i = 0; i < size1; i++)
     {
         array1[i] = scanner.nextInt();
     }
 
      
     System.out.println("Enter the size for the second array");
      int size2 = scanner.nextInt();
      if (size2 <= 0)
     {
         System.out.println(size2 + " is an invalid array size");
         return;
     }
 
    
    System.out.println("Enter the elements for the second array");
      int[] array2 = new int[size2];
      for (int i = 0; i < size2; i++)
     {
         array2[i] = scanner.nextInt();
     }
      if (size1 != size2)
      {
         System.out.println("Both array size are not same");
        
     }
 
     
      int[] array3 = new int[size1];
      for (int i = 0; i < size1; i++)
     {
         if (i % 2 == 0)
         {
             array3[i] = array1[i] + array2[i];
         }
         else
         {
            
             array3[i] = array1[i] - array2[i];  
         }
     }
 
      
     System.out.println("The elements of the third array");
      for (int num : array3) {
         System.out.println(num);
     }
     }
   }