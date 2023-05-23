package net.arsonists.journey_to_aeolus.util;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.arsonists.journey_to_aeolus.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        Aeolus.LOGGER.info("Registering Fuels for " + Aeolus.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.EMBER_CRYSTAL, 3200);
    }

}
