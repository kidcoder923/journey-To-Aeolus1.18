package net.arsonists.journey_to_aeolus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aeolus implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
