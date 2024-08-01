package net.azurune.yapping_tooltips;

import net.minecraftforge.common.ForgeConfigSpec;

public class YTConfig {
    public static final ForgeConfigSpec CLIENT;
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //PREFERENCE
    public static final ForgeConfigSpec.BooleanValue ENABLE_SNEAK_TO_DISPLAY;
    //TODO: RAW TOOLTIPS CONFIG AND COLOR TEXT CONFIG

    static {
        //PREFERENCE CONFIGS
        BUILDER.push("Preference Configs");

        ENABLE_SNEAK_TO_DISPLAY = BUILDER
                .comment("Should the sneak key be required to be pushed down to display tooltips? (default: true)")
                .define("enableSneakToDisplay", true);

        BUILDER.pop();

        CLIENT = BUILDER.build();
    }
}
