package reflection.test_data;

import java.util.*;

public class TestStaticData {
    public static List<String> getExpectedMethodDeclarationResult(){
        return new ArrayList<>(Arrays.asList(
                        "public boolean equals(class java.lang.Object)",
                        "public class java.lang.String toString()",
                        "public int hashCode()",
                        "public void setLeft(int)",
                        "public int getLeft()",
                        "static public void displayStaticMethod()",
                        "public void displayInstanceWindowAttributes()",
                        "public void displayWindow()",
                        "public int getRight()",
                        "public void setRight(int)",
                        "public int getBottom()",
                        "public void setBottom(int)",
                        "public int getTop()",
                        "public void setTop(int)",
                        "public class java.lang.String getWindowColor()",
                        "public void setWindowColor(class java.lang.String)",
                        "public void ggeett(int, class java.lang.String)"

        ));
    }

    public static List<String>  getExpectedMethodModifiersResult(){
        return new ArrayList<>(Arrays.asList(
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "public",
                "static public"
        ));
    }

    public static List<String> getExpectedMethodParametersResult(){
        return new ArrayList<>(Arrays.asList(
                "class java.lang.Object",
                "int",
                "int",
                "int",
                "int",
                "class java.lang.String",
                "int, class java.lang.String"
        ));
    }

}
