package com.HiWord9.NoInvalidChars;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoInvalidChars implements ModInitializer {
	public static final String MOD_ID = "no-invalid-chars";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("NoInvalidChars initialized");
	}
}
