package org.evlis.vanillaSlime.core.handlers;

import org.evlis.vanillaSlime.api.items.ItemHandler;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * The {@link ItemDropHandler} is a {@link GlobalItemHandler} which listens to
 * an {@link Item} being dropped.
 * 
 * @author Linox
 * @author TheBusyBiscuit
 *
 */
@FunctionalInterface
public interface ItemDropHandler extends GlobalItemHandler {

    @ParametersAreNonnullByDefault
    boolean onItemDrop(PlayerDropItemEvent e, Player p, Item item);

    @Override
    default Class<? extends ItemHandler> getIdentifier() {
        return ItemDropHandler.class;
    }
}
