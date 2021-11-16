package fr.orezia.mc.core.api.dao;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.IdentifiableWithTechnicalId;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/**
 * Dao for entity.
 *
 * @param <T> The entity type.
 * @since 1.0
 */
@PublicApi
public interface EntityDao<T extends IdentifiableWithTechnicalId> extends Dao<T> {

  /**
   * Check if given ID exists in persistence.
   *
   * @param id The entity's ID to check.
   * @return True if ID exists, false if not.
   */
  @PublicApi
  boolean exists(final @NotNull String id);

  /**
   * Retrieve, from persistence, entity matching technical ID.
   *
   * @param id The entity's technical ID use.
   * @return The optional found entity.
   */
  @PublicApi
  @NotNull Optional<T> get(final @NotNull String id);

  /**
   * Delete, in persistence, the entity.
   *
   * @param id The entity's id.
   * @return True if entity is deleted, false if not.
   */
  @PublicApi
  boolean delete(final @NotNull String id);

}
