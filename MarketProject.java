import java.util.Scanner;
class sale{


public static void grocery(){
Scanner input = new Scanner(System.in);
double cost;
double tax = 0.01;
double price;
System.out.println("please enter cost: ");
cost = input.nextDouble();
price = cost + (cost*tax);
System.out.println("the total price is: "+price);
}
public static void cloth(){
Scanner input = new Scanner(System.in);
double cost;
double tax = 0.02;
double price;
System.out.println("please enter cost: ");
cost = input.nextDouble();
price = cost + (cost*tax);
System.out.println("the total price is: "+price);
}
public static void garden(){
Scanner input = new Scanner(System.in);
double cost;
double tax = 0.03;
double price;
System.out.println("please enter cost: ");
cost = input.nextDouble();
price = cost + (cost*tax);
System.out.println("the total price is: "+price);
}
public static void auto(){
Scanner input = new Scanner(System.in);
double cost;
double tax = 0.04;
double price;
System.out.println("please enter cost: ");
cost = input.nextDouble();
price = cost + (cost*tax);
System.out.println("the total price is: "+price);
}


public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the catogary number: ");
System.out.println("Enter 1 : for the grocery");
System.out.println("Enter 2 : for the cloth");
System.out.println("Enter 3 : for the garden");
System.out.println("Enter 4 : for the auto");

System.out.println("Enter your choice: ");

int choice = input.nextInt();
switch (choice){

case 1:
grocery();
break;
case 2:
cloth();
break;
case 3:
garden();
break;
case 4:
auto();
break;

}
}
}

