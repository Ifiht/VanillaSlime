package org.evlis.vanillaSlime.api;

import javax.annotation.Nonnull;

import org.apache.commons.lang.Validate;

import io.github.bakedlibs.dough.common.CommonPatterns;

/**
 * This enum represents the branch this VanillaSlime build is on.
 * development or stable, unofficial or even unknown.
 *
 * @author TheBusyBiscuit
 *
 */
public enum VanillasBranch {

    // It is unbelievable that I have to say this...
    // DO NOT TRANSLATE THIS FILE. I repeat:
    // DO NOT TRANSLATE THIS FILE.
    // You keep messing up our Metrics...

    /**
     * This build stems from the official "development" branch, it is prefixed with {@code DEV - X}
     */
    DEVELOPMENT("development build", true),

    /**
     * This build stems from the official "stable" branch, it is prefixed with {@code RC - X}
     */
    STABLE("\"stable\" build", true),

    /**
     * This build stems from an unofficial branch, it contains the string {@code UNOFFICIAL}
     */
    UNOFFICIAL("Unofficial build", false),

    /**
     * This build comes from any other branch. The version does not look like anything we recognize.
     * It is definitely not an official build.
     */
    UNKNOWN("Unofficial build", false);

    private final String name;
    private final boolean official;

    VanillasBranch(@Nonnull String name, boolean official) {
        Validate.notNull(name, "The branch name cannot be null");

        this.name = name;
        this.official = official;

        if (!CommonPatterns.ASCII.matcher(name).matches()) {
            throw new IllegalStateException("The VanillasBranch enum contains ILLEGAL CHARACTERS. DO NOT TRANSLATE THIS FILE.");
        }
    }

    /**
     * This returns the name of this {@link VanillasBranch}. The name is just a more readable
     * version of the enum constant.
     *
     * @return The name of this {@link VanillasBranch}
     */
    public @Nonnull String getName() {
        return name;
    }

    /**
     * This method returns whether this {@link VanillasBranch} is considered official.
     * Or whether it was unofficially modified.
     *
     * @return Whether this branch is an official one.
     */
    public boolean isOfficial() {
        return official;
    }

}
