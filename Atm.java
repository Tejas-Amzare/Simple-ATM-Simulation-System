import java.util.*;
public class Atm {
   
        
        int pin = 1010;
        int balance = 50000;

        public void check_pin(){
            
            System.out.println("Enter a pin -:- ");
            Scanner sc = new Scanner (System.in);
            int Enter_pin =sc.nextInt();

            if(Enter_pin == pin){
                menu();
            }
            else{
                System.out.println("Enter a correct pin -:- ");
            }
        }
        public void menu(){
            System.out.println("Enter your Choice -:- ");
            System.out.println("1. Check A/C Balance -:- ");
            System.out.println("2. Widraw Money -:- ");
            System.out.println("3. Deposit Money -:- ");
            System.out.println("4. Exit -:- ");

            Scanner sc = new Scanner (System.in);
            int opt = sc.nextInt();

            if(opt == 1){
                check_balance();
            }
            else if (opt == 2){
                Widraw_money();
            }
            else if (opt == 3){
                Deposit_money();
            }
            else if (opt == 4){
                Exit();
            }
            else{
                System.out.println("Enter a valid choice -:- ");
            }
           
        }
        
        public void check_balance(){
            System.out.println("Balence "+ balance);
            menu();
        }
        public void Widraw_money(){
            System.out.println("Enter your withdraw Amount -:- ");
            Scanner sc = new Scanner (System.in);
            int amount = sc.nextInt();

            if(amount > balance){
                System.out.println("Insuffeciant Balence");
            }else{
                balance = balance - amount;
                System.out.println("Money widraw successful");
            }
            menu();
        }
        public void Deposit_money(){
            System.out.println("Enter the Deposit Amount -:- ");
            Scanner sc = new Scanner (System.in);
                int amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Money deposit succesfully");
                menu();
            }
            public void Exit(){
                System.out.println("Thank you for using the ATM! Goodbye");
                System.exit(0);
            }
        

        
 
    public static void main (String args []){
         
        Atm obj = new Atm();
        obj.check_pin();
        
    }
}



