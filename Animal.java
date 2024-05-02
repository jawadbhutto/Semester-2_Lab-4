class Animal {
String name;
String color;
char gender;

void walk(){
System.out.println(name + " is walking..");
}
void run(){
System.out.println(name + " is running..");
}
void sound(){
System.out.println(name+" is creating sound");
}

Animal(){
}
    Animal(String name, String color, char gender){
this.name = name;
this.color = color;
this.gender = gender;
}

public static void main(String args[]){

Animal cat = new Animal();
cat.name = "Cat 1";
cat.color = "White";
cat.gender = 'M';
System.out.println(cat.name+"\n"+cat.color+"\n"+cat.gender);
System.out.println("\n\n");
Animal cat2 = new Animal("Cat 2","Grey",'M');
cat2.walk();
cat2.run();
cat2.sound();

System.out.println("\n\n");

new Animal("Cat 3","Black",'F').sound();
}

}