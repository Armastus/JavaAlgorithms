package HackerRankInterfaceAndExtends;

class Solution{
    public static void print(Polygon p){
        System.out.println( "A " + p.getClass().getSimpleName() + " has " + p.getNumberOfSides() + " sides." );
        System.out.println( "The perimeter of this shape is: " +  p.getPerimeter() + '\n');
    }

    public static void main(String[] args) {
        Polygon triangle = new Triangle(1, 2, 3);
        print(triangle);

        Polygon rectangle = new Rectangle(2, 3);
        print(rectangle);

        Polygon square = new Square(2);
        print(square);

    }
}
