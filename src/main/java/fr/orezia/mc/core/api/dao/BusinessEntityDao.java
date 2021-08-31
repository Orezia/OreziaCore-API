package fr.orezia.mc.core.api.dao;

import fr.orezia.mc.core.api.annotation.PublicApi;
import fr.orezia.mc.core.api.entity.IdentifiableWithBusinessId;
import java.io.Serializable;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/**
 * Dao for business entity.
 *
 * @param <T> The business entity type.
 * @param <I> The business ID type.
 * @since 4.0
 */
@PublicApi
public interface BusinessEntityDao<T extends IdentifiableWithBusinessId<I>, I extends Serializable> extends Dao<T> {

  /**
   * Retrieve, from persistance, entity matching business ID.
   *
   * @param businessId The entity's business ID to use.
   * @return The optional found entity.
   */
  @PublicApi
  Optional<T> getByBusinessId(final @NotNull I businessId);


  /**
   * Create entity in persistance.
   *
   * @param object The entity object to create in persistance.
   * @return True if entity is created, false if not.
   */
  @PublicApi
  boolean create(final @NotNull T object);


  /**
   * Delete, in persistance, the entity.
   *
   * @param businessId The entity's business ID.
   * @return True if entity is deleted, false if not.
   */
  @PublicApi
  boolean delete(final @NotNull I businessId);

}
