package fr.orezia.mc.core.api.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Core message entity.
 *
 * @since 1.0
 */
@SerializableAs("CoreMessage")
public record CoreMessage(@NotNull Map<String, String> messages) implements
    ConfigurationSerializable {

  /**
   * Empty constructor.
   */
  public CoreMessage() {
    this(new HashMap<>());
  }

  /**
   * Create a {@code CoreMessage} from yaml data.
   *
   * @param data The YAML data to deserialize
   * @return The created object.
   */
  @NotNull
  @Internal
  @Contract("_ -> new")
  public static CoreMessage deserialize(@NotNull final Map<String, Object> data) {

    final Map<String, String> result = new HashMap<>();
    for (final Entry<String, Object> entry : data.entrySet()) {
      if (entry.getValue() instanceof String stringValue) {
        result.put(entry.getKey(), stringValue);
      }
    }

    return new CoreMessage(result);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Internal
  @Contract(value = "-> new", pure = true)
  public @NotNull Map<String, Object> serialize() {
    return new HashMap<>(messages);
  }
}
