import java.util.Scanner;

 class Shape {
 int length;
 int width;
 static double PI = 3.14;

void makeshape (){
length = 1; width = 1;
System.out.println("Shape created");
}
void makeshape(int length,int width){
this.length = length; this.width = width;
System.out.println("Shape created with parameters");
}
void changeshape(int length, int width){
this.length = length; this.width = width;
System.out.println("Shape changed with parameters");
}
int calculateArea(){
return length*width;
}
int calculateArea(int length, int width){
return length*width;
}
double volume(int height, int radius){
double vol = PI*(radius*radius)*height;
return vol;
}

public static void main(String args[]){
Scanner inp = new Scanner(System.in);
Shape shape = new Shape();
System.out.println("Enter length and width");
int length = inp.nextInt();
int width = inp.nextInt();

shape.makeshape(length , width);
System.out.print("Enter height and radius --> ");
int height = inp.nextInt();
int radius = inp.nextInt();
System.out.println(new Shape().volume(height,radius));


}

}