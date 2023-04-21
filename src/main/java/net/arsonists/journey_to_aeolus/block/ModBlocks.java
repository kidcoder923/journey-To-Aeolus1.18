package net.arsonists.journey_to_aeolus.block;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.arsonists.journey_to_aeolus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block AZURITE_BLOCK = registerBlock("azurite_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(7f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);
    public static final Block GALESTONE = registerBlock("galestone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);
    public static final Block GALESTONE_BRICKS = registerBlock("galestone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);
    public static final Block CHISELED_GALESTONE_BRICKS = registerBlock("chiseled_galestone_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);

    public static final Block GALESTONE_SLAB = registerBlock("galestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);
    public static final Block GALESTONE_BRICKS_SLAB = registerBlock("galestone_bricks_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.JOURNEY_TO_AEOLUS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Aeolus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Aeolus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Aeolus.LOGGER.info("Registering ModBlocks for " + Aeolus.MOD_ID);
    }

}
