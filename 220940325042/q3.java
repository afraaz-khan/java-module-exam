
// Q3 : Write a program to create a class named shape. In this class we have three
// sub classes circle, triangle and square, each class has two member function
// named draw () and erase (). Create these using Runtime Polymorphism concepts. 


class Shape{
    void draw(){
        System.out.println("Drawing A Shape of Parent Class Shape");
    }
    void erase(){
        System.out.println("Erasing A Shape of Parent Class Shape");
    }
}

class circle extends Shape{
    void draw(String c){
        System.out.println("Drawing A circle of subclass " + c);
    }
    void erase(String c){
        System.out.println("Erasing A circle of subclass " + c);
    }
}

class triangle extends Shape{
    void draw(String t){
        System.out.println("Drawing A triangle of subclass " + t);
    }
    void erase(String t){
        System.out.println("Erasing A triangle of subclass " + t);
    }
}

class square extends Shape{
    void draw(String s){
        System.out.println("Drawing A square of subclass" + s);
    }
    void erase(String s){
        System.out.println("Erasing A square of subclass square" + s);
    }
}

public class q3 {
    public static void main(String[] args) {
        Shape obj = new Shape();
        circle c = new circle();
        triangle t = new triangle();
        square s = new square();

        System.out.println("Calling functions of Parent Class Shape");
        obj.draw();
        obj.erase();

        System.out.println();
        System.out.println("************************************************");

        System.out.println("Calling Same functions of Child Class Triangle");
        t.draw("Triangle");
        t.erase("Triangle");

        System.out.println();
        System.out.println("************************************************");

        System.out.println("Calling Same functions of Child Class Square");
        s.draw("Square");
        s.erase("Square");

        System.out.println();
        System.out.println("##################################################");
        System.out.println("Incase If i call same function of parent class using the object of child class but without the parameters then it will be calling function of parent class");
        s.draw();
        s.erase();
    }
}
