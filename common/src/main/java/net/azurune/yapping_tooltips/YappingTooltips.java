package net.azurune.yapping_tooltips;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YappingTooltips {
    public static final String MOD_ID = "yapping_tooltips";
    public static final String MOD_NAME = "Yapping Tooltips";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        //ForgeConfigRegistry.INSTANCE.register(MOD_ID, ModConfig.Type.CLIENT, YTConfig.CLIENT, "yapping_tooltips-config.toml");
    }
}