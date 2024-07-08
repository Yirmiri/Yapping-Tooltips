package net.azurune.yapping_tooltips;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YappingTooltips implements ModInitializer {
	public static final String MOD_ID = "yapping_tooltips";
	public static final String MOD_NAME = "Yapping Tooltips";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {

	}

	public static boolean isModLoaded(String id) {
		return FabricLoader.getInstance().isModLoaded(id);
	}
}