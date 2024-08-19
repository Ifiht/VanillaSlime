package org.evlis.vanillaSlime.core.attributes;

import org.evlis.vanillaSlime.api.items.VanillasItem;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Collection;

/**
 * <strong>DO NOT IMPLEMENT THIS INTERFACE</strong>
 * This is implemented by every {@link VanillasItem} by default.
 * Might be changed in the future.
 * 
 * @author TheBusyBiscuit
 *
 */
public interface Placeable {

    @Nonnull
    Collection<ItemStack> getDrops();

    @Nonnull
    Collection<ItemStack> getDrops(@Nonnull Player p);

    /**
     * This method determines how to treat this {@link Block} when it is broken.
     * If true is returned then it will be treated as a vanilla {@link Block}.
     * If false is returned then Slimefun will treat it as a {@link Block} that is
     * the placed down version of a {@link VanillasItem}.
     * 
     * It returns false by default.
     * This was previously represented by the HandledBlock class.
     * 
     * @return Whether to use the vanilla block breaking behaviour
     */
    default boolean useVanillaBlockBreaking() {
        return false;
    }

}
