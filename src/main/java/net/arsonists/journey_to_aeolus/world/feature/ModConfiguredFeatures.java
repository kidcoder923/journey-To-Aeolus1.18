package net.arsonists.journey_to_aeolus.world.feature;

import net.arsonists.journey_to_aeolus.Aeolus;
import net.arsonists.journey_to_aeolus.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> AUTUMN_TREE =
            ConfiguredFeatures.register("autumn_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.AUTUMN_LOG),
                    new StraightTrunkPlacer(4,5,3),
                    BlockStateProvider.of(ModBlocks.AUTUMN_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final RegistryEntry<PlacedFeature> AUTUMN_CHECKED =
            PlacedFeatures.register("autumn_checked", AUTUMN_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.AUTUMN_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> AUTUMN_SPAWN =
            ConfiguredFeatures.register("autumn_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(AUTUMN_CHECKED, 0.5f)),
                            AUTUMN_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Aeolus.MOD_ID);
    }

}
