package net.azurune.yapping_tooltips;

import net.fabricmc.api.ModInitializer;

public class FabricYappingTooltips implements ModInitializer {
    
    @Override
    public void onInitialize() {
        YappingTooltips.init();
    }
}
