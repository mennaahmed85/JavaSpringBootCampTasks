package com.task.bs;


public class Square implements Shape {

    private Draw2d draw2dObj;
    private Draw3d draw3dObj;

    public void setDraw2dObj(Draw2d draw2d) {

        this.draw2dObj = draw2d;
    }

    public void setDraw3dObj(Draw3d draw3d) {

        this.draw3dObj = draw3d;
    }

    @Override
    public void draw2d() {
        draw2dObj.draw("square");
    }

    @Override
    public void draw3d() {
        draw3dObj.draw("square");
    }
}
