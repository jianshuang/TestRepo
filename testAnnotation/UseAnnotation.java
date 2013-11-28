package testAnnotation;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-28
 * Time: 下午3:23
 * To change this template use File | Settings | File Templates.
 */
public class UseAnnotation {
    @NewAnnotation(comment1 = "hello", comment2 = "world")
    public void func() {
        System.out.println("fun2");
    }
}
