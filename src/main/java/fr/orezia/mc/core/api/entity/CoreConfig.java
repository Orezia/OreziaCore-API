package fr.orezia.mc.core.api.entity;

import fr.orezia.mc.core.api.annotation.PublicApi;
import java.util.HashMap;
import java.util.Map;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Entity for core config.
 */
@PublicApi
@SerializableAs("CoreConfig")
public class CoreConfig implements ConfigurationSerializable {

  private boolean debug;
  private @NotNull String databaseHost = "localhost";
  private @NotNull String databaseName = "database";
  private @NotNull String databasePort = "3306";
  private @NotNull String databaseUsername = "root";
  private @NotNull String databasePassword = "password";

  /**
   * Deserialize Map representing this class.
   *
   * @param data The data to deserialize.
   * @return The new instance of {@code CoreConfig} with data from given map.
   */
  @Internal
  @Contract("_ -> new")
  public static @NotNull CoreConfig deserialize(final @NotNull Map<String, Object> data) {
    final CoreConfig coreConfig = new CoreConfig();

    coreConfig.debug((Boolean) data.getOrDefault("debug", false))
        .databaseHost((String) data.getOrDefault("db_host", "localhost"))
        .databaseName((String) data.getOrDefault("db_name", "database"))
        .databasePort((String) data.getOrDefault("db_port", "3306"))
        .databaseUsername((String) data.getOrDefault("db_user", "root"))
        .databasePassword((String) data.getOrDefault("db_pass", "password"));

    return coreConfig;
  }


  /**
   * {@inheritDoc}
   */
  @Override
  @Internal
  @Contract(value = "-> new", pure = true)
  public @NotNull Map<String, Object> serialize() {
    final Map<String, Object> map = new HashMap<>();

    map.put("debug", debug);
    map.put("db_host", databaseHost);
    map.put("db_name", databaseName);
    map.put("db_port", databasePort);
    map.put("db_user", databaseUsername);
    map.put("db_pass", databasePassword);

    return map;
  }

  /**
   * Get for debug value.
   *
   * @return The debug value.
   * @since 1.0
   */
  @PublicApi
  @Contract(pure = true)
  public boolean debug() {
    return debug;
  }

  /**
   * Fluent setter for debug value.
   *
   * @param debug The debug value.
   * @return Itself.
   * @since 1.0
   */
  @PublicApi
  @Contract(value = "_ -> this", mutates = "this")
  public @NotNull CoreConfig debug(final boolean debug) {
    this.debug = debug;
    return this;
  }

  /**
   * Get the configured database URL.
   *
   * @return The configured database URL.
   * @since 1.0
   */
  @PublicApi
  public @NotNull String databaseHost() {
    return databaseHost;
  }

  /**
   * Set the configured database URL.
   *
   * @param databaseHost The new database URL.
   * @return this
   * @since 1.0
   */
  @PublicApi
  public @NotNull CoreConfig databaseHost(final String databaseHost) {
    this.databaseHost = databaseHost;
    return this;
  }

  /**
   * Get the configured database name.
   *
   * @return The configured database name.
   * @since 1.0
   */
  @PublicApi
  public @NotNull String databaseName() {
    return databaseName;
  }

  /**
   * Set the configured database name.
   *
   * @param databaseName The new database name.
   * @return this
   * @since 1.0
   */
  @PublicApi
  public @NotNull CoreConfig databaseName(final String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

  /**
   * Get the configured database port number.
   *
   * @return The configured database port number.
   * @since 1.0
   */
  @PublicApi
  public @NotNull String databasePort() {
    return databasePort;
  }

  /**
   * Set the configured database port number.
   *
   * @param databasePort The new database port number.
   * @return this
   * @since 1.0
   */
  @PublicApi
  public @NotNull CoreConfig databasePort(final String databasePort) {
    this.databasePort = databasePort;
    return this;
  }

  /**
   * Get the configured database username.
   *
   * @return The configured database username.
   * @since 1.0
   */
  @PublicApi
  public @NotNull String databaseUsername() {
    return databaseUsername;
  }

  /**
   * Set the configured database username.
   *
   * @param databaseUsername The new database username.
   * @return this.
   * @since 1.0
   */
  @PublicApi
  public CoreConfig databaseUsername(final String databaseUsername) {
    this.databaseUsername = databaseUsername;
    return this;
  }

  /**
   * Get the configured database password.
   *
   * @return The configured database password.
   * @since 1.0
   */
  @PublicApi
  public @NotNull String databasePassword() {
    return databasePassword;
  }

  /**
   * Set the configured database password.
   *
   * @param databasePassword The new database password.
   * @return this
   * @since 1.0
   */
  @PublicApi
  public @NotNull CoreConfig databasePassword(final String databasePassword) {
    this.databasePassword = databasePassword;
    return this;
  }

}
