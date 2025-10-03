import java.util.Scanner;
public class Final_mock_test01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] cusName= new String[5];
        int[] accNum= new int[5];
        char[] typeOfTrans= new char[5];
        double[] amount= new double[5];

        double withdraw=0;
        int withCount=0;
        int depCount=0;

        for(int i=0; i<5;i++){
            int j=i+1;
            System.out.print("Enter Coustomer "+j+" name: ");
            cusName[i]= input.next();
            System.out.print("Enter Account Number: ");
            accNum[i]= input.nextInt();
            int k=2;
            do{

                System.out.print("Enter Transaction Type: ");
                char type= input.next().charAt(0);
                
                switch (type) {
                    case 'W':
                    case 'w':
                        System.out.print("Enter Amount: ");
                        amount[i]= input.nextDouble();
                        withdraw+=amount[i];
                        typeOfTrans[i]=type;
                        k=2;
                        depCount++;
                        break;
                    case 'D':
                    case 'd':
                        System.out.print("Enter Amount: ");
                        amount[i]= input.nextDouble();
                        typeOfTrans[i]=type;
                        k=2;
                        withCount++;
                        break;
                    default:
                        k=1;
                        System.out.println("Enter the correct type : ");
                        break;
                }
            }while(k==1);
            
        }

        double Total=0;
        for(int j=0; j<5; j++){
            Total+=amount[j];
        }
        
        double DepositAmount=Total-withdraw;
        System.out.println("\nTotal Deposit Amount is : "+DepositAmount);
        System.out.println("Total Withdrawal Amount : "+withdraw);
        System.out.println("count of all deposite transaction is: "+depCount);
        System.out.println("Cont of all withdrawal Transaction is: "+withCount);

        //find the minimum deposit
        double minDep=amount[0];
        int minDepIndex=0;
        for (int k=0; k<5;k++){
            if (minDep>amount[k]){
                minDepIndex=k;
            }
        }
        //find the maximum deposit
        double maxDep=amount[0];
        int maxDepIndex=0;
        for (int k=0; k<5;k++){
            if (maxDep<amount[k]){
                maxDepIndex=k;
            }
        }
        System.out.println("minimum deposite coustomer name is: "+cusName[minDepIndex]);
        System.out.println("Maximum deposite coustomer name is: "+cusName[maxDepIndex]);


    }
}
