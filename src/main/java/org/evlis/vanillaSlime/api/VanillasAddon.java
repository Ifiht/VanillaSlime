package org.evlis.vanillaSlime.api;
//maps io.github.thebusybiscuit.slimefun4.api.SlimefunAddon
import java.util.logging.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.apache.commons.lang.Validate;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import org.evlis.vanillaSlime.api.items.VanillasItem;

/**
 * This is a very basic interface that will be used to identify
 * the {@link Plugin} that registered a {@link VanillasItem}.
 *
 * It will also contain some utility methods such as {@link VanillasAddon#getBugTrackerURL()}
 * to provide some context when bugs arise.
 *
 * It is recommended to implement this interface if you are developing
 * an Addon.
 *
 * @author Ifiht
 *
 */
public interface VanillasAddon {
    /**
     * This method returns the instance of {@link JavaPlugin} that this
     * {@link VanillasAddon} refers to.
     *
     * @return The instance of your {@link JavaPlugin}
     */
    @Nonnull
    JavaPlugin getJavaPlugin();

    /**
     * This method returns a link to the Bug Tracker of this {@link VanillasAddon}
     *
     * @return The URL for this Plugin's Bug Tracker, or null
     */
    @Nullable
    String getBugTrackerURL();

    /**
     * This method returns the name of this addon, it defaults to the name
     * of the {@link JavaPlugin} provided by {@link VanillasAddon#getJavaPlugin()}
     *
     * @return The Name of this {@link VanillasAddon}
     */
    default @Nonnull String getName() {
        return getJavaPlugin().getName();
    }

    /**
     * This method returns the version of this addon, it defaults to the version
     * of the {@link JavaPlugin} provided by {@link VanillasAddon#getJavaPlugin()}
     *
     * @return The version of this {@link VanillasAddon}
     */
    default @Nonnull String getPluginVersion() {
        return getJavaPlugin().getDescription().getVersion();
    }

    /**
     * This method returns the {@link Logger} of this addon, it defaults to the {@link Logger}
     * of the {@link JavaPlugin} provided by {@link VanillasAddon#getJavaPlugin()}
     *
     * @return The {@link Logger} of this {@link VanillasAddon}
     */
    default @Nonnull Logger getLogger() {
        return getJavaPlugin().getLogger();
    }

    /**
     * This method checks whether the given String is the name of a dependency of this
     * {@link VanillasAddon}.
     * It specifically checks whether the given String can be found in {@link PluginDescriptionFile#getDepend()}
     * or {@link PluginDescriptionFile#getSoftDepend()}
     *
     * @param dependency
     *            The dependency to check for
     *
     * @return Whether this {@link VanillasAddon} depends on the given {@link Plugin}
     */
    default boolean hasDependency(@Nonnull String dependency) {
        Validate.notNull(dependency, "The dependency cannot be null");

        // Well... it cannot depend on itself but you get the idea.
        if (getJavaPlugin().getName().equalsIgnoreCase(dependency)) {
            return true;
        }

        PluginDescriptionFile description = getJavaPlugin().getDescription();
        return description.getDepend().contains(dependency) || description.getSoftDepend().contains(dependency);
    }
}
