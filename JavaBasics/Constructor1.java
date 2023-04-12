package JavaBasics;

public class Constructor1 {
    Constructor1()   //Default constructor it is called by jvm when it is created
    {

    }

    Constructor1(String s, int i)  // parameterised constructor
    {
        String a =s;
        int p = i;
        System.out.println(a + p);
    }
    void run()
    {
        System.out.println("helllo world");
    }

    public static void main(String[] args) {
        Constructor1 ct= new Constructor1();
        Constructor1 c= new Constructor1("Devika", 2307);
    }
}
