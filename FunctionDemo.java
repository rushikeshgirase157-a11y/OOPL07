class Calculator {

    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}

class Student {
    String name;
    int age;

    Student(){
        name = "Unknown";
        age = 0;

    }

    Student(String n, int a){
        name = n;
        age = a;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

    void Display(){
        System.out.println("Name:"+name+",Age:" + age);
     }
     Student getStudent(){
        return this;
     }

    
}
     public class FunctionDemo {
    public static void main(String[]args){

        Calculator calc = new Calculator();
        System.out.println("Add two integers:"+ calc.add(5,10));
        System.out.println("Add three integers:"+ calc.add(5,10,15));
        System.out.println("Add two doubles:"+ calc.add(5.5,4.5));

        Student s1 = new Student();
         Student s2 = new Student("Rushikesh",20);
          Student s3 = new Student();

          s1.Display();
          s2.Display();
          s3.Display();

          Student s4 = s2.getStudent();
          System.out.println("Student s4 details (reference to s2):");
          s4.Display();


    }
        
}
