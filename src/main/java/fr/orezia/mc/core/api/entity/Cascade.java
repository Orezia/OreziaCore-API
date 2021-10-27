package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Document entity dependency as cascading some action.
 *
 * @since 1.0
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.METHOD})
@PublicApi
public @interface Cascade {

  /**
   * Types of action cascaded.
   *
   * @return The array of cascade type.
   */
  CascadeType[] value();

  /**
   * Document when action is propagate.
   *
   * @return when documentation.
   */
  String when() default "";

  /**
   * Type of cascade.
   */
  enum CascadeType {
    NONE,
    FETCH,
    DELETE,
    CREATE,
    UPDATE,
  }
}
