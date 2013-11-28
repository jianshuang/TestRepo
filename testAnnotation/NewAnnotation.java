package testAnnotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-11-28
 * Time: 下午3:19
 * To change this template use File | Settings | File Templates.
 */

@Target(value={METHOD, TYPE, FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME) //RUNTIME表示要被JVM保存的注解，可以利用reflection查询到
public @interface NewAnnotation  {
    String comment1();
    String comment2();
}

