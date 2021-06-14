package sample;
/**
 * @author David (1972038)
 */
public class Square extends TwoDimensionalShape {
    private double lengthOfSide;


    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }
    @Override
    public double getArea(){
        return (lengthOfSide*lengthOfSide);
    }
    @Override
    public double getCircumference(){
        return (4*lengthOfSide);
    }
    @Override
    public String toString(){
        return ("Square");
    }
}
