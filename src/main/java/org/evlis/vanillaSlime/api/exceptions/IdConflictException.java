package org.evlis.vanillaSlime.api.exceptions;

import org.evlis.vanillaSlime.api.items.VanillasItem;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * An {@link IdConflictException} is thrown whenever two Addons try to add
 * a {@link VanillasItem} with the same id.
 * 
 * @author TheBusyBiscuit
 *
 */
public class IdConflictException extends RuntimeException {

    private static final long serialVersionUID = -733012666374895255L;

    /**
     * Constructs a new {@link IdConflictException} with the given items.
     * 
     * @param item1
     *            The first {@link VanillasItem} with this id
     * @param item2
     *            The second {@link VanillasItem} with this id
     */
    @ParametersAreNonnullByDefault
    public IdConflictException(VanillasItem item1, VanillasItem item2) {
        super("Two items have conflicting ids: " + item1.toString() + " and " + item2.toString());
    }

}
