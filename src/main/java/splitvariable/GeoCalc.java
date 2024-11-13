package splitvariable;

public class GeoCalc {
    private int _height;
    private int _width;

    public void func(){
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        //….
        temp = _height * _width;
        System.out.println(temp);
    }
}

