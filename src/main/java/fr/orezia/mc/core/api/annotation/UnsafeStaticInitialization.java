package fr.orezia.mc.core.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

/**
 * Indicates that the static field or method is <b>unsafe</b> to use in static initialization
 * context.
 *
 * @since 1.0
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface UnsafeStaticInitialization {

  /**
   * Textual reason when the annotated value could be unsafe to use in static initialization
   * context, for documentation purposes.
   *
   * @return reason
   */
  @NonNls String value() default "";
}
