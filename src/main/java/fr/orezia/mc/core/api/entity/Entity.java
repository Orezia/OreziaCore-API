package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.io.Serializable;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entity identifiable with an ID.
 *
 * @param <T> the type of ID
 * @since 1.0
 */
@PublicApi
public interface Entity<T extends Serializable> {

  /**
   * Gets the ID.
   *
   * @return the ID
   */
  @PublicApi
  @Contract(pure = true)
  @NotNull T id();

  /**
   * Sets the ID.
   *
   * @param id the ID to set
   * @return the current instance
   */
  @This
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  @NotNull Entity<T> id(final @NotNull T id);

}
