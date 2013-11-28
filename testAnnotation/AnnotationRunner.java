package testAnnotation;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-28
 * Time: 下午3:29
 * To change this template use File | Settings | File Templates.
 */

//user reflection to find Annotation
public class AnnotationRunner {
    public static void runner(Class c) {
        System.out.println(c.getName() + ": ");
        Method[] methods = c.getMethods();   //gain all methods of the class c
        for (Method m : methods) {
            System.out.print(m.getName() + ": ");
            // getAnnotation: look up whether this method use the NewAnnotation
            NewAnnotation annotation = (NewAnnotation) m.getAnnotation(NewAnnotation.class);
            if(annotation != null) {
                System.out.println(annotation.comment1() + " "+ annotation.comment2());
            }else{
                System.out.println( "not use annotation");
            }
        }
    }
    public static void main(String[] args) {
        AnnotationRunner.runner(UseAnnotation.class);
    }
}
