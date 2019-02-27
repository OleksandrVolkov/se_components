package reflection.proxy;

public class ProxyExample {
    public static void main(String[] args){
         final Window window = new ProxyWindow(1,2,3,4,"BLUE!!");
        try {
            window.setBottom(4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(window.getBottom());
    }
}
