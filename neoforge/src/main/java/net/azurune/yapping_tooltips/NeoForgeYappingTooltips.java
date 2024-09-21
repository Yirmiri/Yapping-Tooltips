package net.azurune.yapping_tooltips;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(YappingTooltips.MOD_ID)
public class NeoForgeYappingTooltips {

    public NeoForgeYappingTooltips(IEventBus eventBus) {
        YappingTooltips.init();
    }
}