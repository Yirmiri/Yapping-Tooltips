package net.azurune.yapping_tooltips.config;

import net.azurune.yapping_tooltips.YappingTooltips;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value= EnvType.CLIENT)
public enum YTCategory {

    CLIENT("config.yapping_tooltips.category.client", false,
            YTEntry.booleanEntry("config.yapping_tooltips.enable_shift_to_show", () -> YappingTooltips.CONFIG.enableShiftToShowTooltips(),
                    newValue -> YappingTooltips.CONFIG.setShiftToShowTooltips(newValue), false));

    private final String text;
    private final YTEntry<?>[] entries;
    private final YTCategory[] children;
    private final boolean isChild;

    YTCategory(String text, boolean isChild, YTEntry<?>... entries) {
        this.text = text;
        this.entries = entries;
        this.children = new YTCategory[0];
        this.isChild = isChild;
    }

    YTCategory(String text, boolean isChild, YTCategory[] children, YTEntry<?>... entries) {
        this.text = text;
        this.entries = entries;
        this.children = children;
        this.isChild = isChild;
    }

    public String text() {
        return text;
    }

    public YTEntry<?>[] entries() {
        return entries;
    }

    public YTCategory[] children() {
        return children;
    }

    public boolean isChild() {
        return isChild;
    }
}
