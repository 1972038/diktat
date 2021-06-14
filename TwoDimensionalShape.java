package sample;
/**
 * @author David (1972038)
 */
public abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public void  ShowDetail(){
        System.out.printf("Area of "+toString()+" is: %.2f",getArea());
        System.out.println();
        System.out.printf("Circumference of "+toString()+" is: %.2f",getCircumference());
        System.out.println();
    }

}
