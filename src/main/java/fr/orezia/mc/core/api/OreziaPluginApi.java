package fr.orezia.mc.core.api;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.jetbrains.annotations.NotNull;

/**
 * API for orezia plugin.
 * @since 1.0 1.0
 */
@PublicApi
public interface OreziaPluginApi {

  /**
   * Get the plugin name.
   *
   * @return The plugin name.
   */
  @PublicApi
  @NotNull String pluginName();

}
