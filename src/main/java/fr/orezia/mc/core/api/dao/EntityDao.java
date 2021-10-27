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
   * Retrieve, from persistance, entity matching technical ID.
   *
   * @param id The entity's technical ID use.
   * @return The optional found entity.
   */
  @PublicApi
  @NotNull Optional<T> getById(final int id);


  /**
   * Create entity in persistance.
   *
   * @param object The entity object to create in persistance.
   * @return True if entity is created, false if not.
   */
  @PublicApi
  @NotNull Optional<T> create(final @NotNull T object);


  /**
   * Delete, in persistance, the entity.
   *
   * @param id The entity's id.
   * @return True if entity is deleted, false if not.
   */
  @PublicApi
  boolean delete(final int id);

}
