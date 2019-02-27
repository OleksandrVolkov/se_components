package reflection.proxy;
public class RealWindow implements Window{
    private int left;
    private int right;
    private int bottom;
    private int top;
    private String windowColor;


    public RealWindow(){

    }

    public RealWindow(int left, int right, int bottom, int top, String windowColor) {
        this.left = left;
        this.right = right;
        this.bottom = bottom;
        this.top = top;
        this.windowColor = windowColor;
    }



    @Override
    public int getLeft() {
        return left;
    }

    @Override
    public void setLeft(int left){
        this.left = left;
    }

    @Override
    public int getRight() {
        return right;
    }

    @Override
    public void setRight(int right) {
        this.right = right;
    }

    @Override
    public int getBottom() {
        return bottom;
    }

    @Override
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public int getTop() {
        return top;
    }

    @Override
    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String getWindowColor() {
        return windowColor;
    }

    @Override
    public void setWindowColor(String windowColor){
        this.windowColor = windowColor;
    }

}
