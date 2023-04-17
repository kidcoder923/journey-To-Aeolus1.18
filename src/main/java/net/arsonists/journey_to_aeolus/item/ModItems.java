package net.arsonists.journey_to_aeolus.item;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aeolus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aeolus.LOGGER.info("Register Mod Items for " + Aeolus.MOD_ID);
    }
}
