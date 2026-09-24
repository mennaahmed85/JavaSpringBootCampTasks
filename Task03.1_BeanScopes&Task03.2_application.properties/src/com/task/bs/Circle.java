package com.task.bs;

public class Circle implements Shape {

    private Draw2d draw2dObj;
    private Draw3d draw3dObj;

    public Circle(Draw2d draw2dObj, Draw3d draw3dObj) {
        this.draw2dObj = draw2dObj;
        this.draw3dObj = draw3dObj;
    }

    @Override
    public void draw2d() {
        draw2dObj.draw("Circle");
    }

    @Override
    public void draw3d() {
        draw3dObj.draw("circle");
    }
}

