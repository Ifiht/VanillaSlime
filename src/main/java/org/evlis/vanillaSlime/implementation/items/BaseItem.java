package org.evlis.vanillaSlime.implementation.items;
// maps io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem

import org.evlis.vanillaSlime.api.items.ItemState;
import org.evlis.vanillaSlime.api.items.VanillasItem;
import org.evlis.vanillaSlime.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Represents a vanilla item that is overridden by Slimefun (like {@code ELYTRA}).
 * <p>
 * A {@link BaseItem} uses a non-modified {@link ItemStack} (no display name neither lore).
 * When a {@link BaseItem} gets disabled, its {@link ItemState} goes on {@code State.VANILLA} which
 * automatically
 * replace it in the recipes by its vanilla equivalent.
 * 
 * A {@link BaseItem} is also automatically useable in workbenches.
 *
 * @author TheBusyBiscuit
 * 
 * @see VanillasItem
 *
 */
public class BaseItem extends VanillasItem {

    /**
     * Instantiates a new {@link BaseItem} with the given arguments.
     *
     * @param itemGroup
     *            the {%REMOVED% ItemGroup} to bind this {@link BaseItem} to
     * @param item
     *            the item corresponding to this {@link BaseItem}
     * @param id
     *            the id of this {@link BaseItem}
     * @param recipeType
     *            the type of the recipe to obtain this {@link BaseItem}
     * @param recipe
     *            the recipe to obtain this {@link BaseItem}
     */
    @ParametersAreNonnullByDefault
    public BaseItem(ItemGroup itemGroup, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, id, recipeType, recipe);

        useableInWorkbench = true;
    }
}
