package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String classname = in.next();

        try {
            Class cl = Class.forName(classname);
            Class superCl = cl.getSuperclass();
            int m = cl.getModifiers();
            String mString = Modifier.toString(m);
            System.out.print(mString + " " + "class " + classname);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }
            System.out.println(" {");
            printFields(cl);
            printMethods(cl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getFields();
        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            String modifiers = Modifier.toString(f.getModifiers());
            System.out.println("    " + modifiers + " " + type.getName() + " " + name + ";");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            String modifiers = Modifier.toString(m.getModifiers());
            System.out.print("    " + modifiers + " " + retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

}
