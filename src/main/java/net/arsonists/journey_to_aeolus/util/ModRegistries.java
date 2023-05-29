package net.arsonists.journey_to_aeolus.util;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.arsonists.journey_to_aeolus.block.ModBlocks;
import net.arsonists.journey_to_aeolus.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerFlammableBlocks();
        registerStrippables();
    }


    private static void registerFuels() {
        Aeolus.LOGGER.info("Registering Fuels for " + Aeolus.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.EMBER_CRYSTAL, 3200);
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.AUTUMN_LOG, 5, 5);
        instance.add(ModBlocks.AUTUMN_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_AUTUMN_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_AUTUMN_LOG,5,5);
        instance.add(ModBlocks.AUTUMN_PLANKS,5,20);
        instance.add(ModBlocks.AUTUMN_LEAVES,30,60);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.AUTUMN_LOG, ModBlocks.STRIPPED_AUTUMN_LOG);
        StrippableBlockRegistry.register(ModBlocks.AUTUMN_WOOD, ModBlocks.STRIPPED_AUTUMN_WOOD);
    }

}
