package factory.impl;

import factory.Shape;

/**
 * @author: ylshi@ronglian.com
 * @Date: 2018/12/20 22:52
 * @Description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
