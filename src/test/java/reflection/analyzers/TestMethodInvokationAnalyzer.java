package reflection.analyzers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import reflection.entities.Entity;
import reflection.entities.TextWindow;
import reflection.entities.Window;
import reflection.test_data.TestStaticData;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TestMethodInvokationAnalyzer {
    private MethodInvokationAnalyzer analyzer;
    private List<String> expectedWindowMethodDeclarationResult;
    private List<String> expectedWindowMethodModifiersResult;
    private List<String> expectedWindowMethodParametersResult;
    private Window window;

    @Before
    public void init(){
        analyzer = new MethodInvokationAnalyzer();
        expectedWindowMethodDeclarationResult = TestStaticData.getExpectedMethodDeclarationResult();
        expectedWindowMethodModifiersResult = TestStaticData.getExpectedMethodModifiersResult();
        expectedWindowMethodParametersResult = TestStaticData.getExpectedMethodParametersResult();
        window = new Window(1,2,3,4,"blue");
    }

    @Test
    public void testGetMethodsDeclaration(){
        assertTrue(checkWhetherListsIdentical(expectedWindowMethodDeclarationResult, analyzer.getMethodsDeclaration(Window.class)));
    }

    @Test
    public void testSetModifiersStringValues(){
        Method[] methods = Window.class.getDeclaredMethods();
        List<String> actual = new ArrayList<>();
        for(Method method: methods) {
            int modifiers = method.getModifiers();
            StringBuffer sb = analyzer.setModifiersStringValues(new StringBuffer(), modifiers);
            actual.add(sb.toString().trim());
        }
        assertTrue(checkWhetherListsIdentical(actual, expectedWindowMethodModifiersResult));
    }

    private boolean checkWhetherListsIdentical(List<String> list1, List<String> list2){
        for(int i = 0; i < list1.size(); i++)
            if(!list2.contains(list1.get(i)))
                return false;
        return true;
    }

    @Test
    public void testInvokeStaticAnnotatedMethods(){
        assertTrue(analyzer.invokeStaticAnnotatedMethods(Window.class));
    }

    @Test
    public void testSetParametersStringValues(){
        Method[] methods = Window.class.getDeclaredMethods();
        List<String> actual = new ArrayList<>();
        for(Method method: methods) {
            StringBuffer sb = analyzer.setParametersStringValues(new StringBuffer(), method);
            if(!sb.toString().equals(""))
                actual.add(sb.toString().trim());
        }
        assertTrue(checkWhetherListsIdentical(actual, expectedWindowMethodParametersResult));
    }

    @Test
    public void testInvokeInstanceAnnotatedMethods(){
//        Window window = new Window(1,2,3,4,"blue");
        assertTrue(analyzer.invokeInstanceAnnotatedMethods(window));
    }

    @Test
    public void testGetSuperclass(){
        assertEquals("reflection.entities.Entity", analyzer.getSuperclassName(Window.class));
        assertEquals("reflection.entities.Window", analyzer.getSuperclassName(TextWindow.class));
    }
}