package fr.orezia.mc.core.api.events;

import fr.orezia.mc.core.api.annotation.PublicApi;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * Event triggered when OreziaCore is reloaded.
 *
 * @since 2.1
 */
public class OreziaCoreReloadEvent extends Event {

  private static final HandlerList handlers = new HandlerList();

  private final @NotNull CommandSender originator;

  /**
   * Valued constructor.
   *
   * @param originator The reload originator.
   */
  public OreziaCoreReloadEvent(final @NotNull CommandSender originator) {
    this.originator = originator;
  }

  /**
   * Get event handler list.
   *
   * @return The handler list.
   */
  @PublicApi
  public static @NotNull HandlerList getHandlerList() {
    return handlers;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @Contract(pure = true)
  public @NotNull HandlerList getHandlers() {
    return OreziaCoreReloadEvent.getHandlerList();
  }

  /**
   * Get the reload originator.
   *
   * @return The command originator.
   */
  @PublicApi
  @Contract(pure = true)
  public CommandSender originator() {
    return originator;
  }
}
