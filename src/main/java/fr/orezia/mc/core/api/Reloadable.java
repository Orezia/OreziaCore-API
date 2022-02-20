package fr.orezia.mc.core.api;

/**
 * Mark class as reloadable, meaning it has ressources which may need to be reloaded.
 *
 * @since 1.0
 */
@FunctionalInterface
public interface Reloadable {

  /**
   * Reloads class's ressources, closes resources before if needed.
   */
  void reload();

}
