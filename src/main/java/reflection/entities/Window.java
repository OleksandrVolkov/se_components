package reflection.entities;

import reflection.annotations.InvokedMethod;

public class Window extends Entity{
    private int left;
    private int right;
    private int bottom;
    private int top;
    private String windowColor;

    public Window(){

    }

    public Window(int left, int right, int bottom, int top, String windowColor) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
        this.top = top;
        this.windowColor = windowColor;
    }

    @InvokedMethod
    public static void displayStaticMethod(){
        System.out.println("STATIC WINDOW METHOD");
    }

    @InvokedMethod
    public void displayInstanceWindowAttributes(){
        System.out.println("Displaying text window attributes");
        System.out.println("\tCoordinates: ");
        System.out.println("\t\t-Top coordinate: " + top);
        System.out.println("\t\t-Left coordinate: " + left);
        System.out.println("\t\t-Right coordinate: " + right);
        System.out.println("\t\t-Bottom coordinate: " + bottom);
        System.out.println("\tWindow color: " + windowColor);
    }


    public void displayWindow(){
        System.out.println("That is window!!!!");
    }


    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getWindowColor() {
        return windowColor;
    }

    public void setWindowColor(String windowColor) {
        this.windowColor = windowColor;
    }

    public void ggeett(int age, String color){

    }

    @Override
    public String toString() {
        return "Window{" +
                "left=" + left +
                ", right=" + right +
                ", bottom=" + bottom +
                ", top=" + top +
                ", windowColor='" + windowColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (left != window.left) return false;
        if (right != window.right) return false;
        if (bottom != window.bottom) return false;
        if (top != window.top) return false;
        return windowColor != null ? windowColor.equals(window.windowColor) : window.windowColor == null;
    }

    @Override
    public int hashCode() {
        int result = left;
        result = 31 * result + right;
        result = 31 * result + bottom;
        result = 31 * result + top;
        result = 31 * result + (windowColor != null ? windowColor.hashCode() : 0);
        return result;
    }
}
