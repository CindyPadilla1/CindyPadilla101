//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Test{
    private int _x;

    public Test(){
        System.out.println("in default");
    }
    public Test(int a){
        System.out.println("In n-arg");
        _x = a;
    }
    public void setX(int a){
        _x = a;
    }
    public int getX(){
        return _x;
    }

}
class Test2{

    private int _y;

    public Test2(){
        System.out.println("in default");
    }
    public Test2(int a){
        System.out.println("In n-arg");
        _y = a;
    }
    public void setX(int a){
        _y = a;
    }
    public int getX(){
        return _y;
    }
}
class Stuff<T>{ //templating class
    private T _thing; //tangible thing
    public Stuff(){_thing = null;} //default constructor that is null bc object
    public Stuff(T t){_thing = t;} // n-arg constructor pass in something that looks like thing
    public T getThing(){ return _thing;} //get method
    public void setThing(T t){_thing = t;} //set method
    public void print(){ //  Method to print details about the item in the Stuff box.
        if(_thing != null)
            System.out.println("Type: " + _thing.getClass().getName() + // Print the type (like String, Integer) and the value of _thing.
                ", value: " + _thing);
        else
            System.out.println("null member variable");
    }
}
public class Main {
    public static void main(String[] args) {
//        Test a = new Test();
//        Test2 b = new Test2();
        Stuff<Test> s = new Stuff<Test>(); // Creates a new Stuff box that can hold a Test object.
        s.print();
        s.setThing(new Test(5)); // Puts a new Test object with a value of 5 into the Stuff box.
        s.print();
        System.out.println(s.getThing().getX()); // Gets the Test object from the Stuff box and prints the value 5.
    }
}