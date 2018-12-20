package factory;

import factory.impl.Circel;
import factory.impl.Rectangle;
import factory.impl.Square;

/**
 * @author: ylshi@ronglian.com
 * @Date: 2018/12/20 22:56
 * @Description:
 */
public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";

    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circel();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
