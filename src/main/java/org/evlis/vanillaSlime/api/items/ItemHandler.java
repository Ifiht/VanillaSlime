package org.evlis.vanillaSlime.api.items;

import org.evlis.vanillaSlime.api.exceptions.IncompatibleItemHandlerException;
import org.evlis.vanillaSlime.core.handlers.*;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * An {@link ItemHandler} represents a certain action that a {@link VanillasItem}
 * can perform.
 * 
 * @author TheBusyBiscuit
 *
 * @see ItemUseHandler
 * @see ItemConsumptionHandler
 * @see BlockUseHandler
 * @see EntityKillHandler
 * @see EntityInteractHandler
 * @see BowShootHandler
 */
@FunctionalInterface
public interface ItemHandler {

    /**
     * This method is used to check whether a given {@link VanillasItem} is compatible
     * with this {@link ItemHandler}, it will return an {@link IncompatibleItemHandlerException}
     * if the items are not compatible.
     * 
     * @param item
     *            The {@link VanillasItem} to validate
     * 
     * @return An {@link Optional} describing the result, it will contain an {@link IncompatibleItemHandlerException}
     *         should there be an issue
     */
    @Nonnull
    default Optional<IncompatibleItemHandlerException> validate(@Nonnull VanillasItem item) {
        return Optional.empty();
    }

    /**
     * This method returns the identifier for this {@link ItemHandler}.
     * We use a {@link Class} identifier to group Item Handlers together.
     * 
     * @return The {@link Class} identifier for this {@link ItemHandler}
     */
    @Nonnull
    Class<? extends ItemHandler> getIdentifier();
}
