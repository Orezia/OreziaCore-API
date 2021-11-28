package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.io.Serializable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entity identifiable with a business ID.
 *
 * @param <T> The type of the business ID.
 * @since 1.0
 */
public interface IdentifiableWithBusinessId<T extends Serializable> {


  /**
   * Get the entity's business ID.
   *
   * @return The entity's business ID.
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull T id();

  /**
   * Set the entity's business ID.
   *
   * @param id The entity's business ID.
   * @return The entity itself.
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  @NotNull IdentifiableWithBusinessId<T> id(final @NotNull T id);

}
