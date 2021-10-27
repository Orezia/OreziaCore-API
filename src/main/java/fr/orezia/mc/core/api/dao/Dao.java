package fr.orezia.mc.core.api.dao;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * Dao.
 *
 * @param <T> The type of handled entity.
 * @since 1.0 4.0
 */
public interface Dao<T> {


  /**
   * Retrieve, from persistance, all entities.
   *
   * @return The list of found entities
   */
  @PublicApi
  @NotNull List<T> getAll();

  /**
   * Update, in persistance, the entity.
   *
   * @param object The new entity value.
   * @return True if entity is updated, false if not.
   */
  @PublicApi
  boolean update(final @NotNull T object);

}
