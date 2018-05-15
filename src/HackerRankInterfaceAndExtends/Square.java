package HackerRankInterfaceAndExtends;

/**
 *    This inherits the properties and methods of its superclass, Rectangle.
 **/
class Square extends Rectangle implements Polygon {
    public Square(double side){
        super(side, side);
    }
}

