package factory;

/**
 * @author: ylshi@ronglian.com
 * @Date: 2018/12/20 23:03
 * @Description: 设计模式第一式：工厂模式
 */
public class Main {
    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();

        sf.getShape(ShapeFactory.CIRCLE).draw();

        sf.getShape(ShapeFactory.RECTANGLE).draw();

        sf.getShape(ShapeFactory.SQUARE).draw();
    }
}
