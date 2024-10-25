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
class Stuff<T>{
    private T _thing; //tangible thing
    public Stuff(){_thing = null;} //default null bc object
    public Stuff(T t){_thing = t;} // pass in something that looks like thing
    public T getThing(){ return _thing;}
    public void setThing(T t){_thing = t;}
    public void print(){
        if(_thing != null)
            System.out.println("Type: " + _thing.getClass().getName() +
                ", value: " + _thing);
        else
            System.out.println("null member variable");
    }
}
public class Main {
    public static void main(String[] args) {
//        Test a = new Test();
//        Test2 b = new Test2();
        Stuff<Test> s = new Stuff<Test>();
        s.print();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX());
    }
}