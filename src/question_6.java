class Parent
{
    public void parentmethod()
    {
        System.out.println("This is parent class");
    }
}

class Child extends Parent
{
    public void childmethod()
    {
        System.out.println("This is child class");
    }
}

class Main{
    public static void main(String[] args)
    {
        Parent m = new Parent();
        Child n = new Child();
        Parent p= new Child();
     //   m.parentmethod();
     //   n.childmethod();
      //  n.parentmethod();
        p.parentmethod();
    }
}	