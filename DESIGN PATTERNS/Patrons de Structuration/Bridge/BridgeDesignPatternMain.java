public class BridgeDesignPatternMain{
    public static void main(String[] args){
        Shape s1 = new Rectangle(new Redcolor());
        s1.colorIt();
        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();
    }
}