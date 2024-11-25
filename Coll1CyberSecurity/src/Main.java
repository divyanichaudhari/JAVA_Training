import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CyberSecurity CS = new CyberSecurity();

        System.out.println("Enter the no. of records to be added");
        int noOfRecords = sc.nextInt();
        sc.nextLine();  
        System.out.println("Enter the record (Analyst Id : cybersecurityType)");
        for (int i = 0; i < noOfRecords; i++) {
            String details = sc.nextLine();
            CS.addCyberSecurity(details);
        }

        System.out.println("Enter the cyberSecurity type to be searched");
        String cyberSecurityType = sc.nextLine();
        int cou = CS.findCountOfAnalysis(cyberSecurityType);

        if (cou == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Count is " + cou);
        }

        System.out.println("Enter the name of the analyst");
        String cst = sc.nextLine();
        List<String> list1 = CS.findIdsOfAnalysist(cst);
        
        if (list1.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List of IDs:");
            for (String v : list1) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
