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
 * @since 1.0
 */
@PublicApi
public interface BusinessEntityDao<T extends IdentifiableWithBusinessId<I>, I extends Serializable> extends Dao<T> {

  /**
   * Check if given business ID exists in persistence.
   *
   * @param businessId The entity's business ID to check.
   * @return True if business ID exists, false if not.
   */
  @PublicApi
  boolean exists(final @NotNull I businessId);

  /**
   * Retrieve, from persistence, entity matching business ID.
   *
   * @param businessId The entity's business ID to use.
   * @return The optional found entity.
   */
  @PublicApi
  @NotNull Optional<T> get(final @NotNull I businessId);

  /**
   * Delete, in persistence, the entity.
   *
   * @param businessId The entity's business ID.
   * @return True if entity is deleted, false if not.
   */
  @PublicApi
  boolean delete(final @NotNull I businessId);

}
