package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.jetbrains.annotations.Contract;

/**
 * Entity identifiable with a technical ID.
 *
 * @since 4.0
 */
public interface IdentifiableWithTechnicalId {


  /**
   * Get the entity's technical ID.
   *
   * @return The technical ID.
   */
  @PublicApi
  @Contract(pure = true)
  int id();

  /**
   * Set the entity's technical ID.
   *
   * @param newId The new technical ID.
   * @return The entity itself.
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  IdentifiableWithTechnicalId id(final int newId);

}
