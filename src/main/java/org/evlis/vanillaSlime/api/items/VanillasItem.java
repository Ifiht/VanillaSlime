package org.evlis.vanillaSlime.api.items;
// maps io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;

import io.github.bakedlibs.dough.collections.OptionalMap;
import io.github.bakedlibs.dough.items.ItemUtils;
import org.evlis.vanillaSlime.api.MinecraftVersion;
import org.evlis.vanillaSlime.api.VanillasAddon;
import org.evlis.vanillaSlime.api.VanillasBranch;
import org.evlis.vanillaSlime.api.exceptions.IdConflictException;
import org.evlis.vanillaSlime.api.exceptions.IncompatibleItemHandlerException;
import org.evlis.vanillaSlime.api.exceptions.MissingDependencyException;
import org.evlis.vanillaSlime.api.exceptions.UnregisteredItemException;
import org.evlis.vanillaSlime.api.exceptions.WrongItemStackException;
import org.evlis.vanillaSlime.api.player.PlayerProfile;
import org.evlis.vanillaSlime.api.recipes.RecipeType;
import org.evlis.vanillaSlime.api.researches.Research;
import org.evlis.vanillaSlime.core.SlimefunRegistry;
import org.evlis.vanillaSlime.core.attributes.NotConfigurable;
import org.evlis.vanillaSlime.core.attributes.Placeable;
import org.evlis.vanillaSlime.core.attributes.Radioactive;
import org.evlis.vanillaSlime.core.guide.SlimefunGuide;
import org.evlis.vanillaSlime.core.handlers.GlobalItemHandler;
import org.evlis.vanillaSlime.implementation.Slimefun;
import org.evlis.vanillaSlime.implementation.items.VanillaItem;
import org.evlis.vanillaSlime.implementation.items.electric.machines.enchanting.AutoDisenchanter;
import org.evlis.vanillaSlime.implementation.items.electric.machines.enchanting.AutoEnchanter;


/**
 * A {@link VanillasItem} is a custom item registered by a {@link VanillasAddon}.
 * This class defines the behaviours of the item, you can assign an {@link ItemHandler}
 * to give the item functionality.
 * In contrast to that the {@link SlimefunItemStack} defines the look and feel of the item.
 *
 * Remember to call {@link #register(SlimefunAddon)} on your {@link SlimefunItem} for it
 * to appear in the {@link SlimefunGuide}.
 *
 * @author TheBusyBiscuit
 * @author Poslovitch
 *
 * @see SlimefunItemStack
 * @see SlimefunAddon
 *
 */
public class VanillasItem {
}
