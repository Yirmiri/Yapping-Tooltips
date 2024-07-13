package net.azurune.yapping_tooltips.config;

import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Environment(value= EnvType.CLIENT)
public abstract class YTEntry<T> {

    private final String text;
    private final String[] tooltip;
    private final Supplier<T> current;
    private final Consumer<T> saver;
    private final T defaultValue;

    private final T min;
    private final T max;

    public static YTEntry<Boolean> booleanEntry(String name, Supplier<Boolean> current, Consumer<Boolean> saver, Boolean defaultValue) {
        return new YTEntry<>(name, current, saver, defaultValue) {
            @Override
            TooltipListEntry<Boolean> build(ConfigEntryBuilder builder) {
                return builder.startBooleanToggle(Text.translatable(getText()), getCurrent().get())
                        .setSaveConsumer(getSaver())
                        .setDefaultValue(getDefaultValue())
                        .build();
            }
        };
    }

    private YTEntry(String name, Supplier<T> current, Consumer<T> saver, T defaultValue, String... tooltip) {
        this(name, current, saver, defaultValue, null, null, tooltip);
    }

    private YTEntry(String name, Supplier<T> current, Consumer<T> saver, T defaultValue, T min, T max, String... tooltip) {
        this.text = name;
        this.current = current;
        this.saver = saver;
        this.defaultValue = defaultValue;
        this.min = min;
        this.max = max;
        this.tooltip = tooltip;
    }

    abstract TooltipListEntry<T> build (ConfigEntryBuilder builder);

    public String getText() {
        return text;
    }

    public String[] getTooltip() {
        return tooltip;
    }

    public Supplier<T> getCurrent() {
        return current;
    }

    public Consumer<T> getSaver() {
        return saver;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
