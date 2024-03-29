package ruanku.xuelian_requirement.common.annotations;
import ruanku.xuelian_requirement.common.enums.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface OtherTypeMark
{
    Constraint constraint() default @Constraint;
    OtherStaticType type();
}