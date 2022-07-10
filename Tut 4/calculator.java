import java.util.Scanner;
public class calculator  {
    public static void main (String[] args){
        float result = 0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator is on");
        System.out.printf("Result = %.1f\n", result);
        try{
            do{
                float x = sc.nextFloat();
                op = sc.next().charAt(0);
                if(op != '+' && op != '-' && op != '/' && op != '*' && op != 'q' && op != 'Q'){
                    throw new UnknownOperatorException(op);
                }
                else if (op == 'q' || op == 'Q'){
                    System.out.printf("Final result = %.1f\n", result);
                    System.out.println("End of Program");
                }
                else{
                    switch(op){
                        case '+':
                            result += x;
                            break;
                        case '*':
                            result *= x;
                            break;
                        case '/':
                            result /= x;
                            break;
                        case '-':
                            result -= x;
                            break;
                    }
                    System.out.printf("result %c %.1f = %.1f\n", op, x, result);
                    System.out.printf("updated result = %.1f\n", result);
                }
                
            } while(op != 'q' || op != 'Q');
        }
        catch(UnknownOperatorException e){
            System.out.println(e.getMessage());
            System.out.println("Please reenter:");
            System.out.printf("updated result = %.1f\n", result);
        }
        sc.close();
    }
}
