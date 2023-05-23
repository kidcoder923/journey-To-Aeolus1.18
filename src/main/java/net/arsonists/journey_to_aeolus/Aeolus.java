package net.arsonists.journey_to_aeolus;

import net.arsonists.journey_to_aeolus.block.ModBlocks;
import net.arsonists.journey_to_aeolus.item.ModItems;
import net.arsonists.journey_to_aeolus.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aeolus implements ModInitializer {
	public static final String MOD_ID = "journey_to_aeolus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

	}
}
