package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entity identifiable with a technical ID.
 *
 * @since 1.0
 */
public interface IdentifiableWithTechnicalId {


  /**
   * Get the entity's technical ID.
   *
   * @return The technical ID.
   */
  @PublicApi
  @Contract(pure = true)
  String id();

  /**
   * Set the entity's technical ID.
   *
   * @param newId The new technical ID.
   * @return The entity itself.
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  IdentifiableWithTechnicalId id(final @NotNull String newId);

}
