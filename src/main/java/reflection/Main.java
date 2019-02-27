package reflection;

import reflection.analyzers.MethodInvokationAnalyzer;
import reflection.entities.TextWindow;
import reflection.entities.Window;

import javax.xml.soap.Text;

public class Main {
    public static void main(String[] args){
        TextWindow textWindow = new TextWindow(12,32,13,12,"Black","Present window","Blue");
        Window window = new Window(51,22,32,11,"Black");
        MethodInvokationAnalyzer analyzer = new MethodInvokationAnalyzer();

//        analyzer.invokeStaticAnnotatedMethods(Window.class);
//        analyzer.invokeInstanceAnnotatedMethods(window);
        for(String i : analyzer.getMethodsDeclaration(Window.class))
            System.out.println(i);


//        analyzer.invokeStaticAnnotatedMethods(TextWindow.class);
//        analyzer.invokeInstanceAnnotatedMethods(textWindow);

//        analyzer.displayNeededData(Window.class);

    }
}
