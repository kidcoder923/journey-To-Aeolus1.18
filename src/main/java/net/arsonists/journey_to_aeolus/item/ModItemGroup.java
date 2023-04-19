package net.arsonists.journey_to_aeolus.item;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup JOURNEY_TO_AEOLUS = FabricItemGroupBuilder.build(new Identifier(Aeolus.MOD_ID, "journey_to_aeolus"),
            () -> new ItemStack(ModItems.AZURITE_INGOT));
}
