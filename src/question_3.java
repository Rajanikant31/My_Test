abstract class Marks
{
    abstract float getPercentage();
}
class A extends Marks
{
    private float science, english, maths;
    public A(float s, float e, float m)
    {
        science = s;
        english = e;
        maths = m;
    }
    float getPercentage()
    {
        return((science + english + maths)/300 * 100);
    }
}
class B extends Marks{
    private float science, english, maths, history;

    public B(float s, float e, float m, float h)
    {
        science = s;
        english = e;
        maths = m;
        history =h;
    }
    float getPercentage()
    {
        return((science + english + maths + history)/400 * 100);
    }
}
class abstract2{
    public static void main(String[] args){

        A a = new A(99, 89, 66);
        B b = new B(98, 92, 97, 80);

        float g = a.getPercentage();
        float k = b.getPercentage();

        System.out.println("Student A percentage = " + g);
        System.out.println("Student B percentage = " + k);
    }
}