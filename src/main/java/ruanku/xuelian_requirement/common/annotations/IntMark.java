package ruanku.xuelian_requirement.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IntMark
{
    Constraint constraint() default @Constraint;
    boolean autoIncrement() default false;
}