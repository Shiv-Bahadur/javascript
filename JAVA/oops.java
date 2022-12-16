import java.util.Scanner;

public class oops {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
       double side1=sc.nextInt();
       double side2=sc.nextInt();
       double heightP=sc.nextInt();
Quadrilateral pr=new Parallelogram(side1,side2,heightP);

System.out.println("Perimeter of Parallelogram is "+pr.getPerimeter()+" and Area of Parallelogram is "+pr.getArea());
       double sideR=sc.nextInt();
       double heightR=sc.nextInt();
Quadrilateral rh=new Rhombus(sideR,heightR);

System.out.println("Perimeter of Rhombus is "+rh.getPerimeter()+" and Area of Rhombus is "+rh.getArea());
       double length=sc.nextInt();
       double breadth=sc.nextInt();
Quadrilateral rec=new Rectangle(length,breadth);

System.out.println("Perimeter of Rectangle is "+rec.getPerimeter()+" and Area of Rectangle is "+rec.getArea());
       double side=sc.nextInt();
Quadrilateral sq=new Square(side);
System.out.println("Perimeter of Square is "+sq.getPerimeter()+" and Area of Parallelogram is "+sq.getArea());
       
    
   
  }  
}
abstract class Quadrilateral {
    double side1;
    double side2;
    double side3;
    double side4;
 
    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }
 
    protected abstract double getArea();
 
    protected double getPerimeter() {
        return (side1+side2+side3+side4);
    }
 }

 class Parallelogram extends Quadrilateral {
    double side1;
    double side2;
    double heightP;
  Parallelogram(double side1,double side2,double heightP){
    super(side1,side2,side1,side2);
    this.side1=side1;
    this.side2=side2;
    this.heightP=heightP;
  }
 
 protected double getArea(){
       return side1*heightP;
    
  }
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
   
    Rhombus(double sideR,double heightR){
        super(sideR, sideR, heightR);
       
    }
  
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    
    Rectangle(double length,double breadth){
        super(length, breadth,breadth);
       
    }
    
  
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    
    Square(double side){
        super(side,side);
       
    }
   
}