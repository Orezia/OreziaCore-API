package fr.orezia.mc.core.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotate element as part of public API.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD,
    ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PublicApi {

}
