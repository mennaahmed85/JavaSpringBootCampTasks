package ioc;

public class Circle implements Shap {

    @Override
    public void draw(String name) {
        System.out.println("Draw shape : "+name);
    }
}
