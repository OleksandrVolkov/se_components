package reflection.proxy;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestProxyWindow {
    private ProxyWindow proxyWindow;

    @Before
    public void init(){
        proxyWindow = new ProxyWindow(1,2,3,4, "dassad");
    }

    @Test
    public void setLeft() {
        try {
            proxyWindow.setLeft(100);
            fail("It was supposed to pass this test");
        } catch (Exception e) { }

        assertNotEquals(100, proxyWindow.getLeft());
    }

    @Test
    public void getLeft(){
        int actualLeftCoordinate = proxyWindow.getLeft();
        assertEquals(1, actualLeftCoordinate);
    }

    @Test
    public void setRight() {
        try {
            proxyWindow.setRight(100);
            fail("It was supposed to pass this test");
        } catch (Exception e) {}

        assertNotEquals(100, proxyWindow.getRight());
    }

    @Test
    public void getRight(){
        int actualRightCoordinate = proxyWindow.getRight();
        assertEquals(2, actualRightCoordinate);
    }

    @Test
    public void setBottom() {
        try {
            proxyWindow.setBottom(100);
            fail("It was supposed to pass this test");
        } catch (Exception e) { }

        assertNotEquals(100, proxyWindow.getBottom());
    }

    @Test
    public void getBottom() {
        int actualBottomCoordinate = proxyWindow.getBottom();
        assertEquals(3, actualBottomCoordinate);
    }

    @Test
    public void setTop() {
        try {
            proxyWindow.setTop(100);
            fail("It was supposed to pass this test");
        } catch (Exception e) { }

        assertNotEquals(100, proxyWindow.getTop());
    }

    @Test
    public void getTop() {
        int actualTopCoordinate = proxyWindow.getTop();
        assertEquals(4, actualTopCoordinate);
    }

    @Test
    public void setWindowColor() {
        try {
            proxyWindow.setWindowColor("black");
            fail("It was supposed to pass this test");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotEquals("black", proxyWindow.getWindowColor());
    }

    @Test
    public void getWindowColor() {
        String windowColor = proxyWindow.getWindowColor();

    }
}
