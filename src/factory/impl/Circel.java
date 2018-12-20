package factory.impl;

import factory.Shape;

/**
 * @author: ylshi@ronglian.com
 * @Date: 2018/12/20 22:54
 * @Description:
 */
public class Circel implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
