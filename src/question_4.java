class Shape{
    public void shape()
    {
        System.out.println("This is a shape");
    }
}
class Rectangle extends Shape{
    public void rect()
    {
        System.out.println("This is rectangle");
    }
}
class circle extends Shape{
    public void print_circle(){

    }
}
class square extends Rectangle{
    public  void print_square(){
        System.out.println("Square is a rectangle");
    }
}

class abc{
    public static void main(String[] args){
        square sq = new square();
        sq.shape();
        sq.rect();
    }
}