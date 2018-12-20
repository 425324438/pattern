package factory.impl;

import factory.Shape;

/**
 * @author: ylshi@ronglian.com
 * @Date: 2018/12/20 22:53
 * @Description:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
