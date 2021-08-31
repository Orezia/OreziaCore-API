package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.io.Serializable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entity identifiable with a business ID.
 *
 * @param <T> The type of the business ID.
 * @since 4.0
 */
public interface IdentifiableWithBusinessId<T extends Serializable> {


  /**
   * Get the entity's business ID.
   *
   * @return The entity's business ID.
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull T businessId();

  /**
   * Set the entity's business ID.
   *
   * @param businessId The entity's business ID.
   * @return The entity itself.
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  @NotNull IdentifiableWithBusinessId<T> businessId(final @NotNull T businessId);

}
