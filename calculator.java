import java.util.*;

class Calculator
{
Scanner sc=new Scanner(System.in);

   public  void addition(){
        System.out.println("Enter a first number ");
        double a=sc.nextInt();
        System.out.println("Enter a  second number");
        double b=sc.nextInt();
        System.out.println(a+b);
    }
    public  void subtraction(){
       System.out.println("Enter a first number ");
        double a=sc.nextInt();
        System.out.println("Enter a  second number");
        double b=sc.nextInt();
        System.out.println(a-b);
    }
  public void multiplication(){
        System.out.println("Enter a first number ");
        double a=sc.nextInt();
        System.out.println("Enter a  second number");
        double b=sc.nextInt();
       System.out.println(a*b);
    }
    public void division(){
        System.out.println("Enter a first number ");
        double a=sc.nextInt();
        System.out.println("Enter a  second number");
        double b=sc.nextInt();
       System.out.println(a/b);
    }
}
 class  Driver{
    public static void main(String[] args){
        Calculator cl=new Calculator();
        Scanner sc=new Scanner(System.in);
        
        boolean isExit=true;
        try {
        do{
              
        System.out.println("Please select your number");
        System.out.println("Enter 1 a number to Addition"); 
  
        System.out.println("Enter a 2 number to Subtraction");
        System.out.println("Enter a 3 number to Maltiplication");
        System.out.println("Enter a 4 number to Divition");
        System.out.println("Enter any key to exit calculetor");
        int number=sc.nextInt(); 
        switch(number){
            case 1:
                cl.addition ();
                break ;
            case 2:
                 cl.subtraction ();
                break ;
            case 3:
                 cl.multiplication ();
                break ;
            case 4:
                 cl.division();
                break ;
            default :
                isExit=false;
                System.out.println("Thanks for use this calculator 😊");
                System.out.println("Exit SuccessFully");
              
        }
      }while(isExit);
      } catch(ArithmeticException e){
              System.out.println("arithmetic exception");
           }
    
    }
}