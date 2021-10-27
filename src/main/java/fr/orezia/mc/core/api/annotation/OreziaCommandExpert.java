package fr.orezia.mc.core.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Documentation annotation for command experts.
 *
 * @since 1.0
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@SuppressWarnings("unused")
public @interface OreziaCommandExpert {

  /**
   * Specifies the command's name.
   *
   * @return the command's name
   */
  String name();

  /**
   * Specifies the command's alias.<br /> Default value: "".
   *
   * @return the command's alias.
   * @see OreziaCommand#aliases()
   */
  String alias() default "";

  /**
   * Specifies the command's aliases.<br /> Default value: empty array.
   *
   * @return the command's aliases.
   * @see OreziaCommand#alias()
   */
  String[] aliases() default {};

  /**
   * Specifies the command's usage.<br/><br/>Default value: {@code ""}.
   *
   * @return the command's usage
   */
  @SuppressWarnings("unused")
  String usage() default "";

  /**
   * Specifies the command's permission.<br/><br/>Default value: {@code ""}.
   *
   * @return the command's permission
   */
  String permission() default "";

}
