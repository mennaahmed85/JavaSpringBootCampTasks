package ioc;

public class Rectangle implements Shap {

    @Override
    public void draw(String name) {
        System.out.println("Draw shape : "+name);
    }
}
