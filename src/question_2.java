public class question_2 {

abstract class Shape2{
    abstract void RectangleArea(float length , float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);

}

static class Area extends Shape{

    float Area=0;
    void RectangleArea(float length , float breadth)
    {

        Area = length * breadth;
        System.out.println("Area of rectangle is = "+Area);

    }
    void SquareArea(float Side)
    {
        Area = Side * Side;
        System.out.println("Area of Square is= "+Area);
    }
    void CircleArea(float radius)
    {
        Area = (float) ((radius * radius)*3.14);
        System.out.println("Area of Circle is= "+Area);

    }

}
    public static void main(String[] args)
    {
        Area a = new Area();
        a.RectangleArea(6f, 2f);
        a.SquareArea(4);
        a.CircleArea(2);
    }
}

