package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.io.Serializable;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

/**
 * DAO for {@link Entity entities}.
 *
 * @param <E> the type of {@link Entity entities}
 * @param <T> the type of ID of the {@link Entity entities}
 * @since 1.0
 */
@PublicApi
public interface Dao<E extends Entity<T>, T extends Serializable> {

  /**
   * Creates the given {@link E entity} in persistence.
   *
   * @param entity the {@link E entity} to create
   * @return {@code true} if the {@link E entity} has been created, {@code false} otherwise
   */
  @PublicApi
  boolean create(final @NotNull E entity);

  /**
   * Checks that an {@link E entity} matching the given {@link T ID} exists in persistence.
   *
   * @param id the {@link T ID} of the {@link E entity} to check
   * @return {@code true} if the {@link T ID} exists, {@code false} otherwise
   */
  @PublicApi
  boolean exists(final @NotNull T id);

  /**
   * Retrieves the {@link E entity} matching the given {@link T ID} from persistence.
   *
   * @param id the {@link T ID} of the {@link E entity} to retrieve
   * @return the found {@link E entity}
   */
  @PublicApi
  @NotNull Optional<E> get(final @NotNull T id);

  /**
   * Updates the given {@link E entity} in persistence, based on its {@link T ID}.
   *
   * @param entity the {@link E entity} to update
   * @return {@code true} if the {@link E entity} has been updated, {@code false} otherwise
   */
  @PublicApi
  boolean update(final @NotNull T entity);

  /**
   * Deletes the {@link E entity} matching the given {@link T ID} from persistence.
   *
   * @param id the {@link T ID} of the {@link E entity} to delete
   * @return {@code true} if the {@link E entity} has been deleted, {@code false} otherwise
   */
  @PublicApi
  boolean delete(final @NotNull T id);

}
