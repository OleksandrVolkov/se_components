package reflection.analyzers;

import reflection.annotations.InvokedMethod;
import reflection.entities.Entity;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Как тестировать методы без возвращаемого значения????

public class MethodInvokationAnalyzer {

    public boolean invokeStaticAnnotatedMethods(Class<?> clazz){
        System.out.println("Invoking STATIC annotated methods");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method: methods){
            int modifiers =  method.getModifiers();
            if(method.isAnnotationPresent(InvokedMethod.class) && Modifier.isStatic(modifiers)) {
                System.out.println("Method name: " + method.getName());
                try {
                    method.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        System.out.println();
        return true;
    }

    public boolean invokeInstanceAnnotatedMethods(Entity entity){
        System.out.println("Invoking INSTANCE annotated methods");
        Method[] methods = entity.getClass().getDeclaredMethods();

        for(Method method: methods){
            int modifiers =  method.getModifiers();
            if(method.isAnnotationPresent(InvokedMethod.class) && !Modifier.isStatic(modifiers)) {
                System.out.println("Method name: " + method.getName());
                try {
                    method.invoke(entity);
                } catch (Exception e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        System.out.println();
        return true;
    }

    //TODO -----
    public List<String> getMethodsDeclaration(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        List<String> methodDeclarations = new ArrayList<>();

        StringBuffer sb;
        for (Method method : methods) {
            sb = new StringBuffer();
            int modifiers = method.getModifiers();
            setModifiersStringValues(sb, modifiers);

            sb.append(method.getReturnType()+" ");
            sb.append(method.getName() + "(");

            setParametersStringValues(sb, method);

            sb.append(")");
            methodDeclarations.add(sb.toString());

        }
        return methodDeclarations;
    }


    public StringBuffer setModifiersStringValues(StringBuffer sb, int modifiers){
        if (Modifier.isAbstract(modifiers))
            sb.append("abstract ");
        if (Modifier.isStatic(modifiers))
            sb.append("static ");
        if (Modifier.isFinal(modifiers))
            sb.append("final ");
        if (Modifier.isInterface(modifiers))
            sb.append("interface ");
        if (Modifier.isPrivate(modifiers))
            sb.append("private ");
        if (Modifier.isProtected(modifiers))
            sb.append("protected ");
        if (Modifier.isPublic(modifiers))
            sb.append("public ");
        return sb;
    }

    public StringBuffer setParametersStringValues(StringBuffer sb, Method method){
        List<Parameter> parameters = Arrays.asList(method.getParameters());
        for(int i = 0; i < parameters.size(); i++){
            sb.append(parameters.get(i).getType());
            if(!(i == parameters.size() - 1))
                sb.append(", ");
        }
        return sb;
    }

    public String getSuperclassName(Class<?> clazz){
        return clazz.getSuperclass().getName();
    }
}




























//    public void displayNeededData(Class<?> clazz){
//        Method[] methods = clazz.getDeclaredMethods();
//
//        for(Method method: methods){
//            int modifiers =  method.getModifiers();
//
//            if(Modifier.isAbstract(modifiers))
//                System.out.print("abstract ");
//            if(Modifier.isStatic(modifiers))
//                System.out.print("static ");
//            if(Modifier.isFinal(modifiers))
//                System.out.print("final ");
//            if(Modifier.isInterface(modifiers))
//                System.out.print("interface ");
//            if(Modifier.isPrivate(modifiers))
//                System.out.print("private ");
//            if(Modifier.isProtected(modifiers))
//                System.out.print("protected ");
//            if(Modifier.isPublic(modifiers))
//                System.out.print("public ");
//
//            System.out.println(method.getName());
//
//            List<Parameter> parameterList = Arrays.asList(method.getParameters());
//            if(!parameterList.isEmpty()){
//                System.out.println("\tParameters: ");
//                for(Parameter parameter: parameterList)
//                    System.out.println("\t\t" + parameter.getType() + "!! ");
//            }
//        }
//        System.out.println();
//
//        System.out.println();
//        System.out.println("Superclass: " + clazz.getSuperclass().getName());
//    }