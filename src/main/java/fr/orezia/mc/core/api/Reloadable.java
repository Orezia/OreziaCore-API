package fr.orezia.mc.core.api;

/**
 * Mark class as reloadable, meaning it has store data which may need to be reloaded.
 *
 * @since 1.0
 */
@FunctionalInterface
public interface Reloadable {

  /**
   * Reload stored data.
   */
  void reload();

}
