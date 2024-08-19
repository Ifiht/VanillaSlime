package org.evlis.vanillaSlime.core.attributes;

import org.evlis.vanillaSlime.api.items.ItemHandler;
import org.evlis.vanillaSlime.api.items.VanillasItem;

import javax.annotation.Nonnull;

/**
 * An empty interface that only serves the purpose of bundling together all
 * interfaces of that kind.
 * 
 * An {@link ItemAttribute} must be attached to a {@link VanillasItem}.
 * 
 * @author TheBusyBiscuit
 * 
 * @see VanillasItem
 * @see ItemHandler
 *
 */
public interface ItemAttribute {

    /**
     * Returns the identifier of the associated {@link VanillasItem}.
     *
     * @return the identifier of the {@link VanillasItem}
     */
    @Nonnull
    String getId();

}
