package net.azurune.yapping_tooltips.config;

import com.google.gson.GsonBuilder;
import net.azurune.yapping_tooltips.YappingTooltips;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;

public class YTConfig {

    private static final File CONFIG_FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "yapping_tooltips.json");

    private boolean shiftToShowTooltips = true;
    private boolean displayUntranslatedTooltips = false;

    public YTConfig() {
    }

    public static YTConfig load() {
        YTConfig configuration = new YTConfig();
        if (!CONFIG_FILE.exists()) {
            save(configuration);
        }

        Reader reader;
        try {
            reader = Files.newBufferedReader(CONFIG_FILE.toPath());
            configuration = (new GsonBuilder().setPrettyPrinting().create()).fromJson(reader, YTConfig.class);
            reader.close();
        } catch (IOException e) {
            YappingTooltips.LOGGER.error("Error while trying to load configuration file. Default configuration used.", e);
        }

        return configuration;
    }

    public static void save(YTConfig config) {
        try {
            Writer writer = Files.newBufferedWriter(CONFIG_FILE.toPath());
            (new GsonBuilder().setPrettyPrinting().create()).toJson(config, writer);

            writer.close();
        } catch (IOException e) {
            YappingTooltips.LOGGER.error("Error while trying to save configuration file.", e);
        }
    }

    public boolean enableShiftToShowTooltips() {
        return shiftToShowTooltips;
    }

    public boolean setShiftToShowTooltips(boolean bool) {
        return shiftToShowTooltips = bool;
    }

    public boolean enableDisplayUntranslatedTooltips() {
        return displayUntranslatedTooltips;
    }

    public boolean setDisplayUntranslatedTooltips(boolean bool) {
        return displayUntranslatedTooltips = bool;
    }
}
