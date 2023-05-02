package net.arsonists.journey_to_aeolus.item;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AZURITE_INGOT = registerItem("azurite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.JOURNEY_TO_AEOLUS)));

    public static final Item EMBERFRUIT = registerItem("emberfruit",
            new Item(new FabricItemSettings().group(ModItemGroup.JOURNEY_TO_AEOLUS).food(ModFoodComponents.EMBERFRUIT)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Aeolus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aeolus.LOGGER.info("Register Mod Items for " + Aeolus.MOD_ID);
    }
}
