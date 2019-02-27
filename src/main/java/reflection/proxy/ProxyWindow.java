package reflection.proxy;

import reflection.annotations.InvokedMethod;

public class ProxyWindow implements Window {
    private int left;
    private int right;
    private int bottom;
    private int top;
    private String windowColor;
    private RealWindow realWindow;

    public ProxyWindow(){
        realWindow = new RealWindow();
    }

    public ProxyWindow(int left, int right, int bottom, int top, String windowColor) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
        this.top = top;
        this.windowColor = windowColor;
        realWindow = new RealWindow(left, right, bottom, top, windowColor);
    }

//    @InvokedMethod
//    public static void displayStaticMethod(){
//        System.out.println("STATIC WINDOW METHOD");
//    }
//
//    @InvokedMethod
//    public void displayInstanceWindowAttributes(){
//        System.out.println("Displaying text window attributes");
//        System.out.println("\tCoordinates: ");
//        System.out.println("\t\t-Top coordinate: " + top);
//        System.out.println("\t\t-Left coordinate: " + left);
//        System.out.println("\t\t-Right coordinate: " + right);
//        System.out.println("\t\t-Bottom coordinate: " + bottom);
//        System.out.println("\tWindow color: " + windowColor);
//    }




    @Override
    public int getLeft() {
        return realWindow.getLeft();
    }


    @Override
    public void setLeft(int left) throws Exception {
            throw new Exception();
    }

    @Override
    public int getRight() {
        return realWindow.getRight();
    }

    @Override
    public void setRight(int right) throws Exception {
            throw new Exception();
    }

    @Override
    public int getBottom() {
        return realWindow.getBottom();
    }

    @Override
    public void setBottom(int bottom) throws Exception {
            throw new Exception();
    }

    @Override
    public int getTop() {
        return realWindow.getTop();
    }

    @Override
    public void setTop(int top) throws Exception {
            throw new Exception();
    }

    @Override
    public void setWindowColor(String windowColor) throws Exception {
            throw new Exception();
    }

    @Override
    public String getWindowColor() {
        return realWindow.getWindowColor();
    }
}
