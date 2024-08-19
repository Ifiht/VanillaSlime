package org.evlis.vanillaSlime.core.handlers;

import org.evlis.vanillaSlime.api.events.PlayerRightClickEvent;
import org.evlis.vanillaSlime.api.items.ItemHandler;
import org.evlis.vanillaSlime.api.items.SlimefunItem;
import org.evlis.vanillaSlime.implementation.items.SimpleSlimefunItem;
import org.bukkit.entity.Player;

/**
 * This {@link ItemHandler} is triggered when the {@link SlimefunItem} it was assigned to
 * is right-clicked.
 * 
 * @author TheBusyBiscuit
 *
 * @see ItemHandler
 * @see SimpleSlimefunItem
 * 
 */
@FunctionalInterface
public interface ItemUseHandler extends ItemHandler {

    /**
     * This function is triggered when a {@link Player} right clicks with the assigned {@link SlimefunItem}
     * in his hand.
     * 
     * @param e
     *            The {@link PlayerRightClickEvent} that was triggered
     */
    void onRightClick(PlayerRightClickEvent e);

    @Override
    default Class<? extends ItemHandler> getIdentifier() {
        return ItemUseHandler.class;
    }

}
