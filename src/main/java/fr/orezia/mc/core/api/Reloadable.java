package fr.orezia.mc.core.api;

/**
 * Mark class as reloadable, meaning it has store data which may need to be reloaded.
 *
 * @since 1.0 4.0
 */
public interface Reloadable {

  /**
   * Reload stored data.
   */
  void reload();

}
