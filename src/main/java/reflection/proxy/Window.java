package reflection.proxy;

public interface Window {
     void setLeft(int left) throws Exception;
     void setRight(int right) throws Exception;
     void setBottom(int bottom) throws Exception;
     void setTop(int top) throws Exception;
     void setWindowColor(String windowColor) throws Exception;

     int getLeft();
     int getRight();
     int getBottom();
     int getTop();
     String getWindowColor();
}
