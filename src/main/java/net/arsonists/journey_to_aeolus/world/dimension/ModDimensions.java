package net.arsonists.journey_to_aeolus.world.dimension;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> AEOLUS_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Aeolus.MOD_ID, "aeolus"));
    public static final RegistryKey<DimensionType> AEOLUS_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            AEOLUS_DIMENSION_KEY.getValue());

    public static void register()
        {
           Aeolus.LOGGER.debug("Registering ModDimensions for " + Aeolus.MOD_ID);
        }
}
