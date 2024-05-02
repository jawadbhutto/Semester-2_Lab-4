import java.util.Scanner;
class calculator{
 void add (int a, int b){
System.out.println("Addition : "+(a+b));
}
 void sub (int a, int b){
System.out.println("Subtraction : "+(a-b));
}
 void multi (int a, int b){
System.out.println("Multiplication : "+(a*b));
}
 void division (int a, int b){
System.out.println("Division : "+(a/b));
}

public static void main(String args[]){
Scanner inp = new Scanner(System.in);

calculator newobj = new calculator();

System.out.print("Enter number 1: ");
int num1= inp.nextInt();
System.out.print("Enter number 2: ");
int num2= inp.nextInt();
System.out.print("Enter symbol: ");
char symbol= inp.next().charAt(0);

switch(symbol){
case '+' :
newobj.add(num1,num2);
break;
case '-' :
newobj.sub(num1,num2);
break;
case '*' :
newobj.multi(num1,num2);
break;
case '/' :
newobj.division(num1,num2);
break;
default :
System.out.println("Function not found");
}



}

}