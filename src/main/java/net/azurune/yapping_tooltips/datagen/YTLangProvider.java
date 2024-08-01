package net.azurune.yapping_tooltips.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class YTLangProvider extends FabricLanguageProvider {
    public YTLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    //IDENTIFIERS
    public static final String YT_ID = "yapping_tooltips.";
    public static final String ID = "minecraft.";

    public static final String AC_ID = "arts_and_crafts.";
    public static final String SP_ID = "snowpig.";
    public static final String EB_ID = "excessive_building.";

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder desc) {
        desc.add(YT_ID + "more_information", "[%s] to show tooltip");

        //1.21 UPDATE
        desc.add(YT_ID + "item." + ID + "flow_armor_trim_smithing_template.desc", "A breeze rod tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "bolt_armor_trim_smithing_template.desc", "A copper tablet that can be used to trim armor");

        desc.add(YT_ID + "block." + ID + "tuff_stairs.desc", "Tough stairs constructed from tuff");
        desc.add(YT_ID + "block." + ID + "tuff_slab.desc", "Tough slab constructed from tuff");
        desc.add(YT_ID + "block." + ID + "tuff_wall.desc", "A tough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "chiseled_tuff.desc", "Tuff that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "polished_tuff.desc", "A block of tuff that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_tuff_stairs.desc", "Smooth stairs constructed from polished tuff");
        desc.add(YT_ID + "block." + ID + "polished_tuff_slab.desc", "Smooth slabs constructed from polished tuff");
        desc.add(YT_ID + "block." + ID + "polished_tuff_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "tuff_bricks.desc", "Tuff compacted into bricks");
        desc.add(YT_ID + "block." + ID + "tuff_brick_stairs.desc", "Tough stairs constructed from tuff bricks");
        desc.add(YT_ID + "block." + ID + "tuff_brick_slab.desc", "Tough slabs constructed from tuff bricks");
        desc.add(YT_ID + "block." + ID + "tuff_brick_wall.desc", "A tough wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "chiseled_tuff_bricks.desc", "Tuff bricks that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "chiseled_copper.desc", "A copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "exposed_chiseled_copper.desc", "A slightly oxidized copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "weathered_chiseled_copper.desc", "An oxidized copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "oxidized_chiseled_copper.desc", "A fully oxidized copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "waxed_chiseled_copper.desc", "A copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_chiseled_copper.desc", "A slightly oxidized copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_chiseled_copper.desc", "An oxidized copper block that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_chiseled_copper.desc", "A fully oxidized copper block that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "copper_grate.desc", "A copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "exposed_copper_grate.desc", "A slightly oxidized copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "weathered_copper_grate.desc", "An oxidized copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "oxidized_copper_grate.desc", "A fully oxidized copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "waxed_copper_grate.desc", "A copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_copper_grate.desc", "A slightly oxidized copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_copper_grate.desc", "An oxidized copper block that has been chiseled, can be waterlogged");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_copper_grate.desc", "A fully oxidized copper block that has been chiseled, can be waterlogged");

        desc.add(YT_ID + "block." + ID + "copper_bulb.desc", "A bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "exposed_copper_bulb.desc", "A slightly oxidized bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "weathered_copper_bulb.desc", "An oxidized bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "oxidized_copper_bulb.desc", "A fully oxidized bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "waxed_copper_bulb.desc", "A bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_copper_bulb.desc", "A slightly oxidized bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_copper_bulb.desc", "An oxidized bulb that can be toggled with a redstone signal");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_copper_bulb.desc", "A fully oxidized bulb that can be toggled with a redstone signal");

        desc.add(YT_ID + "block." + ID + "copper_door.desc", "A copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "exposed_copper_door.desc", "A slightly oxidized copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "weathered_copper_door.desc", "An oxidized copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "oxidized_copper_door.desc", "A fully oxidized copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "waxed_copper_door.desc", "A copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_copper_door.desc", "A slightly oxidized copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_copper_door.desc", "An oxidized copper door which can be opened");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_copper_door.desc", "A fully oxidized copper door which can be opened");

        desc.add(YT_ID + "block." + ID + "copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "exposed_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "weathered_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "oxidized_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "waxed_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_copper_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_copper_trapdoor.desc", "Commonly used for everything BUT traps");

        desc.add(YT_ID + "item." + ID + "mace.desc", "A heavy weapon that increases damage the farther the user falls");
        desc.add(YT_ID + "item." + ID + "wolf_armor.desc", "Grants immunity to almost all damage sources while equipped");
        desc.add(YT_ID + "item." + ID + "wind_charge.desc", "Can be thrown to blast entities near it's landing spot");
        desc.add(YT_ID + "item." + ID + "ominous_bottle.desc", "A mysterious bottle that when drank inflicts bad omen to the consumer");
        desc.add(YT_ID + "item." + ID + "breeze_rod.desc", "A windy rod from a breeze, cool to the touch...");
        desc.add(YT_ID + "block." + ID + "heavy_core.desc", "A weighty block that can be combined with a breeze rod to create a mace");
        desc.add(YT_ID + "item." + ID + "armadillo_scute.desc", "A hard plate from an armadillo");

        desc.add(YT_ID + "item." + ID + "trial_key.desc", "A reward from a trial chamber, can open a vault");
        desc.add(YT_ID + "item." + ID + "ominous_trial_key.desc", "A reward from an ominous trial chamber event, can open an ominous vault");
        desc.add(YT_ID + "block." + ID + "trial_spawner.desc", "A metallic block that summons a wave of whatever is inside of it, grants rewards when cleared");
        desc.add(YT_ID + "block." + ID + "vault.desc", "A metallic block that can be opened with a key for rewards");
        desc.add(YT_ID + "block." + ID + "crafter.desc", "Can craft items automatically when powered by redstone, spits out the output");

        desc.add(YT_ID + "item." + ID + "armadillo_spawn_egg.desc", "A small animal that curls up when scared, can be brushed for it's scutes");
        desc.add(YT_ID + "item." + ID + "bogged_spawn_egg.desc", "A poised skeleton that fires poisonous arrows at it's target");
        desc.add(YT_ID + "item." + ID + "breeze_spawn_egg.desc", "An air elemental that shoots balls of wind");

        desc.add(YT_ID + "item." + ID + "flow_pottery_sherd.desc", "A ceramic remnant with a breeze flow painted on it");
        desc.add(YT_ID + "item." + ID + "guster_pottery_sherd.desc", "A ceramic remnant with a breeze gust painted on it");
        desc.add(YT_ID + "item." + ID + "scrape_pottery_sherd.desc", "A ceramic remnant with an axe painted on it");

        //INITIAL UPDATE (1.0-1.21)
        desc.add(YT_ID + "block." + ID + "oak_log.desc", "A sturdy log from an oak tree");
        desc.add(YT_ID + "block." + ID + "oak_wood.desc", "A sturdy piece of wood from an oak log");
        desc.add(YT_ID + "block." + ID + "stripped_oak_log.desc", "An oak log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_oak_wood.desc", "An oak wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "oak_planks.desc", "Fine planks constructed from oak");
        desc.add(YT_ID + "block." + ID + "oak_stairs.desc", "Fine wooden stairs constructed from oak");
        desc.add(YT_ID + "block." + ID + "oak_slab.desc", "Fine wooden slabs constructed from oak");
        desc.add(YT_ID + "block." + ID + "oak_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "oak_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "oak_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "oak_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "oak_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "oak_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "spruce_log.desc", "A sturdy log from a spruce tree");
        desc.add(YT_ID + "block." + ID + "spruce_wood.desc", "A sturdy piece of wood from a spruce log");
        desc.add(YT_ID + "block." + ID + "stripped_spruce_log.desc", "A spruce log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_spruce_wood.desc", "A spruce wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "spruce_planks.desc", "Fine planks constructed from spruce");
        desc.add(YT_ID + "block." + ID + "spruce_stairs.desc", "Fine wooden stairs constructed from spruce");
        desc.add(YT_ID + "block." + ID + "spruce_slab.desc", "Fine wooden slabs constructed from spruce");
        desc.add(YT_ID + "block." + ID + "spruce_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "spruce_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "spruce_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "spruce_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "spruce_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "spruce_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "birch_log.desc", "A sturdy log from a birch tree");
        desc.add(YT_ID + "block." + ID + "birch_wood.desc", "A sturdy piece of wood from a birch log");
        desc.add(YT_ID + "block." + ID + "stripped_birch_log.desc", "A birch log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_birch_wood.desc", "A birch wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "birch_planks.desc", "Fine planks constructed from birch");
        desc.add(YT_ID + "block." + ID + "birch_stairs.desc", "Fine wooden stairs constructed from birch");
        desc.add(YT_ID + "block." + ID + "birch_slab.desc", "Fine wooden slabs constructed from birch");
        desc.add(YT_ID + "block." + ID + "birch_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "birch_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "birch_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "birch_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "birch_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "birch_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "acacia_log.desc", "A sturdy log from an acacia tree");
        desc.add(YT_ID + "block." + ID + "acacia_wood.desc", "A sturdy piece of wood from an acacia log");
        desc.add(YT_ID + "block." + ID + "stripped_acacia_log.desc", "An acacia log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_acacia_wood.desc", "An acacia wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "acacia_planks.desc", "Fine planks constructed from acacia");
        desc.add(YT_ID + "block." + ID + "acacia_stairs.desc", "Fine wooden stairs constructed from acacia");
        desc.add(YT_ID + "block." + ID + "acacia_slab.desc", "Fine wooden slabs constructed from acacia");
        desc.add(YT_ID + "block." + ID + "acacia_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "acacia_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "acacia_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "acacia_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "acacia_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "acacia_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "dark_oak_log.desc", "A sturdy log from a dark oak tree");
        desc.add(YT_ID + "block." + ID + "dark_oak_wood.desc", "A sturdy piece of wood from a dark oak log");
        desc.add(YT_ID + "block." + ID + "stripped_dark_oak_log.desc", "A dark oak log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_dark_oak_wood.desc", "A dark oak wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "dark_oak_planks.desc", "Fine planks constructed from dark oak");
        desc.add(YT_ID + "block." + ID + "dark_oak_stairs.desc", "Fine wooden stairs constructed from dark oak");
        desc.add(YT_ID + "block." + ID + "dark_oak_slab.desc", "Fine wooden slabs constructed from dark oak");
        desc.add(YT_ID + "block." + ID + "dark_oak_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "dark_oak_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "dark_oak_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "dark_oak_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "dark_oak_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "dark_oak_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "jungle_log.desc", "A sturdy log from a jungle tree");
        desc.add(YT_ID + "block." + ID + "jungle_wood.desc", "A sturdy piece of wood from a jungle log");
        desc.add(YT_ID + "block." + ID + "stripped_jungle_log.desc", "A jungle log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_jungle_wood.desc", "A jungle wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "jungle_planks.desc", "Fine planks constructed from jungle");
        desc.add(YT_ID + "block." + ID + "jungle_stairs.desc", "Fine wooden stairs constructed from jungle");
        desc.add(YT_ID + "block." + ID + "jungle_slab.desc", "Fine wooden slabs constructed from jungle");
        desc.add(YT_ID + "block." + ID + "jungle_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "jungle_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "jungle_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "jungle_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "jungle_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "jungle_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "cherry_log.desc", "A sturdy log from a cherry tree");
        desc.add(YT_ID + "block." + ID + "cherry_wood.desc", "A sturdy piece of wood from a cherry log");
        desc.add(YT_ID + "block." + ID + "stripped_cherry_log.desc", "A cherry log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_cherry_wood.desc", "A cherry wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "cherry_planks.desc", "Fine planks constructed from cherry");
        desc.add(YT_ID + "block." + ID + "cherry_stairs.desc", "Fine wooden stairs constructed from cherry");
        desc.add(YT_ID + "block." + ID + "cherry_slab.desc", "Fine wooden slabs constructed from cherry");
        desc.add(YT_ID + "block." + ID + "cherry_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "cherry_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "cherry_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "cherry_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "cherry_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "cherry_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "mangrove_log.desc", "A sturdy log from a mangrove tree");
        desc.add(YT_ID + "block." + ID + "mangrove_wood.desc", "A sturdy piece of wood from a mangrove log");
        desc.add(YT_ID + "block." + ID + "stripped_mangrove_log.desc", "A mangrove log that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_mangrove_wood.desc", "A mangrove wood that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "mangrove_planks.desc", "Fine planks constructed from mangrove");
        desc.add(YT_ID + "block." + ID + "mangrove_stairs.desc", "Fine wooden stairs constructed from mangrove");
        desc.add(YT_ID + "block." + ID + "mangrove_slab.desc", "Fine wooden slabs constructed from mangrove");
        desc.add(YT_ID + "block." + ID + "mangrove_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "mangrove_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "mangrove_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "mangrove_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "mangrove_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "mangrove_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "bamboo_block.desc", "A collection of bamboo bundled up into a block");
        desc.add(YT_ID + "block." + ID + "stripped_bamboo_block.desc", "A collection of bamboo that was stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "bamboo_planks.desc", "Creaky planks constructed from bamboo");
        desc.add(YT_ID + "block." + ID + "bamboo_stairs.desc", "Creaky stairs constructed from bamboo");
        desc.add(YT_ID + "block." + ID + "bamboo_slab.desc", "Creaky slabs constructed from bamboo");
        desc.add(YT_ID + "block." + ID + "bamboo_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "bamboo_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "bamboo_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "bamboo_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "bamboo_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "bamboo_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");
        desc.add(YT_ID + "block." + ID + "bamboo_mosaic.desc", "Creaky planks fancily carved from bamboo");
        desc.add(YT_ID + "block." + ID + "bamboo_mosaic_stairs.desc", "Creaky stairs fancily carved from bamboo");
        desc.add(YT_ID + "block." + ID + "bamboo_mosaic_slab.desc", "Creaky slabs fancily carved from bamboo");

        desc.add(YT_ID + "block." + ID + "crimson_stem.desc", "A fire resistant stem from a large crimson fungus");
        desc.add(YT_ID + "block." + ID + "crimson_hyphae.desc", "A fire resistance hyphae from a crimson stem");
        desc.add(YT_ID + "block." + ID + "stripped_crimson_stem.desc", "A crimson stem that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_crimson_hyphae.desc", "A crimson hyphae that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "crimson_planks.desc", "Flimsy planks constructed from a crimson stem");
        desc.add(YT_ID + "block." + ID + "crimson_stairs.desc", "Flimsy fungal stairs constructed from crimson planks");
        desc.add(YT_ID + "block." + ID + "crimson_slab.desc", "Flimsy fungal slabs constructed from crimson planks");
        desc.add(YT_ID + "block." + ID + "crimson_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "crimson_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "crimson_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "crimson_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "crimson_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "crimson_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "warped_stem.desc", "A fire resistant stem from a large warped fungus");
        desc.add(YT_ID + "block." + ID + "warped_hyphae.desc", "A fire resistance hyphae from a warped stem");
        desc.add(YT_ID + "block." + ID + "stripped_warped_stem.desc", "A warped stem that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "stripped_warped_hyphae.desc", "A warped hyphae that has been stripped- by accident?");
        desc.add(YT_ID + "block." + ID + "warped_planks.desc", "Flimsy planks constructed from a warped stem");
        desc.add(YT_ID + "block." + ID + "warped_stairs.desc", "Flimsy fungal stairs constructed from warped planks");
        desc.add(YT_ID + "block." + ID + "warped_slab.desc", "Flimsy fungal slabs constructed from warped planks");
        desc.add(YT_ID + "block." + ID + "warped_fence.desc", "Too high to jump over");
        desc.add(YT_ID + "block." + ID + "warped_fence_gate.desc", "Can be opened, connects with fences and walls");
        desc.add(YT_ID + "block." + ID + "warped_door.desc", "Make yourself feel at home");
        desc.add(YT_ID + "block." + ID + "warped_trapdoor.desc", "Commonly used for everything BUT traps");
        desc.add(YT_ID + "block." + ID + "warped_pressure_plate.desc", "Produces a redstone signal when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "warped_button.desc", "Can be pushed by players, arrows, and tridents, stays pushed for 1.5 seconds");

        desc.add(YT_ID + "block." + ID + "stone.desc", "A hard material that makes up majority of the Overworld");
        desc.add(YT_ID + "block." + ID + "stone_stairs.desc", "Smooth stairs constructed from stone");
        desc.add(YT_ID + "block." + ID + "stone_slab.desc", "Smooth slabs constructed from stone");
        desc.add(YT_ID + "block." + ID + "stone_pressure_plate.desc", "Produces a redstone signal when a living entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "stone_button.desc", "Can be pushed by ONLY players, stays pushed for 1 second");

        desc.add(YT_ID + "block." + ID + "cobblestone.desc", "A rough block commonly used in building");
        desc.add(YT_ID + "block." + ID + "cobblestone_stairs.desc", "Rough stairs constructed from cobblestone");
        desc.add(YT_ID + "block." + ID + "cobblestone_slab.desc", "Rough slabs constructed from cobblestone");
        desc.add(YT_ID + "block." + ID + "cobblestone_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "mossy_cobblestone.desc", "A rough block with moss creeping around it");
        desc.add(YT_ID + "block." + ID + "mossy_cobblestone_stairs.desc", "Rough stairs constructed from mossy cobblestone");
        desc.add(YT_ID + "block." + ID + "mossy_cobblestone_slab.desc", "Rough slabs constructed from mossy cobblestone");
        desc.add(YT_ID + "block." + ID + "mossy_cobblestone_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "smooth_stone.desc", "A smooth but still hard material");
        desc.add(YT_ID + "block." + ID + "smooth_stone_slab.desc", "The classic stone slab ;)");

        desc.add(YT_ID + "block." + ID + "stone_bricks.desc", "Stones compacted into bricks");
        desc.add(YT_ID + "block." + ID + "cracked_stone_bricks.desc", "Stone bricks that took a beating");
        desc.add(YT_ID + "block." + ID + "stone_brick_stairs.desc", "Smooth stairs constructed from stone bricks");
        desc.add(YT_ID + "block." + ID + "stone_brick_slab.desc", "Smooth slabs constructed from stone bricks");
        desc.add(YT_ID + "block." + ID + "stone_brick_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "chiseled_stone_bricks.desc", "Stone bricks that have been finely chiseled");

        desc.add(YT_ID + "block." + ID + "mossy_stone_bricks.desc", "Stones compacted into bricks with moss creeping around it");
        desc.add(YT_ID + "block." + ID + "mossy_stone_brick_stairs.desc", "Smooth stairs constructed from mossy stone bricks");
        desc.add(YT_ID + "block." + ID + "mossy_stone_brick_slab.desc", "Smooth slabs constructed from mossy stone bricks");
        desc.add(YT_ID + "block." + ID + "mossy_stone_brick_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "granite.desc", "An igneous rock found in clusters throughout the Overworld");
        desc.add(YT_ID + "block." + ID + "granite_stairs.desc", "Rough stairs constructed from granite");
        desc.add(YT_ID + "block." + ID + "granite_slab.desc", "Rough slabs constructed from granite");
        desc.add(YT_ID + "block." + ID + "granite_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "polished_granite.desc", "A block of granite that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_granite_stairs.desc", "Smooth stairs constructed from polished granite");
        desc.add(YT_ID + "block." + ID + "polished_granite_slab.desc", "Smooth slabs constructed from polished granite");

        desc.add(YT_ID + "block." + ID + "andesite.desc", "An igneous rock found in clusters throughout the Overworld");
        desc.add(YT_ID + "block." + ID + "andesite_stairs.desc", "Rough stairs constructed from andesite");
        desc.add(YT_ID + "block." + ID + "andesite_slab.desc", "Rough slabs constructed from andesite");
        desc.add(YT_ID + "block." + ID + "andesite_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "polished_andesite.desc", "A block of andesite that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_andesite_stairs.desc", "Smooth stairs constructed from polished andesite");
        desc.add(YT_ID + "block." + ID + "polished_andesite_slab.desc", "Smooth slabs constructed from polished andesite");

        desc.add(YT_ID + "block." + ID + "diorite.desc", "An igneous rock found in clusters throughout the Overworld");
        desc.add(YT_ID + "block." + ID + "diorite_stairs.desc", "Rough stairs constructed from diorite");
        desc.add(YT_ID + "block." + ID + "diorite_slab.desc", "Rough slabs constructed from diorite");
        desc.add(YT_ID + "block." + ID + "diorite_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "polished_diorite.desc", "A block of diorite that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_diorite_stairs.desc", "Smooth stairs constructed from polished diorite");
        desc.add(YT_ID + "block." + ID + "polished_diorite_slab.desc", "Smooth slabs constructed from polished diorite");

        desc.add(YT_ID + "block." + ID + "deepslate.desc", "A tough stone found in the deeper layers of the Overworld");

        desc.add(YT_ID + "block." + ID + "cobbled_deepslate.desc", "A tough block commonly used in building");
        desc.add(YT_ID + "block." + ID + "cobbled_deepslate_stairs.desc", "Tough stairs constructed from cobbled deepslate");
        desc.add(YT_ID + "block." + ID + "cobbled_deepslate_slab.desc", "Tough slabs constructed from cobbled deepslate");
        desc.add(YT_ID + "block." + ID + "cobbled_deepslate_wall.desc", "A tough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "chiseled_deepslate.desc", "Deepslate that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "polished_deepslate.desc", "A block of deepslate that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_deepslate_stairs.desc", "Smooth stairs constructed from polished deepslate");
        desc.add(YT_ID + "block." + ID + "polished_deepslate_slab.desc", "Smooth slabs constructed from polished deepslate");
        desc.add(YT_ID + "block." + ID + "polished_deepslate_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "deepslate_bricks.desc", "Slate compacted into bricks");
        desc.add(YT_ID + "block." + ID + "cracked_deepslate_bricks.desc", "Deepslate bricks that took a beating");
        desc.add(YT_ID + "block." + ID + "deepslate_brick_stairs.desc", "Smooth stairs constructed from deepslate bricks");
        desc.add(YT_ID + "block." + ID + "deepslate_brick_slab.desc", "Smooth slabs constructed from deepslate bricks");
        desc.add(YT_ID + "block." + ID + "deepslate_brick_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "deepslate_tiles.desc", "Slate compacted into tiles");
        desc.add(YT_ID + "block." + ID + "cracked_deepslate_tiles.desc", "Deepslate tiles that took a beating");
        desc.add(YT_ID + "block." + ID + "deepslate_tile_stairs.desc", "Smooth stairs constructed from deepslate tiles");
        desc.add(YT_ID + "block." + ID + "deepslate_tile_slab.desc", "Smooth slabs constructed from deepslate tiles");
        desc.add(YT_ID + "block." + ID + "deepslate_tile_wall.desc", "A smooth wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "reinforced_deepslate.desc", "An extremely tough block that can be found in an ancient city, does nothing.");

        desc.add(YT_ID + "block." + ID + "bricks.desc", "Clay that has been smelted into bricks, still feels warm");
        desc.add(YT_ID + "block." + ID + "brick_stairs.desc", "Rough stairs constructed from bricks");
        desc.add(YT_ID + "block." + ID + "brick_slab.desc", "Rough slabs constructed from bricks");
        desc.add(YT_ID + "block." + ID + "brick_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "packed_mud.desc", "Mud that has been packed together");

        desc.add(YT_ID + "block." + ID + "mud_bricks.desc", "Mud that has been packed into bricks");
        desc.add(YT_ID + "block." + ID + "mud_brick_stairs.desc", "Soft stairs constructed from mud bricks");
        desc.add(YT_ID + "block." + ID + "mud_brick_slab.desc", "Soft slabs constructed from mud bricks");
        desc.add(YT_ID + "block." + ID + "mud_brick_wall.desc", "A soft wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "sandstone.desc", "Sand that has been packed together");
        desc.add(YT_ID + "block." + ID + "sandstone_stairs.desc", "Soft stairs constructed from sandstone");
        desc.add(YT_ID + "block." + ID + "sandstone_slab.desc", "Soft slabs constructed from sandstone");
        desc.add(YT_ID + "block." + ID + "sandstone_wall.desc", "A soft wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "chiseled_sandstone.desc", "Sandstone that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "smooth_sandstone.desc", "Sandstone that has been smoothened");
        desc.add(YT_ID + "block." + ID + "smooth_sandstone_stairs.desc", "Hard stairs constructed from smooth sandstone");
        desc.add(YT_ID + "block." + ID + "smooth_sandstone_slab.desc", "Hard slabs constructed from smooth sandstone");

        desc.add(YT_ID + "block." + ID + "cut_sandstone.desc", "Sandstone that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "cut_sandstone_slab.desc", "Fine slabs constructed from cut sandstone");

        desc.add(YT_ID + "block." + ID + "red_sandstone.desc", "Red sand that has been packed together");
        desc.add(YT_ID + "block." + ID + "red_sandstone_stairs.desc", "Soft stairs constructed from red sandstone");
        desc.add(YT_ID + "block." + ID + "red_sandstone_slab.desc", "Soft slabs constructed from red sandstone");
        desc.add(YT_ID + "block." + ID + "red_sandstone_wall.desc", "A soft wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "chiseled_red_sandstone.desc", "Red sandstone that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "smooth_red_sandstone.desc", "Red sandstone that has been smoothened");
        desc.add(YT_ID + "block." + ID + "smooth_red_sandstone_stairs.desc", "Hard stairs constructed from smooth red sandstone");
        desc.add(YT_ID + "block." + ID + "smooth_red_sandstone_slab.desc", "Hard slabs constructed from smooth red sandstone");

        desc.add(YT_ID + "block." + ID + "cut_red_sandstone.desc", "Red sandstone that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "cut_red_sandstone_slab.desc", "Fine slabs constructed from cut red sandstone");

        desc.add(YT_ID + "block." + ID + "sea_lantern.desc", "A lantern created from precious marine crystals");

        desc.add(YT_ID + "block." + ID + "prismarine.desc", "A shimmering marine block");
        desc.add(YT_ID + "block." + ID + "prismarine_stairs.desc", "Pristine stairs constructed from prismarine");
        desc.add(YT_ID + "block." + ID + "prismarine_slab.desc", "Pristine slabs constructed from prismarine");
        desc.add(YT_ID + "block." + ID + "prismarine_wall.desc", "A pristine wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "prismarine_bricks.desc", "Prismarine compacted into bricks");
        desc.add(YT_ID + "block." + ID + "prismarine_brick_stairs.desc", "Pristine stairs constructed from prismarine bricks");
        desc.add(YT_ID + "block." + ID + "prismarine_brick_slab.desc", "Pristine slabs constructed from prismarine bricks");

        desc.add(YT_ID + "block." + ID + "dark_prismarine.desc", "Darkened pristine stones tiled together");
        desc.add(YT_ID + "block." + ID + "dark_prismarine_stairs.desc", "Pristine stairs constructed from dark prismarine");
        desc.add(YT_ID + "block." + ID + "dark_prismarine_slab.desc", "Pristine slabs constructed from dark prismarine");

        desc.add(YT_ID + "block." + ID + "netherrack.desc", "A soft block that takes up majority of the Nether");

        desc.add(YT_ID + "block." + ID + "nether_bricks.desc", "Netherrack that has been smelted into bricks, still feels warm");
        desc.add(YT_ID + "block." + ID + "cracked_nether_bricks.desc", "Nether bricks that took a beating");
        desc.add(YT_ID + "block." + ID + "nether_brick_stairs.desc", "Rough stairs constructed from nether bricks");
        desc.add(YT_ID + "block." + ID + "nether_brick_slab.desc", "Rough slabs constructed from nether bricks");
        desc.add(YT_ID + "block." + ID + "nether_brick_wall.desc", "A rough wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "nether_brick_fence.desc", "Too tall to jump over");
        desc.add(YT_ID + "block." + ID + "chiseled_nether_bricks.desc", "Nether bricks that has been finely chiseled");

        desc.add(YT_ID + "block." + ID + "red_nether_bricks.desc", "Nether bricks stained with nether wart to appear red");
        desc.add(YT_ID + "block." + ID + "red_nether_brick_stairs.desc", "Rough stairs constructed from red nether bricks");
        desc.add(YT_ID + "block." + ID + "red_nether_brick_slab.desc", "Rough slabs constructed from red nether bricks");
        desc.add(YT_ID + "block." + ID + "red_nether_brick_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "basalt.desc", "An igneous rock formed from the rapid cooling of lava");
        desc.add(YT_ID + "block." + ID + "smooth_basalt.desc", "Basalt that has been smoothened");
        desc.add(YT_ID + "block." + ID + "polished_basalt.desc", "A block of basalt that has been polished");

        desc.add(YT_ID + "block." + ID + "blackstone.desc", "A stone-like basalt found in clusters throughout the Nether");
        desc.add(YT_ID + "block." + ID + "gilded_blackstone.desc", "A block of blackstone with bits of gold shimmering inside");
        desc.add(YT_ID + "block." + ID + "blackstone_stairs.desc", "Rough stairs constructed from blackstone");
        desc.add(YT_ID + "block." + ID + "blackstone_slab.desc", "Rough slabs constructed from blackstone");
        desc.add(YT_ID + "block." + ID + "blackstone_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "chiseled_polished_blackstone.desc", "Polished blackstone that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "polished_blackstone.desc", "A block of blackstone that has been polished");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_stairs.desc", "Rough stairs constructed from polished blackstone");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_slab.desc", "Rough slabs constructed from polished blackstone");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_wall.desc", "A rough wall that can connect to other walls, too high to jump over");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_pressure_plate.desc", "Produces a redstone signal when a living entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_button.desc", "Can be pushed by ONLY players, stays pushed for 1 second");

        desc.add(YT_ID + "block." + ID + "polished_blackstone_bricks.desc", "Polished blackstone compacted into bricks");
        desc.add(YT_ID + "block." + ID + "cracked_polished_blackstone_bricks.desc", "Polished blackstone bricks that took a beating");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_brick_stairs.desc", "Rough stairs constructed from polished blackstone bricks");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_brick_slab.desc", "Rough slabs constructed from polished blackstone bricks");
        desc.add(YT_ID + "block." + ID + "polished_blackstone_brick_wall.desc", "A rough wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "end_stone.desc", "A spongy like block that takes up majority of the End");

        desc.add(YT_ID + "block." + ID + "end_stone_bricks.desc", "End stone compacted into bricks");
        desc.add(YT_ID + "block." + ID + "end_stone_brick_stairs.desc", "Spongy stairs constructed from end stone");
        desc.add(YT_ID + "block." + ID + "end_stone_brick_slab.desc", "Spongy slabs constructed from end stone");
        desc.add(YT_ID + "block." + ID + "end_stone_brick_wall.desc", "A spongy wall that can connect to other walls, too high to jump over");

        desc.add(YT_ID + "block." + ID + "purpur_block.desc", "A hardened block constructed from popped chorus fruit");
        desc.add(YT_ID + "block." + ID + "purpur_pillar.desc", "A purpur block that has been finely carved into a pillar");
        desc.add(YT_ID + "block." + ID + "purpur_stairs.desc", "Hardened stairs constructed from purpur blocks");
        desc.add(YT_ID + "block." + ID + "purpur_slab.desc", "Hardened slabs constructed from purpur blocks");

        desc.add(YT_ID + "block." + ID + "coal_block.desc", "A block constructed from a collection of coal, can smelt 80 items");
        desc.add(YT_ID + "block." + ID + "iron_block.desc", "The factory must grow!");
        desc.add(YT_ID + "block." + ID + "iron_bars.desc", "Metal bars constructed from iron");
        desc.add(YT_ID + "block." + ID + "iron_door.desc", "Does not feel so at home");
        desc.add(YT_ID + "block." + ID + "iron_trapdoor.desc", "...a little better at its job");
        desc.add(YT_ID + "block." + ID + "heavy_weighted_pressure_plate.desc", "Produces a redstone signal equal to the amount of entities stood on it when ANY entity makes contact with it");
        desc.add(YT_ID + "block." + ID + "chain.desc", "Metal chains constructed from iron");

        desc.add(YT_ID + "block." + ID + "gold_block.desc", "A metal block constructed from a collection of gold, a piglin's dream");
        desc.add(YT_ID + "block." + ID + "light_weighted_pressure_plate.desc", "Produces a redstone signal equal to the amount of entities stood on it when ANY entity makes contact with it");

        desc.add(YT_ID + "block." + ID + "redstone_block.desc", "A dusty block constructed from a collection of redstone, outputs a redstone signal");
        desc.add(YT_ID + "block." + ID + "emerald_block.desc", "A block constructed from a collection of emeralds, a villager's dream");
        desc.add(YT_ID + "block." + ID + "lapis_block.desc", "A magical block constructed from a collection of lapis");
        desc.add(YT_ID + "block." + ID + "diamond_block.desc", "A shimmering block constructed from a collection of diamonds");
        desc.add(YT_ID + "block." + ID + "netherite_block.desc", "A heavy block constructed from a collection of netherite, can withstand the hottest places");

        desc.add(YT_ID + "block." + ID + "quartz_block.desc", "A pristine block constructed from quartz");
        desc.add(YT_ID + "block." + ID + "quartz_stairs.desc", "Pristine stairs constructed from quartz blocks");
        desc.add(YT_ID + "block." + ID + "quartz_slab.desc", "Pristine slabs constructed from quartz blocks");
        desc.add(YT_ID + "block." + ID + "chiseled_quartz_block.desc", "Quartz blocks that has been finely chiseled");
        desc.add(YT_ID + "block." + ID + "quartz_bricks.desc", "Quartz blocks compacted into bricks");
        desc.add(YT_ID + "block." + ID + "quartz_pillar.desc", "A quartz block that has been finely carved into a pillar");
        desc.add(YT_ID + "block." + ID + "smooth_quartz.desc", "Quartz that has been smoothened");
        desc.add(YT_ID + "block." + ID + "smooth_quartz_stairs.desc", "Pristine stairs constructed from smooth quartz");
        desc.add(YT_ID + "block." + ID + "smooth_quartz_slab.desc", "Pristine slabs constructed from smooth quartz");

        desc.add(YT_ID + "block." + ID + "amethyst_block.desc", "A shimmering collection of amethyst shards");

        desc.add(YT_ID + "block." + ID + "copper_block.desc", "A metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "cut_copper.desc", "A copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "cut_copper_stairs.desc", "Metallic stairs constructed from cut copper");
        desc.add(YT_ID + "block." + ID + "cut_copper_slab.desc", "Metallic slabs constructed from cut copper");

        desc.add(YT_ID + "block." + ID + "exposed_copper.desc", "A slightly oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "exposed_cut_copper.desc", "A slightly oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "exposed_cut_copper_stairs.desc", "Metallic stairs constructed from exposed cut copper");
        desc.add(YT_ID + "block." + ID + "exposed_cut_copper_slab.desc", "Metallic slabs constructed from exposed cut copper");

        desc.add(YT_ID + "block." + ID + "weathered_copper.desc", "An oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "weathered_cut_copper.desc", "An oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "weathered_cut_copper_stairs.desc", "Metallic stairs constructed from weathered cut copper");
        desc.add(YT_ID + "block." + ID + "weathered_cut_copper_slab.desc", "Metallic slabs constructed from weathered cut copper");

        desc.add(YT_ID + "block." + ID + "oxidized_copper.desc", "A fully oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "oxidized_cut_copper.desc", "A fully oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "oxidized_cut_copper_stairs.desc", "Metallic stairs constructed from oxidized cut copper");
        desc.add(YT_ID + "block." + ID + "oxidized_cut_copper_slab.desc", "Metallic slabs constructed from oxidized cut copper");

        desc.add(YT_ID + "block." + ID + "waxed_copper_block.desc", "A metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "waxed_cut_copper.desc", "A copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "waxed_cut_copper_stairs.desc", "Metallic stairs constructed from cut copper");
        desc.add(YT_ID + "block." + ID + "waxed_cut_copper_slab.desc", "Metallic slabs constructed from cut copper");

        desc.add(YT_ID + "block." + ID + "waxed_exposed_copper.desc", "A slightly oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_cut_copper.desc", "A slightly oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_cut_copper_stairs.desc", "Metallic stairs constructed from exposed cut copper");
        desc.add(YT_ID + "block." + ID + "waxed_exposed_cut_copper_slab.desc", "Metallic slabs constructed from exposed cut copper");

        desc.add(YT_ID + "block." + ID + "waxed_weathered_copper.desc", "An oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_cut_copper.desc", "An oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_cut_copper_stairs.desc", "Metallic stairs constructed from weathered cut copper");
        desc.add(YT_ID + "block." + ID + "waxed_weathered_cut_copper_slab.desc", "Metallic slabs constructed from weathered cut copper");

        desc.add(YT_ID + "block." + ID + "waxed_oxidized_copper.desc", "A fully oxidized metal block constructed from a collection of copper");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_cut_copper.desc", "A fully oxidized copper block that has been cut into tiles");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_cut_copper_stairs.desc", "Metallic stairs constructed from oxidized cut copper");
        desc.add(YT_ID + "block." + ID + "waxed_oxidized_cut_copper_slab.desc", "Metallic slabs constructed from oxidized cut copper");

        desc.add(YT_ID + "block." + ID + "white_wool.desc", "A soft block dyed white, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "light_gray_wool.desc", "A soft block dyed light gray, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "gray_wool.desc", "A soft block dyed gray, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "black_wool.desc", "A soft block dyed black, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "brown_wool.desc", "A soft block dyed brown, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "red_wool.desc", "A soft block dyed red, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "orange_wool.desc", "A soft block dyed orange, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "yellow_wool.desc", "A soft block dyed yellow, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "lime_wool.desc", "A soft block dyed lime, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "green_wool.desc", "A soft block dyed green, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "cyan_wool.desc", "A soft block dyed cyan, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "light_blue_wool.desc", "A soft block dyed light blue, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "blue_wool.desc", "A soft block dyed blue, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "purple_wool.desc", "A soft block dyed purple, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "magenta_wool.desc", "A soft block dyed magenta, blocks vibrations");
        desc.add(YT_ID + "block." + ID + "pink_wool.desc", "A soft block dyed pink, blocks vibrations");

        desc.add(YT_ID + "block." + ID + "white_carpet.desc", "A soft layer dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_carpet.desc", "A soft layer dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_carpet.desc", "A soft layer dyed gray");
        desc.add(YT_ID + "block." + ID + "black_carpet.desc", "A soft layer dyed black");
        desc.add(YT_ID + "block." + ID + "brown_carpet.desc", "A soft layer dyed brown");
        desc.add(YT_ID + "block." + ID + "red_carpet.desc", "A soft layer dyed red");
        desc.add(YT_ID + "block." + ID + "orange_carpet.desc", "A soft layer dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_carpet.desc", "A soft layer dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_carpet.desc", "A soft layer dyed lime");
        desc.add(YT_ID + "block." + ID + "green_carpet.desc", "A soft layer dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_carpet.desc", "A soft layer dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_carpet.desc", "A soft layer dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_carpet.desc", "A soft layer dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_carpet.desc", "A soft layer dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_carpet.desc", "A soft layer dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_carpet.desc", "A soft layer dyed pink");

        desc.add(YT_ID + "block." + ID + "terracotta.desc", "A fired clay commonly used for pottery");
        desc.add(YT_ID + "block." + ID + "white_terracotta.desc", "A smooth block dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_terracotta.desc", "A smooth block dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_terracotta.desc", "A smooth block dyed gray");
        desc.add(YT_ID + "block." + ID + "black_terracotta.desc", "A smooth block dyed black");
        desc.add(YT_ID + "block." + ID + "brown_terracotta.desc", "A smooth block dyed brown");
        desc.add(YT_ID + "block." + ID + "red_terracotta.desc", "A smooth block dyed red");
        desc.add(YT_ID + "block." + ID + "orange_terracotta.desc", "A smooth block dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_terracotta.desc", "A smooth block dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_terracotta.desc", "A smooth block dyed lime");
        desc.add(YT_ID + "block." + ID + "green_terracotta.desc", "A smooth block dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_terracotta.desc", "A smooth block dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_terracotta.desc", "A smooth block dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_terracotta.desc", "A smooth block dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_terracotta.desc", "A smooth block dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_terracotta.desc", "A smooth block dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_terracotta.desc", "A smooth block dyed pink");

        desc.add(YT_ID + "block." + ID + "white_concrete.desc", "Concrete powder that has been hardened and dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_concrete.desc", "Concrete powder that has been hardened and dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_concrete.desc", "Concrete powder that has been hardened and dyed gray");
        desc.add(YT_ID + "block." + ID + "black_concrete.desc", "Concrete powder that has been hardened and dyed black");
        desc.add(YT_ID + "block." + ID + "brown_concrete.desc", "Concrete powder that has been hardened and dyed brown");
        desc.add(YT_ID + "block." + ID + "red_concrete.desc", "Concrete powder that has been hardened and dyed red");
        desc.add(YT_ID + "block." + ID + "orange_concrete.desc", "Concrete powder that has been hardened and dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_concrete.desc", "Concrete powder that has been hardened and dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_concrete.desc", "Concrete powder that has been hardened and dyed lime");
        desc.add(YT_ID + "block." + ID + "green_concrete.desc", "Concrete powder that has been hardened and dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_concrete.desc", "Concrete powder that has been hardened and dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_concrete.desc", "Concrete powder that has been hardened and dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_concrete.desc", "Concrete powder that has been hardened and dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_concrete.desc", "Concrete powder that has been hardened and dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_concrete.desc", "Concrete powder that has been hardened and dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_concrete.desc", "Concrete powder that has been hardened and dyed pink");

        desc.add(YT_ID + "block." + ID + "white_concrete_powder.desc", "A mixture of gravel and sand that has been dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_concrete_powder.desc", "A mixture of gravel and sand that has been dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_concrete_powder.desc", "A mixture of gravel and sand that has been dyed gray");
        desc.add(YT_ID + "block." + ID + "black_concrete_powder.desc", "A mixture of gravel and sand that has been dyed black");
        desc.add(YT_ID + "block." + ID + "brown_concrete_powder.desc", "A mixture of gravel and sand that has been dyed brown");
        desc.add(YT_ID + "block." + ID + "red_concrete_powder.desc", "A mixture of gravel and sand that has been dyed red");
        desc.add(YT_ID + "block." + ID + "orange_concrete_powder.desc", "A mixture of gravel and sand that has been dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_concrete_powder.desc", "A mixture of gravel and sand that has been dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_concrete_powder.desc", "A mixture of gravel and sand that has been dyed lime");
        desc.add(YT_ID + "block." + ID + "green_concrete_powder.desc", "A mixture of gravel and sand that has been dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_concrete_powder.desc", "A mixture of gravel and sand that has been dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_concrete_powder.desc", "A mixture of gravel and sand that has been dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_concrete_powder.desc", "A mixture of gravel and sand that has been dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_concrete_powder.desc", "A mixture of gravel and sand that has been dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_concrete_powder.desc", "A mixture of gravel and sand that has been dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_concrete_powder.desc", "A mixture of gravel and sand that has been dyed pink");

        desc.add(YT_ID + "block." + ID + "white_glazed_terracotta.desc", "A terracotta block that has been fired and dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_glazed_terracotta.desc", "A terracotta block that has been fired and dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_glazed_terracotta.desc", "A terracotta block that has been fired and dyed gray");
        desc.add(YT_ID + "block." + ID + "black_glazed_terracotta.desc", "A terracotta block that has been fired and dyed black");
        desc.add(YT_ID + "block." + ID + "brown_glazed_terracotta.desc", "A terracotta block that has been fired and dyed brown");
        desc.add(YT_ID + "block." + ID + "red_glazed_terracotta.desc", "A terracotta block that has been fired and dyed red");
        desc.add(YT_ID + "block." + ID + "orange_glazed_terracotta.desc", "A terracotta block that has been fired and dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_glazed_terracotta.desc", "A terracotta block that has been fired and dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_glazed_terracotta.desc", "A terracotta block that has been fired and dyed lime");
        desc.add(YT_ID + "block." + ID + "green_glazed_terracotta.desc", "A terracotta block that has been fired and dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_glazed_terracotta.desc", "A terracotta block that has been fired and dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_glazed_terracotta.desc", "A terracotta block that has been fired and dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_glazed_terracotta.desc", "A terracotta block that has been fired and dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_glazed_terracotta.desc", "A terracotta block that has been fired and dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_glazed_terracotta.desc", "A terracotta block that has been fired and dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_glazed_terracotta.desc", "A terracotta block that has been fired and dyed pink");

        desc.add(YT_ID + "block." + ID + "glass.desc", "Sand that has been melted into a clear brittle block");
        desc.add(YT_ID + "block." + ID + "tinted_glass.desc", "A glass block infused with amethyst to block out light");
        desc.add(YT_ID + "block." + ID + "white_stained_glass.desc", "A glass block that has been stained white");
        desc.add(YT_ID + "block." + ID + "light_gray_stained_glass.desc", "A glass block that has been stained light gray");
        desc.add(YT_ID + "block." + ID + "gray_stained_glass.desc", "A glass block that has been stained gray");
        desc.add(YT_ID + "block." + ID + "black_stained_glass.desc", "A glass block that has been stained black");
        desc.add(YT_ID + "block." + ID + "brown_stained_glass.desc", "A glass block that has been stained brown");
        desc.add(YT_ID + "block." + ID + "red_stained_glass.desc", "A glass block that has been stained red");
        desc.add(YT_ID + "block." + ID + "orange_stained_glass.desc", "A glass block that has been stained orange");
        desc.add(YT_ID + "block." + ID + "yellow_stained_glass.desc", "A glass block that has been stained yellow");
        desc.add(YT_ID + "block." + ID + "lime_stained_glass.desc", "A glass block that has been stained lime");
        desc.add(YT_ID + "block." + ID + "green_stained_glass.desc", "A glass block that has been stained green");
        desc.add(YT_ID + "block." + ID + "cyan_stained_glass.desc", "A glass block that has been stained cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_stained_glass.desc", "A glass block that has been stained light blue");
        desc.add(YT_ID + "block." + ID + "blue_stained_glass.desc", "A glass block that has been stained blue");
        desc.add(YT_ID + "block." + ID + "purple_stained_glass.desc", "A glass block that has been stained purple");
        desc.add(YT_ID + "block." + ID + "magenta_stained_glass.desc", "A glass block that has been stained magenta");
        desc.add(YT_ID + "block." + ID + "pink_stained_glass.desc", "A glass block that has been stained pink");

        desc.add(YT_ID + "block." + ID + "glass_pane.desc", "Glass that has been cut into panes");
        desc.add(YT_ID + "block." + ID + "white_stained_glass_pane.desc", "A glass pane that has been stained white");
        desc.add(YT_ID + "block." + ID + "light_gray_stained_glass_pane.desc", "A glass pane that has been stained light gray");
        desc.add(YT_ID + "block." + ID + "gray_stained_glass_pane.desc", "A glass pane that has been stained gray");
        desc.add(YT_ID + "block." + ID + "black_stained_glass_pane.desc", "A glass pane that has been stained black");
        desc.add(YT_ID + "block." + ID + "brown_stained_glass_pane.desc", "A glass pane that has been stained brown");
        desc.add(YT_ID + "block." + ID + "red_stained_glass_pane.desc", "A glass pane that has been stained red");
        desc.add(YT_ID + "block." + ID + "orange_stained_glass_pane.desc", "A glass pane that has been stained orange");
        desc.add(YT_ID + "block." + ID + "yellow_stained_glass_pane.desc", "A glass pane that has been stained yellow");
        desc.add(YT_ID + "block." + ID + "lime_stained_glass_pane.desc", "A glass pane that has been stained lime");
        desc.add(YT_ID + "block." + ID + "green_stained_glass_pane.desc", "A glass pane that has been stained green");
        desc.add(YT_ID + "block." + ID + "cyan_stained_glass_pane.desc", "A glass pane that has been stained cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_stained_glass_pane.desc", "A glass pane that has been stained light blue");
        desc.add(YT_ID + "block." + ID + "blue_stained_glass_pane.desc", "A glass pane that has been stained blue");
        desc.add(YT_ID + "block." + ID + "purple_stained_glass_pane.desc", "A glass pane that has been stained purple");
        desc.add(YT_ID + "block." + ID + "magenta_stained_glass_pane.desc", "A glass pane that has been stained magenta");
        desc.add(YT_ID + "block." + ID + "pink_stained_glass_pane.desc", "A glass pane that has been stained pink");

        desc.add(YT_ID + "block." + ID + "shulker_box.desc", "A shell that once housed a creature that can be repurposed for portable storage");
        desc.add(YT_ID + "block." + ID + "white_shulker_box.desc", "A shulker box block that has been dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_shulker_box.desc", "A shulker box block that has been dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_shulker_box.desc", "A shulker box block that has been dyed gray");
        desc.add(YT_ID + "block." + ID + "black_shulker_box.desc", "A shulker box block that has been dyed black");
        desc.add(YT_ID + "block." + ID + "brown_shulker_box.desc", "A shulker box block that has been dyed brown");
        desc.add(YT_ID + "block." + ID + "red_shulker_box.desc", "A shulker box block that has been dyed red");
        desc.add(YT_ID + "block." + ID + "orange_shulker_box.desc", "A shulker box block that has been dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_shulker_box.desc", "A shulker box block that has been dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_shulker_box.desc", "A shulker box block that has been dyed lime");
        desc.add(YT_ID + "block." + ID + "green_shulker_box.desc", "A shulker box block that has been dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_shulker_box.desc", "A shulker box block that has been dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_shulker_box.desc", "A shulker box block that has been dyed light blue");
        desc.add(YT_ID + "block." + ID + "blue_shulker_box.desc", "A shulker box block that has been dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_shulker_box.desc", "A shulker box block that has been dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_shulker_box.desc", "A shulker box block that has been dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_shulker_box.desc", "A shulker box block that has been dyed pink");

        desc.add(YT_ID + "block." + ID + "white_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "light_gray_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "gray_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "black_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "brown_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "red_bed.desc", "Now you really feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "orange_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "yellow_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "lime_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "green_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "cyan_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "light_blue_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "blue_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "purple_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "magenta_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");
        desc.add(YT_ID + "block." + ID + "pink_bed.desc", "Make yourself feel at home, allows setting a spawnpoint");

        desc.add(YT_ID + "block." + ID + "candle.desc", "A light source that can create a bigger light the more there are on one space");
        desc.add(YT_ID + "block." + ID + "white_candle.desc", "A candle that has been dyed white");
        desc.add(YT_ID + "block." + ID + "light_gray_candle.desc", "A candle that has been dyed light gray");
        desc.add(YT_ID + "block." + ID + "gray_candle.desc", "A candle that has been dyed gray");
        desc.add(YT_ID + "block." + ID + "black_candle.desc", "A candle that has been dyed black");
        desc.add(YT_ID + "block." + ID + "brown_candle.desc", "A candle that has been dyed brown");
        desc.add(YT_ID + "block." + ID + "red_candle.desc", "A candle that has been dyed red");
        desc.add(YT_ID + "block." + ID + "orange_candle.desc", "A candle that has been dyed orange");
        desc.add(YT_ID + "block." + ID + "yellow_candle.desc", "A candle that has been dyed yellow");
        desc.add(YT_ID + "block." + ID + "lime_candle.desc", "A candle that has been dyed lime");
        desc.add(YT_ID + "block." + ID + "green_candle.desc", "A candle that has been dyed green");
        desc.add(YT_ID + "block." + ID + "cyan_candle.desc", "A candle that has been dyed cyan");
        desc.add(YT_ID + "block." + ID + "light_blue_candle.desc", "A candle that has dyed been light blue");
        desc.add(YT_ID + "block." + ID + "blue_candle.desc", "A candle that has been dyed blue");
        desc.add(YT_ID + "block." + ID + "purple_candle.desc", "A candle that has been dyed purple");
        desc.add(YT_ID + "block." + ID + "magenta_candle.desc", "A candle that has been dyed magenta");
        desc.add(YT_ID + "block." + ID + "pink_candle.desc", "A candle that has been dyed pink");

        desc.add(YT_ID + "block." + ID + "grass_block.desc", "Soil that allows life to grow on the top of it");
        desc.add(YT_ID + "block." + ID + "podzol.desc", "Soil with organic matter layering the top of it");
        desc.add(YT_ID + "block." + ID + "mycelium.desc", "Soil with a network of fungal life growing through it");
        desc.add(YT_ID + "block." + ID + "dirt_path.desc", "Soil that has been paved with a shovel");
        desc.add(YT_ID + "block." + ID + "dirt.desc", "A mixture of organic matter that makes up majority of the top layer of the Overworld");
        desc.add(YT_ID + "block." + ID + "coarse_dirt.desc", "A mixture of soil and rocks that grass cannot spread to");
        desc.add(YT_ID + "block." + ID + "rooted_dirt.desc", "Soil that has roots growing through it, can commonly lead to lush caves");
        desc.add(YT_ID + "block." + ID + "farmland.desc", "Soil that has been tilled to allow crop growth, requires water within 4 blocks");
        desc.add(YT_ID + "block." + ID + "mud.desc", "Soil that has been moistened, turns into clay if there is pointed dripstone under it");
        desc.add(YT_ID + "block." + ID + "clay.desc", "A fine-grained natural soil");
        desc.add(YT_ID + "block." + ID + "gravel.desc", "A loose collection of rocks, subjected to gravity if floating");
        desc.add(YT_ID + "block." + ID + "sand.desc", "A loose collection of minerals, subjected to gravity if floating");
        desc.add(YT_ID + "block." + ID + "red_sand.desc", "Sand with higher iron qualities, despite it's name it is not red");
        desc.add(YT_ID + "block." + ID + "ice.desc", "A slippery block that melts when near light");
        desc.add(YT_ID + "block." + ID + "packed_ice.desc", "Ice ice baby!");
        desc.add(YT_ID + "block." + ID + "blue_ice.desc", "Compressed ice + Extra slippery!");
        desc.add(YT_ID + "block." + ID + "snow_block.desc", "Cold to the touch...");
        desc.add(YT_ID + "block." + ID + "snow.desc", "Can be layered, melts when near light");
        desc.add(YT_ID + "block." + ID + "moss_block.desc", "A soft block that can be bonemealed to spread to other blocks");
        desc.add(YT_ID + "block." + ID + "moss_carpet.desc", "A thin layer of moss, feels nice to sit on");
        desc.add(YT_ID + "block." + ID + "calcite.desc", "A carbonate mineral that can be found forming around geodes");
        desc.add(YT_ID + "block." + ID + "tuff.desc", "Its tough... (not)");
        desc.add(YT_ID + "block." + ID + "dripstone_block.desc", "Similar to limestone and has experienced a lot of erosion");
        desc.add(YT_ID + "block." + ID + "pointed_dripstone.desc", "A pointed stone that is extremely dangerous");
        desc.add(YT_ID + "block." + ID + "magma_block.desc", "Hot to the touch...");
        desc.add(YT_ID + "block." + ID + "obsidian.desc", "A glass that is formed by rapid cooling of lava");
        desc.add(YT_ID + "block." + ID + "crying_obsidian.desc", "Obsidian that has been infused with magical properties");
        desc.add(YT_ID + "block." + ID + "crimson_nylium.desc", "Netherrack with a network of fungal life growing through it");
        desc.add(YT_ID + "block." + ID + "warped_nylium.desc", "Netherrack with a network of fungal life growing through it");
        desc.add(YT_ID + "block." + ID + "soul_sand.desc", "An amalgamate of souls that desperately grab the living who come near");
        desc.add(YT_ID + "block." + ID + "soul_soil.desc", "Soul rich soil");
        desc.add(YT_ID + "block." + ID + "bone_block.desc", "Whatever once had these must have loved milk");

        desc.add(YT_ID + "block." + ID + "coal_ore.desc", "Forms in the stone layer and commonly in high mountains");
        desc.add(YT_ID + "block." + ID + "deepslate_coal_ore.desc", "Forms rarely at the upmost part of the deepslate layer");

        desc.add(YT_ID + "block." + ID + "iron_ore.desc", "Forms at the bottom of the stone layer and commonly in high mountains");
        desc.add(YT_ID + "block." + ID + "deepslate_iron_ore.desc", "Forms commonly at the upmost part of the deepslate layer");

        desc.add(YT_ID + "block." + ID + "copper_ore.desc", "Forms in the stone layer and commonly in high mountains and dripstone caves");
        desc.add(YT_ID + "block." + ID + "deepslate_copper_ore.desc", "Forms at the upmost part of the deepslate layer and in dripstone caves");

        desc.add(YT_ID + "block." + ID + "gold_ore.desc", "Forms at the bottom of the stone layer and commonly in badlands");
        desc.add(YT_ID + "block." + ID + "deepslate_gold_ore.desc", "Forms in all parts of the deepslate layer and in badlands");

        desc.add(YT_ID + "block." + ID + "redstone_ore.desc", "Forms at the bottom of the stone layer");
        desc.add(YT_ID + "block." + ID + "deepslate_redstone_ore.desc", "Forms in all parts of the deepslate layer");

        desc.add(YT_ID + "block." + ID + "emerald_ore.desc", "Forms at the top of the stone layer, and commonly in mountains");
        desc.add(YT_ID + "block." + ID + "deepslate_emerald_ore.desc", "Rarely forms in the top layer of the deepslate layer and in mountains");

        desc.add(YT_ID + "block." + ID + "lapis_ore.desc", "Forms at the middle of the stone layer");
        desc.add(YT_ID + "block." + ID + "deepslate_lapis_ore.desc", "Forms in all parts of the deepslate layer");

        desc.add(YT_ID + "block." + ID + "diamond_ore.desc", "Forms at the bottom of the stone layer");
        desc.add(YT_ID + "block." + ID + "deepslate_diamond_ore.desc", "Forms in all parts of the deepslate layer");

        desc.add(YT_ID + "block." + ID + "nether_gold_ore.desc", "Forms all throughout the Nether, angers piglins when broken");
        desc.add(YT_ID + "block." + ID + "nether_quartz_ore.desc", "Forms all throughout the Nether, contains high levels of experience");
        desc.add(YT_ID + "block." + ID + "ancient_debris.desc", "Remnants of an ancient ore");

        desc.add(YT_ID + "block." + ID + "raw_iron_block.desc", "Raw iron compressed into a block");
        desc.add(YT_ID + "block." + ID + "raw_gold_block.desc", "Raw gold compressed into a block");
        desc.add(YT_ID + "block." + ID + "raw_copper_block.desc", "Raw copper compressed into a block");

        desc.add(YT_ID + "block." + ID + "glowstone.desc", "Let there be light!");
        desc.add(YT_ID + "block." + ID + "budding_amethyst.desc", "A brittle block that grows amethyst, cannot be moved");
        desc.add(YT_ID + "block." + ID + "small_amethyst_bud.desc", "A small cluster of amethyst");
        desc.add(YT_ID + "block." + ID + "medium_amethyst_bud.desc", "A medium cluster of amethyst");
        desc.add(YT_ID + "block." + ID + "large_amethyst_bud.desc", "A large cluster of amethyst");
        desc.add(YT_ID + "block." + ID + "amethyst_cluster.desc", "A cluster of amethyst, can be harvested for it's shards");

        desc.add(YT_ID + "block." + ID + "oak_leaves.desc", "Foliage from an oak tree");
        desc.add(YT_ID + "block." + ID + "spruce_leaves.desc", "Foliage from a spruce tree");
        desc.add(YT_ID + "block." + ID + "birch_leaves.desc", "Foliage from a birch tree");
        desc.add(YT_ID + "block." + ID + "jungle_leaves.desc", "Foliage from a jungle tree");
        desc.add(YT_ID + "block." + ID + "acacia_leaves.desc", "Foliage from a acacia tree");
        desc.add(YT_ID + "block." + ID + "dark_oak_leaves.desc", "Foliage from a dark oak tree");
        desc.add(YT_ID + "block." + ID + "mangrove_leaves.desc", "Foliage from a mangrove tree");
        desc.add(YT_ID + "block." + ID + "cherry_leaves.desc", "Foliage from a cherry tree");
        desc.add(YT_ID + "block." + ID + "azalea_leaves.desc", "Foliage from an azalea tree");
        desc.add(YT_ID + "block." + ID + "flowering_azalea_leaves.desc", "Foliage from an azalea tree");
        desc.add(YT_ID + "block." + ID + "brown_mushroom_block.desc", "A soft block from a large mushroom's head");
        desc.add(YT_ID + "block." + ID + "red_mushroom_block.desc", "A soft block from a large mushroom's head");
        desc.add(YT_ID + "block." + ID + "nether_wart_block.desc", "Foliage from a large crimson fungus");
        desc.add(YT_ID + "block." + ID + "warped_wart_block.desc", "Foliage from a large warped fungus");
        desc.add(YT_ID + "block." + ID + "shroomlight.desc", "A glowing plant that grows under large fungi");

        desc.add(YT_ID + "block." + ID + "oak_sapling.desc", "A young plant that will grow into an oak tree");
        desc.add(YT_ID + "block." + ID + "spruce_sapling.desc", "A young plant that will grow into a spruce tree");
        desc.add(YT_ID + "block." + ID + "birch_sapling.desc", "A young plant that will grow into a birch tree");
        desc.add(YT_ID + "block." + ID + "acacia_sapling.desc", "A young plant that will grow into an acacia tree");
        desc.add(YT_ID + "block." + ID + "dark_oak_sapling.desc", "A young plant that will grow into a dark oak tree");
        desc.add(YT_ID + "block." + ID + "jungle_sapling.desc", "A young plant that will grow into a jungle tree");
        desc.add(YT_ID + "block." + ID + "mangrove_propagule.desc", "Can be grown into a mangrove tree when on land or in water");
        desc.add(YT_ID + "block." + ID + "cherry_sapling.desc", "A young plant that will grow into a cherry tree");
        desc.add(YT_ID + "block." + ID + "azalea.desc", "A young shrub that will grow into an azalea tree");
        desc.add(YT_ID + "block." + ID + "flowering_azalea.desc", "A young shrub that will grow into an azalea tree");
        desc.add(YT_ID + "block." + ID + "brown_mushroom.desc", "Don't eat mushrooms.");
        desc.add(YT_ID + "block." + ID + "red_mushroom.desc", "Eat too many and you will become big!");
        desc.add(YT_ID + "block." + ID + "crimson_fungus.desc", "A hoglin's favorite snack!");
        desc.add(YT_ID + "block." + ID + "warped_fungus.desc", "Smells so bad hoglins run away");
        desc.add(YT_ID + "block." + ID + "short_grass.desc", "A common plant that covers most ground");
        desc.add(YT_ID + "block." + ID + "fern.desc", "Cannot flower to propagate but instead reproduce through spores");
        desc.add(YT_ID + "block." + ID + "dead_bush.desc", "Not to be confused with shrub");
        desc.add(YT_ID + "block." + ID + "dandelion.desc", "A yellow flower that populates majority of the Overworld");
        desc.add(YT_ID + "block." + ID + "poppy.desc", "A red flower that populates majority of the Overworld");
        desc.add(YT_ID + "block." + ID + "blue_orchid.desc", "A light blue flower that commonly populates wetlands");
        desc.add(YT_ID + "block." + ID + "allium.desc", "A magenta flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "azure_bluet.desc", "A small flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "torchflower.desc", "A flower that was grown from ancient seeds");
        desc.add(YT_ID + "block." + ID + "wither_rose.desc", "Withering away from its former glory...");
        desc.add(YT_ID + "block." + ID + "pink_petals.desc", "Flowers that commonly populate cherry groves");
        desc.add(YT_ID + "block." + ID + "spore_blossom.desc", "A blossom found commonly hanging in lush caves, produces spores around it");
        desc.add(YT_ID + "block." + ID + "bamboo.desc", "A hard plant that can be used for various blocks");
        desc.add(YT_ID + "block." + ID + "sugar_cane.desc", "Tall reeds that can be turned into sugar");
        desc.add(YT_ID + "block." + ID + "cactus.desc", "A prickly plant that wants nothing but a hug");
        desc.add(YT_ID + "block." + ID + "crimson_roots.desc", "A fungus that grows in the shape of roots");
        desc.add(YT_ID + "block." + ID + "warped_roots.desc", "A fungus that grows in the shape of roots");
        desc.add(YT_ID + "block." + ID + "nether_sprouts.desc", "A fungus that is still sprouting");
        desc.add(YT_ID + "block." + ID + "weeping_vines.desc", "They cry for the weeper");
        desc.add(YT_ID + "block." + ID + "twisting_vines.desc", "4th wall break but I really don't have a tooltip for this");
        desc.add(YT_ID + "block." + ID + "vine.desc", "A plant that grows downward and can be climbed");
        desc.add(YT_ID + "block." + ID + "tall_grass.desc", "The bane of any lawn");
        desc.add(YT_ID + "block." + ID + "large_fern.desc", "The bane of any lawn");
        desc.add(YT_ID + "block." + ID + "sunflower.desc", "A tall flower that commonly populates plains");
        desc.add(YT_ID + "block." + ID + "lilac.desc", "A tall flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "peony.desc", "A tall flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "rose_bush.desc", "A tall flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "pitcher_plant.desc", "A flower that was grown from an ancient pod");
        desc.add(YT_ID + "block." + ID + "big_dripleaf.desc", "A plant with a leaf at the top which when stepped on tilts down");
        desc.add(YT_ID + "block." + ID + "small_dripleaf.desc", "A small plant that has multiple large leaves, grows near water");
        desc.add(YT_ID + "block." + ID + "chorus_plant.desc", "An otherworldly plant that grows in an upward direction");
        desc.add(YT_ID + "block." + ID + "chorus_flower.desc", "The seed of a chorus plant, grows from the top of the plant");
        desc.add(YT_ID + "block." + ID + "glow_lichen.desc", "An algae that grows in the walls of caves, emits a small light");
        desc.add(YT_ID + "block." + ID + "hanging_roots.desc", "A part of a plant to anchor them into soil");
        desc.add(YT_ID + "block." + ID + "frogspawn.desc", "Eggs layed by a frog that will grow into tadpoles");
        desc.add(YT_ID + "block." + ID + "turtle_egg.desc", "An egg layed by a turtle that will grow into turtles");
        desc.add(YT_ID + "block." + ID + "sniffer_egg.desc", "An egg layed by an ancient creature, grows faster on moss blocks");
        desc.add(YT_ID + "item." + ID + "wheat_seeds.desc", "When planted they will grow into a wheat crop");
        desc.add(YT_ID + "item." + ID + "cocoa_beans.desc", "When planted they will grow into a cocoa plants");
        desc.add(YT_ID + "item." + ID + "pumpkin_seeds.desc", "When planted they will grow into a pumpkin");
        desc.add(YT_ID + "item." + ID + "melon_seeds.desc", "When planted they will grow into a melon");
        desc.add(YT_ID + "item." + ID + "beetroot_seeds.desc", "When planted they will grow into a beetroot crop");
        desc.add(YT_ID + "item." + ID + "torchflower_seeds.desc", "When planted they will grow into a torchflower");
        desc.add(YT_ID + "item." + ID + "pitcher_pod.desc", "When planted it will grow into a pitcher plant");
        desc.add(YT_ID + "item." + ID + "glow_berries.desc", "Glowing berries that grow from cave vines");
        desc.add(YT_ID + "item." + ID + "sweet_berries.desc", "Berries that grow from bushes which commonly grow in taigas");
        desc.add(YT_ID + "item." + ID + "nether_wart.desc", "A fungus that grows on soul sand, a common ingredient in brewing");
        desc.add(YT_ID + "block." + ID + "lily_pad.desc", "A plant that grows on the top of water");
        desc.add(YT_ID + "block." + ID + "seagrass.desc", "A plant that grows in water");
        desc.add(YT_ID + "block." + ID + "sea_pickle.desc", "A colony of thousands of animals, glows when underwater");
        desc.add(YT_ID + "block." + ID + "kelp.desc", "A plant that grows in water, commonly found in oceans");

        desc.add(YT_ID + "block." + ID + "mangrove_roots.desc", "Roots that grow at the bottom of mangrove trees");
        desc.add(YT_ID + "block." + ID + "muddy_mangrove_roots.desc", "Roots that have grown into mud");
        desc.add(YT_ID + "block." + ID + "mushroom_stem.desc", "A soft block from a large mushroom's body");
        desc.add(YT_ID + "block." + ID + "red_tulip.desc", "A red flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "orange_tulip.desc", "A orange flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "white_tulip.desc", "A white flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "pink_tulip.desc", "A pink flower that commonly populates forests");
        desc.add(YT_ID + "block." + ID + "oxeye_daisy.desc", "A white flower that commonly populates plains");
        desc.add(YT_ID + "block." + ID + "cornflower.desc", "A blue flower that commonly populates plains");
        desc.add(YT_ID + "block." + ID + "lily_of_the_valley.desc", "A very stubborn flower that poisons those who eat it");

        desc.add(YT_ID + "block." + ID + "dried_kelp_block.desc", "A collection of dried kelp that can smelt 20 items");
        desc.add(YT_ID + "block." + ID + "tube_coral_block.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "brain_coral_block.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "bubble_coral_block.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "fire_coral_block.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "horn_coral_block.desc", "A colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "dead_tube_coral_block.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_brain_coral_block.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_bubble_coral_block.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_fire_coral_block.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_horn_coral_block.desc", "A dead colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "dried_kelp.desc", "A collection of dried kelp that can smelt 20 items");
        desc.add(YT_ID + "block." + ID + "tube_coral.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "brain_coral.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "bubble_coral.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "fire_coral.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "horn_coral.desc", "A colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "dead_tube_coral.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_brain_coral.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_bubble_coral.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_fire_coral.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_horn_coral.desc", "A dead colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "dried_kelp_fan.desc", "A collection of dried kelp that can smelt 20 items");
        desc.add(YT_ID + "block." + ID + "tube_coral_fan.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "brain_coral_fan.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "bubble_coral_fan.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "fire_coral_fan.desc", "A colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "horn_coral_fan.desc", "A colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "dead_tube_coral_fan.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_brain_coral_fan.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_bubble_coral_fan.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_fire_coral_fan.desc", "A dead colony of marine invertebrates");
        desc.add(YT_ID + "block." + ID + "dead_horn_coral_fan.desc", "A dead colony of marine invertebrates");

        desc.add(YT_ID + "block." + ID + "sponge.desc", "A soft block that absorbs a sphere of water");
        desc.add(YT_ID + "block." + ID + "wet_sponge.desc", "A wet block that dries off when cooked or in a hot dimension");

        desc.add(YT_ID + "block." + ID + "melon.desc", "A large melon that can be cut into slices");
        desc.add(YT_ID + "block." + ID + "pumpkin.desc", "A squash that can be carved into a spooky face");
        desc.add(YT_ID + "block." + ID + "carved_pumpkin.desc", "A requirement for any Halloween party");
        desc.add(YT_ID + "block." + ID + "jack_o_lantern.desc", "Spooky but with a glow");
        desc.add(YT_ID + "block." + ID + "hay_block.desc", "A bundle of hay that absorbs 80% of fall damage");

        desc.add(YT_ID + "block." + ID + "bee_nest.desc", "A home for bees, can be harvested for honey- just be sure to have a campfire under");
        desc.add(YT_ID + "block." + ID + "honeycomb_block.desc", "A block of many honey combs all that hold honey from bees");
        desc.add(YT_ID + "block." + ID + "slime_block.desc", "Bounces the entity that lands on it back up");
        desc.add(YT_ID + "block." + ID + "honey_block.desc", "Allows sliding down the side of it");
        desc.add(YT_ID + "block." + ID + "ochre_froglight.desc", "A temperate light made when a magma cube is digested by a frog");
        desc.add(YT_ID + "block." + ID + "verdant_froglight.desc", "A cold light made when a magma cube is digested by a frog");
        desc.add(YT_ID + "block." + ID + "pearlescent_froglight.desc", "A hot light made when a magma cube is digested by a frog");

        desc.add(YT_ID + "block." + ID + "sculk.desc", "An unnatural block that forms when things die near a catalyst");
        desc.add(YT_ID + "block." + ID + "sculk_vein.desc", "A vein that grows at the end of sculk blobs");
        desc.add(YT_ID + "block." + ID + "sculk_catalyst.desc", "A bone-like block that spreads sculk when things die");
        desc.add(YT_ID + "block." + ID + "sculk_shrieker.desc", "A bone-like block with souls swirling, shrieks when activated");
        desc.add(YT_ID + "block." + ID + "sculk_sensor.desc", "Can pick up vibrations and output a redstone signal");

        desc.add(YT_ID + "block." + ID + "cobweb.desc", "Weaved together by a spider, slows down entities inside of it");
        desc.add(YT_ID + "block." + ID + "bedrock.desc", "Just keep digging, just keep digging");

        desc.add(YT_ID + "block." + ID + "torch.desc", "A simple source of light");
        desc.add(YT_ID + "block." + ID + "soul_torch.desc", "Souls keep the flame ablaze");
        desc.add(YT_ID + "block." + ID + "redstone_torch.desc", "Emits redstone, disables when the block its on is powered");
        desc.add(YT_ID + "block." + ID + "lantern.desc", "A simple source of light");
        desc.add(YT_ID + "block." + ID + "soul_lantern.desc", "Souls keep the flame ablaze");
        desc.add(YT_ID + "block." + ID + "end_rod.desc", "Can be rotated in all directions, makes a great unicorn horn");
        desc.add(YT_ID + "block." + ID + "redstone_lamp.desc", "A source of light only when powered by redstone");

        desc.add(YT_ID + "block." + ID + "crafting_table.desc", "A table that was constructed to construct more things");
        desc.add(YT_ID + "block." + ID + "stonecutter.desc", "Finely cuts stones too allow full use from them");
        desc.add(YT_ID + "block." + ID + "cartography_table.desc", "A table that allows zooming out, locking, and cloning maps");
        desc.add(YT_ID + "block." + ID + "fletching_table.desc", "A job site for fletcher villagers");
        desc.add(YT_ID + "block." + ID + "smithing_table.desc", "A table that allows armor trimming and equipment upgrading");
        desc.add(YT_ID + "block." + ID + "grindstone.desc", "It has a great hunger for enchantments, disenchants items");
        desc.add(YT_ID + "block." + ID + "loom.desc", "A station that allows customization of banners");
        desc.add(YT_ID + "block." + ID + "furnace.desc", "A station used to smelt blocks, resources, and food");
        desc.add(YT_ID + "block." + ID + "smoker.desc", "A station used to cook food quickly");
        desc.add(YT_ID + "block." + ID + "blast_furnace.desc", "A station used to smelt resources quickly");
        desc.add(YT_ID + "block." + ID + "campfire.desc", "A station used to cook up to 4 foods slowly");
        desc.add(YT_ID + "block." + ID + "soul_campfire.desc", "A station used to cook up to 4 foods slowly");
        desc.add(YT_ID + "block." + ID + "anvil.desc", "A station used to rename, repair, and enchant items");
        desc.add(YT_ID + "block." + ID + "chipped_anvil.desc", "A station used to rename, repair, and enchant items");
        desc.add(YT_ID + "block." + ID + "damaged_anvil.desc", "A station used to rename, repair, and enchant items");
        desc.add(YT_ID + "block." + ID + "composter.desc", "A station used to convert biological matter into bone meal");
        desc.add(YT_ID + "block." + ID + "note_block.desc", "Creates different sounds based on what is under it, used to direct allays");
        desc.add(YT_ID + "block." + ID + "jukebox.desc", "\"Music to my ears!\"");
        desc.add(YT_ID + "block." + ID + "enchanting_table.desc", "Allows enchanting items, requires 15 bookshelves for maximum level");
        desc.add(YT_ID + "item." + ID + "end_crystal.desc", "A magical crystal that can heal and respawn the ender dragon");
        desc.add(YT_ID + "block." + ID + "brewing_stand.desc", "A station used to brew potions, requires blaze powder as fuel");
        desc.add(YT_ID + "block." + ID + "cauldron.desc", "Can store water, lava, and powdered snow, collects powdered snow when out in the snow");
        desc.add(YT_ID + "block." + ID + "bell.desc", "A perfect annoyance to your friends, highlights nearby raiders");
        desc.add(YT_ID + "block." + ID + "beacon.desc", "Allows AOE effects when upgraded using resource blocks around it");
        desc.add(YT_ID + "block." + ID + "conduit.desc", "Grants conduit power when surrounded with prismarine");
        desc.add(YT_ID + "block." + ID + "lodestone.desc", "Can lock compasses to point in the direction of this block");

        desc.add(YT_ID + "block." + ID + "ladder.desc", "Can be climbed up, just don't fall!");
        desc.add(YT_ID + "block." + ID + "scaffolding.desc", "Can be climbed, stacks horizontally up to 7 blocks");
        desc.add(YT_ID + "block." + ID + "beehive.desc", "A home for bees, can be harvested for honey- just be sure to have a campfire under");
        desc.add(YT_ID + "block." + ID + "suspicious_sand.desc", "Can be brushed up to reveal artifacts");
        desc.add(YT_ID + "block." + ID + "suspicious_gravel.desc", "Can be brushed up to reveal artifacts");
        desc.add(YT_ID + "block." + ID + "lightning_rod.desc", "Can be redirect lighting to it... just beware of where you place it");

        desc.add(YT_ID + "block." + ID + "flower_pot.desc", "A small decorative to hold flowers in");
        desc.add(YT_ID + "block." + ID + "decorated_pot.desc", "A ceramic pot that can be decorated using sherds");
        desc.add(YT_ID + "item." + ID + "armor_stand.desc", "A small decorative to hold equipment on");
        desc.add(YT_ID + "item." + ID + "item_frame.desc", "A small decorative to frame items in");
        desc.add(YT_ID + "item." + ID + "glow_item_frame.desc", "A small decorative to frame items in, glows in the dark");
        desc.add(YT_ID + "item." + ID + "painting.desc", "A small decorative to frame a picture on");

        desc.add(YT_ID + "block." + ID + "bookshelf.desc", "A collection of books that you cannot read");
        desc.add(YT_ID + "block." + ID + "chiseled_bookshelf.desc", "A shelf that allows books to be individually placed onto");
        desc.add(YT_ID + "block." + ID + "lectern.desc", "A small decorative to hold a written book on");

        desc.add(YT_ID + "block." + ID + "oak_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "oak_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "spruce_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "spruce_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "birch_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "birch_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "jungle_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "jungle_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "acacia_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "acacia_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "dark_oak_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "dark_oak_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "cherry_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "cherry_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "mangrove_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "mangrove_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "bamboo_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "bamboo_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "crimson_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "crimson_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "warped_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");
        desc.add(YT_ID + "block." + ID + "warped_hanging_sign.desc", "Can be written on, written text can be pasted with glow ink or dyed");

        desc.add(YT_ID + "block." + ID + "chest.desc", "Can be used to store items, can be turned into a double chest");
        desc.add(YT_ID + "block." + ID + "barrel.desc", "Can be used to store items, opens even if a block is above it");
        desc.add(YT_ID + "block." + ID + "ender_chest.desc", "Links with all other ender chests, only you can see it's contents");

        desc.add(YT_ID + "block." + ID + "respawn_anchor.desc", "Used to respawn in the Nether, uses a glowstone charge when used");

        desc.add(YT_ID + "block." + ID + "skeleton_skull.desc", "Plays a special sound above note blocks");
        desc.add(YT_ID + "block." + ID + "wither_skeleton_skull.desc", "A monument to all of your sins...");
        desc.add(YT_ID + "block." + ID + "player_head.desc", "Sooo, how did you get this one...");
        desc.add(YT_ID + "block." + ID + "zombie_head.desc", "Plays a special sound above note blocks");
        desc.add(YT_ID + "block." + ID + "creeper_head.desc", "Plays a special sound above note blocks");
        desc.add(YT_ID + "block." + ID + "piglin_head.desc", "Plays a special sound above note blocks, flops it's ears when powered");
        desc.add(YT_ID + "block." + ID + "dragon_head.desc", "Plays a special sound above note blocks, opens it's mouth when powered");
        desc.add(YT_ID + "block." + ID + "dragon_egg.desc", "A trophy for defeating the ender dragon, \"I bet it tastes good\"");
        desc.add(YT_ID + "block." + ID + "end_portal_frame.desc", "Can be filled to create a portal to a distant world...");
        desc.add(YT_ID + "item." + ID + "ender_eye.desc", "Can be used to track a stronghold or to fill an end portal frame");

        desc.add(YT_ID + "block." + ID + "infested_stone.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_cobblestone.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_stone_bricks.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_cracked_stone_bricks.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_mossy_stone_bricks.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_chiseled_stone_bricks.desc", "A brittle block that has been infested with silverfish");
        desc.add(YT_ID + "block." + ID + "infested_deepslate.desc", "A brittle block that has been infested with silverfish");

        desc.add(YT_ID + "item." + ID + "redstone.desc", "Can be used to connect redstone devices");
        desc.add(YT_ID + "block." + ID + "repeater.desc", "Produces a redstone signal from it's front when it's back is powered");
        desc.add(YT_ID + "block." + ID + "comparator.desc", "Produces a redstone signal from its front by reading specific blocks, can subtract and compare signals");
        desc.add(YT_ID + "block." + ID + "target.desc", "Produces a redstone signal when hit, the closer to the center the stronger the signal");
        desc.add(YT_ID + "block." + ID + "lever.desc", "Produces a redstone signal when turned on");
        desc.add(YT_ID + "block." + ID + "calibrated_sculk_sensor.desc", "Can pick up vibrations quickly and output a redstone signal");
        desc.add(YT_ID + "block." + ID + "tripwire_hook.desc", "Can be linked with another tripwire hook to output a redstone signal using string");
        desc.add(YT_ID + "item." + ID + "string.desc", "A thin thread from a spider");
        desc.add(YT_ID + "block." + ID + "daylight_detector.desc", "Produces a redstone signal based on the position of the sun/moon's position");
        desc.add(YT_ID + "block." + ID + "piston.desc", "Pushes other blocks when powered by redstone");
        desc.add(YT_ID + "block." + ID + "sticky_piston.desc", "Pushes and pulls other blocks when powered by redstone");
        desc.add(YT_ID + "block." + ID + "dispenser.desc", "Shoots out whatever is in it when powered by redstone");
        desc.add(YT_ID + "block." + ID + "dropper.desc", "Drops out whatever is in it when powered by redstone");
        desc.add(YT_ID + "block." + ID + "hopper.desc", "Collects items that fall on it, places collected items in storage hooked to them unless powered by redstone");
        desc.add(YT_ID + "block." + ID + "trapped_chest.desc", "Produces a redstone signal while opened");
        desc.add(YT_ID + "block." + ID + "observer.desc", "Produces a redstone signal when it detects a block update");

        desc.add(YT_ID + "block." + ID + "rail.desc", "A track that minecarts can ride down");
        desc.add(YT_ID + "block." + ID + "powered_rail.desc", "Boosts a minecart riding over it if powered by redstone");
        desc.add(YT_ID + "block." + ID + "detector_rail.desc", "Produces a redstone signal when a minecart rides over it");
        desc.add(YT_ID + "block." + ID + "activator_rail.desc", "Ejects entities riding in the minecart that passes over it if powered by redstone");
        desc.add(YT_ID + "item." + ID + "minecart.desc", "\"Let's ride the rails\"");
        desc.add(YT_ID + "item." + ID + "hopper_minecart.desc", "Collects items portably");
        desc.add(YT_ID + "item." + ID + "chest_minecart.desc", "Stores items portably");
        desc.add(YT_ID + "item." + ID + "furnace_minecart.desc", "When powered by coal it will boost forward and any minecarts in front of it");
        desc.add(YT_ID + "item." + ID + "tnt_minecart.desc", "Portable griefing, explodes instantly when activated");

        desc.add(YT_ID + "block." + ID + "tnt.desc", "Explodes after 4 seconds from being activated");

        desc.add(YT_ID + "item." + ID + "wooden_shovel.desc", "A brittle wooden tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "wooden_pickaxe.desc", "A brittle wooden tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "wooden_axe.desc", "A brittle wooden tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "wooden_hoe.desc", "A brittle wooden tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "stone_shovel.desc", "A sturdy stone tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "stone_pickaxe.desc", "A sturdy stone tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "stone_axe.desc", "A sturdy stone tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "stone_hoe.desc", "A sturdy stone tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "iron_shovel.desc", "A strong iron tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "iron_pickaxe.desc", "A strong iron tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "iron_axe.desc", "A strong iron tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "iron_hoe.desc", "A strong iron tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "golden_shovel.desc", "A hasty golden tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "golden_pickaxe.desc", "A hasty golden tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "golden_axe.desc", "A hasty golden tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "golden_hoe.desc", "A hasty golden tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "diamond_shovel.desc", "A shimmering diamond tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "diamond_pickaxe.desc", "A shimmering diamond tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "diamond_axe.desc", "A shimmering diamond tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "diamond_hoe.desc", "A shimmering diamond tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "netherite_shovel.desc", "A durable netherite tool, time to dig!");
        desc.add(YT_ID + "item." + ID + "netherite_pickaxe.desc", "A durable netherite tool, time to mine!");
        desc.add(YT_ID + "item." + ID + "netherite_axe.desc", "A durable netherite tool, time to chop!");
        desc.add(YT_ID + "item." + ID + "netherite_hoe.desc", "A durable netherite tool, time to farm!");

        desc.add(YT_ID + "item." + ID + "bucket.desc", "Bukkit bukkit!");
        desc.add(YT_ID + "item." + ID + "water_bucket.desc", "Stops all fall damage... if you can land it");
        desc.add(YT_ID + "item." + ID + "lava_bucket.desc", "Burns to the touch...");
        desc.add(YT_ID + "item." + ID + "powder_snow_bucket.desc", "Sinks and freezes most entities in it");
        desc.add(YT_ID + "item." + ID + "milk_bucket.desc", "Clears all effects from the user");

        desc.add(YT_ID + "item." + ID + "fishing_rod.desc", "Can be used to catch fish, when in open water has a chance to catch treasure");
        desc.add(YT_ID + "item." + ID + "flint_and_steel.desc", "Sit back and watch the world burn...");
        desc.add(YT_ID + "item." + ID + "fire_charge.desc", "Sit back and watch the world burn...");
        desc.add(YT_ID + "item." + ID + "bone_meal.desc", "Crushed bones that can be used to quickly grow crops");
        desc.add(YT_ID + "item." + ID + "shears.desc", "Can be used to finely snip foliage for the keeping");
        desc.add(YT_ID + "item." + ID + "brush.desc", "Can be used to gently brush out fragile relics");
        desc.add(YT_ID + "item." + ID + "name_tag.desc", "Can be used to rename entities");
        desc.add(YT_ID + "item." + ID + "lead.desc", "Can be used to lead animals");
        desc.add(YT_ID + "item." + ID + "compass.desc", "Points to the world spawn location unless clicked on a lodestone");
        desc.add(YT_ID + "item." + ID + "recovery_compass.desc", "Points to the user's last death location");
        desc.add(YT_ID + "item." + ID + "clock.desc", "Keeps track of the time of day");
        desc.add(YT_ID + "item." + ID + "spyglass.desc", "Can be used to zoom into the distance... I C U");
        desc.add(YT_ID + "item." + ID + "map.desc", "\"I'm the map, I'm the map!\"");
        desc.add(YT_ID + "item." + ID + "writable_book.desc", "Can be written inside or used to clone signed books, when signed cannot be editied");
        desc.add(YT_ID + "item." + ID + "ender_pearl.desc", "A mysterious pearl that teleports the user to when shattered");

        desc.add(YT_ID + "item." + ID + "elytra.desc", "A pair of wings that can be used to glide, propels the user when fireworks are usesd");
        desc.add(YT_ID + "item." + ID + "saddle.desc", "Can be used to ride some animals");
        desc.add(YT_ID + "item." + ID + "carrot_on_a_stick.desc", "When pigs fly!");
        desc.add(YT_ID + "item." + ID + "warped_fungus_on_a_stick.desc", "A strider's favorite snack!");

        desc.add(YT_ID + "item." + ID + "oak_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "oak_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "spruce_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "spruce_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "birch_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "birch_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "jungle_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "jungle_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "acacia_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "acacia_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "dark_oak_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "dark_oak_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "mangrove_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "mangrove_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "cherry_boat.desc", "\"Let's sail the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "cherry_chest_boat.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "bamboo_raft.desc", "\"Let's row the seven seas!\"");
        desc.add(YT_ID + "item." + ID + "bamboo_chest_raft.desc", "Can be used as portable storage at the cost of a seat");

        desc.add(YT_ID + "item." + ID + "goat_horn.desc", "When blown into; creates a loud sound that can be heard up to 256 blocks away");

        desc.add(YT_ID + "item." + ID + "wooden_sword.desc", "A brittle wooden blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "stone_sword.desc", "A sturdy stone blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "iron_sword.desc", "A strong iron blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "golden_sword.desc", "A hasty golden blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "diamond_sword.desc", "A shimmering diamond blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "netherite_sword.desc", "A durable netherite blade, time to strike!");
        desc.add(YT_ID + "item." + ID + "trident.desc", "Can be used for both melee and ranged combat");
        desc.add(YT_ID + "item." + ID + "shield.desc", "Can be used to block attacks, disables when struck with an axe");

        desc.add(YT_ID + "item." + ID + "leather_helmet.desc", "A soft cap to protect the user's head, can be dyed");
        desc.add(YT_ID + "item." + ID + "leather_chestplate.desc", "A soft tunic to protect the user's body, can be dyed");
        desc.add(YT_ID + "item." + ID + "leather_leggings.desc", "A soft pair of leggings to protect the user's legs, can be dyed");
        desc.add(YT_ID + "item." + ID + "leather_boots.desc", "A soft pair of boots to protect the user's feet, can be dyed");

        desc.add(YT_ID + "item." + ID + "chainmail_helmet.desc", "A sturdy helmet to protect the user's head");
        desc.add(YT_ID + "item." + ID + "chainmail_chestplate.desc", "A sturdy chestplate to protect the user's body");
        desc.add(YT_ID + "item." + ID + "chainmail_leggings.desc", "A sturdy pair of leggings to protect the user's legs");
        desc.add(YT_ID + "item." + ID + "chainmail_boots.desc", "A sturdy pair of boots to protect the user's feet");

        desc.add(YT_ID + "item." + ID + "iron_helmet.desc", "A strong helmet to protect the user's head");
        desc.add(YT_ID + "item." + ID + "iron_chestplate.desc", "A strong chestplate to protect the user's body");
        desc.add(YT_ID + "item." + ID + "iron_leggings.desc", "A strong pair of leggings to protect the user's legs");
        desc.add(YT_ID + "item." + ID + "iron_boots.desc", "A strong pair of boots to protect the user's feet");

        desc.add(YT_ID + "item." + ID + "golden_helmet.desc", "A brittle helmet to protect the user's head");
        desc.add(YT_ID + "item." + ID + "golden_chestplate.desc", "A brittle chestplate to protect the user's body");
        desc.add(YT_ID + "item." + ID + "golden_leggings.desc", "A brittle pair of leggings to protect the user's legs");
        desc.add(YT_ID + "item." + ID + "golden_boots.desc", "A brittle pair of boots to protect the user's feet");

        desc.add(YT_ID + "item." + ID + "diamond_helmet.desc", "A shimmering helmet to protect the user's head");
        desc.add(YT_ID + "item." + ID + "diamond_chestplate.desc", "A shimmering chestplate to protect the user's body");
        desc.add(YT_ID + "item." + ID + "diamond_leggings.desc", "A shimmering pair of leggings to protect the user's legs");
        desc.add(YT_ID + "item." + ID + "diamond_boots.desc", "A shimmering pair of boots to protect the user's feet");

        desc.add(YT_ID + "item." + ID + "netherite_helmet.desc", "A heavy helmet to protect the user's head, reduces knockback");
        desc.add(YT_ID + "item." + ID + "netherite_chestplate.desc", "A heavy chestplate to protect the user's body, reduces knockback");
        desc.add(YT_ID + "item." + ID + "netherite_leggings.desc", "A heavy pair of leggings to protect the user's legs, reduces knockback");
        desc.add(YT_ID + "item." + ID + "netherite_boots.desc", "A heavy pair of boots to protect the user's feet, reduces knockback");

        desc.add(YT_ID + "item." + ID + "turtle_helmet.desc", "A tough helmet that grants the user water breathing for a short time");

        desc.add(YT_ID + "item." + ID + "leather_horse_armor.desc", "Grants +3 armor points to the wearer, protects against freezing, can be dyed");
        desc.add(YT_ID + "item." + ID + "iron_horse_armor.desc", "Grants +5 armor points to the wearer");
        desc.add(YT_ID + "item." + ID + "golden_horse_armor.desc", "Grants +7 armor points to the wearer");
        desc.add(YT_ID + "item." + ID + "diamond_horse_armor.desc", "Grants +11 armor points to the wearer");

        desc.add(YT_ID + "item." + ID + "totem_of_undying.desc", "Grants immunity to death to the holder at the cost of the totem");
        desc.add(YT_ID + "item." + ID + "snowball.desc", "SNOWBALL FIGHT!!!");
        desc.add(YT_ID + "item." + ID + "egg.desc", "When thrown has a 12.5% chance to spawn a chicken and an additional 3.125% chance for four more");
        desc.add(YT_ID + "item." + ID + "bow.desc", "A sturdy weapon that can shoot arrows, deals 11 damage when fully charged");
        desc.add(YT_ID + "item." + ID + "arrow.desc", "A projectile that can be used as ammo for bows & crossbows");
        desc.add(YT_ID + "item." + ID + "spectral_arrow.desc", "A projectile that can be used as ammo for bows & crossbows, glows struck entities");

        desc.add(YT_ID + "item." + ID + "apple.desc", "An apple a day keeps the doctor away!");
        desc.add(YT_ID + "item." + ID + "golden_apple.desc", "Golden delicious!");
        desc.add(YT_ID + "item." + ID + "enchanted_golden_apple.desc", "Golden delicious!");
        desc.add(YT_ID + "item." + ID + "melon_slice.desc", "A juicy treat for hot days!");
        desc.add(YT_ID + "item." + ID + "chorus_fruit.desc", "A twisted fruit that teleports those bite into it");
        desc.add(YT_ID + "item." + ID + "carrot.desc", "A rabbit's favorite treat!");
        desc.add(YT_ID + "item." + ID + "golden_carrot.desc", "Miri's favorite <3");
        desc.add(YT_ID + "item." + ID + "potato.desc", "Poe-tay-toe, Poe-tah-toe");
        desc.add(YT_ID + "item." + ID + "baked_potato.desc", "Can operate as low as 1.1 volts");
        desc.add(YT_ID + "item." + ID + "poisonous_potato.desc", "Probably not a good idea to eat this...");
        desc.add(YT_ID + "item." + ID + "beetroot.desc", "Arbeet!");
        desc.add(YT_ID + "item." + ID + "dried_kelp.desc", "Not very nutritious but certainly easy to consume");
        desc.add(YT_ID + "item." + ID + "beef.desc", "A raw piece of meat, probably doesn't taste so good");
        desc.add(YT_ID + "item." + ID + "cooked_beef.desc", "A searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "porkchop.desc", "A raw piece of meat, probably doesn't taste so good");
        desc.add(YT_ID + "item." + ID + "cooked_porkchop.desc", "A searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "mutton.desc", "A raw piece of meat, probably doesn't taste so good");
        desc.add(YT_ID + "item." + ID + "cooked_mutton.desc", "A searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "rabbit.desc", "A raw piece of meat, probably doesn't taste so good");
        desc.add(YT_ID + "item." + ID + "cooked_rabbit.desc", "A searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "cod.desc", "A common size 1 fish found in oceans");
        desc.add(YT_ID + "item." + ID + "cooked_cod.desc", "A small searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "salmon.desc", "A common size 1 fish found in rivers and oceans");
        desc.add(YT_ID + "item." + ID + "cooked_salmon.desc", "A small searing piece of delicious meat");
        desc.add(YT_ID + "item." + ID + "tropical_fish.desc", "A small size 1 fish found in warm waters, comes in many different colors");
        desc.add(YT_ID + "item." + ID + "pufferfish.desc", "A size 1 fish that probably will make you sick if you eat it");
        desc.add(YT_ID + "item." + ID + "bread.desc", "A warm baked treat!");
        desc.add(YT_ID + "item." + ID + "cookie.desc", "A parrot's favorite treat!");
        desc.add(YT_ID + "block." + ID + "cake.desc", "The cake is a lie.");
        desc.add(YT_ID + "item." + ID + "pumpkin_pie.desc", "A tasty dessert after a long day!");
        desc.add(YT_ID + "item." + ID + "rotten_flesh.desc", "A smelly piece of flesh, better than nothing?");
        desc.add(YT_ID + "item." + ID + "spider_eye.desc", "It stares at you with spite");
        desc.add(YT_ID + "item." + ID + "mushroom_stew.desc", "Tastes great!- the bowl included");
        desc.add(YT_ID + "item." + ID + "beetroot_soup.desc", "Tastes great!- the bowl included");
        desc.add(YT_ID + "item." + ID + "rabbit_stew.desc", "Tastes great!- the bowl included");
        desc.add(YT_ID + "item." + ID + "suspicious_stew.desc", "A suspicious mixture to create an unknown stew");
        desc.add(YT_ID + "item." + ID + "honey_bottle.desc", "A nutritious drink that clears poison from the consumer");
        desc.add(YT_ID + "item." + ID + "chicken.desc", "A raw piece of meat, probably will make you sick");
        desc.add(YT_ID + "item." + ID + "cooked_chicken.desc", "A searing piece of delicious meat");

        desc.add(YT_ID + "item." + ID + "coal.desc", "Make sure you have been nice this year");
        desc.add(YT_ID + "item." + ID + "charcoal.desc", "Make sure you have been nice this year");
        desc.add(YT_ID + "item." + ID + "raw_iron.desc", "A chunk of iron that can be smelted into an ingot");
        desc.add(YT_ID + "item." + ID + "raw_copper.desc", "A chunk of copper that can be smelted into an ingot");
        desc.add(YT_ID + "item." + ID + "raw_gold.desc", "A chunk of gold that can be smelted into an ingot");
        desc.add(YT_ID + "item." + ID + "emerald.desc", "A precious gemstone that can be traded with villagers");
        desc.add(YT_ID + "item." + ID + "lapis_lazuli.desc", "A magical rock used for enchanting");
        desc.add(YT_ID + "item." + ID + "diamond.desc", "A precious gemstone used to create durable equipment");
        desc.add(YT_ID + "item." + ID + "quartz.desc", "A white crystal native to the Nether");
        desc.add(YT_ID + "item." + ID + "amethyst_shard.desc", "A purple crystal that has been harvested from a geode");
        desc.add(YT_ID + "item." + ID + "iron_nugget.desc", "A piece of an iron ingot");
        desc.add(YT_ID + "item." + ID + "gold_nugget.desc", "A piece of a gold ingot");
        desc.add(YT_ID + "item." + ID + "iron_ingot.desc", "Taste of Blood");
        desc.add(YT_ID + "item." + ID + "copper_ingot.desc", "100% Recyclable!");
        desc.add(YT_ID + "item." + ID + "gold_ingot.desc", "\"WE'RE RICH!\"");
        desc.add(YT_ID + "item." + ID + "netherite_scrap.desc", "An ancient scrap of something greater");
        desc.add(YT_ID + "item." + ID + "netherite_ingot.desc", "A durable bar of netherite, can withstand the hottest places");

        desc.add(YT_ID + "item." + ID + "stick.desc", "A thin piece of wood");
        desc.add(YT_ID + "item." + ID + "flint.desc", "A sharp rock");
        desc.add(YT_ID + "item." + ID + "wheat.desc", "Can be used to feed animals");
        desc.add(YT_ID + "item." + ID + "bone.desc", "\"What is remarkable about bones? I don't know.\"");
        desc.add(YT_ID + "item." + ID + "feather.desc", "A lightweight object primarily used for creating arrows");
        desc.add(YT_ID + "item." + ID + "leather.desc", "A flexible hide dropped from animals");
        desc.add(YT_ID + "item." + ID + "rabbit_hide.desc", "A flexible hide dropped from rabbits");
        desc.add(YT_ID + "item." + ID + "honeycomb.desc", "A sweet comb filled with honey");
        desc.add(YT_ID + "item." + ID + "ink_sac.desc", "Can be used to dye things black");
        desc.add(YT_ID + "item." + ID + "glow_ink_sac.desc", "Glow and Behold!");
        desc.add(YT_ID + "item." + ID + "turtle_scute.desc", "A hard plate from a turtle");
        desc.add(YT_ID + "item." + ID + "slime_ball.desc", "A gross ball that sticks to your fingers");
        desc.add(YT_ID + "item." + ID + "clay_ball.desc", "Can be heated into a brick");
        desc.add(YT_ID + "item." + ID + "prismarine_shard.desc", "A sharp remnant of a stone");
        desc.add(YT_ID + "item." + ID + "prismarine_crystals.desc", "Emits a pulsating glow");
        desc.add(YT_ID + "item." + ID + "nautilus_shell.desc", "The shell of a long extinct creature");
        desc.add(YT_ID + "item." + ID + "heart_of_the_sea.desc", "A shiny pearl that holds great power");
        desc.add(YT_ID + "item." + ID + "blaze_rod.desc", "A fiery rod from a blaze, burns to the touch...");
        desc.add(YT_ID + "item." + ID + "nether_star.desc", "A glowing star dropped from a monstrous being");
        desc.add(YT_ID + "item." + ID + "shulker_shell.desc", "Turning homes into storage");
        desc.add(YT_ID + "item." + ID + "popped_chorus_fruit.desc", "The fruit has hardened enough to be used for construction");
        desc.add(YT_ID + "item." + ID + "echo_shard.desc", "A strange crystal that pulsates slowly in the dark");

        desc.add(YT_ID + "item." + ID + "white_dye.desc", "Let's paint the world §fWhite§7!");
        desc.add(YT_ID + "item." + ID + "light_gray_dye.desc", "Let's paint the world §7Light Gray§7!");
        desc.add(YT_ID + "item." + ID + "gray_dye.desc", "Let's paint the world §8Gray§7!");
        desc.add(YT_ID + "item." + ID + "black_dye.desc", "Let's paint the world §0Black§7!");
        desc.add(YT_ID + "item." + ID + "brown_dye.desc", "Let's paint the world §6Brown§7!");
        desc.add(YT_ID + "item." + ID + "red_dye.desc", "Let's paint the world §4RED§7!");
        desc.add(YT_ID + "item." + ID + "orange_dye.desc", "Let's paint the world §6Orange§7!");
        desc.add(YT_ID + "item." + ID + "yellow_dye.desc", "Let's paint the world §eYellow§7!");
        desc.add(YT_ID + "item." + ID + "lime_dye.desc", "Let's paint the world §aLime§7!");
        desc.add(YT_ID + "item." + ID + "green_dye.desc", "Let's paint the world §2Green§7!");
        desc.add(YT_ID + "item." + ID + "cyan_dye.desc", "Let's paint the world §3Cyan§7!");
        desc.add(YT_ID + "item." + ID + "light_blue_dye.desc", "Let's paint the world §bLight Blue§7!");
        desc.add(YT_ID + "item." + ID + "blue_dye.desc", "Let's paint the world §9Blue§7!");
        desc.add(YT_ID + "item." + ID + "purple_dye.desc", "Let's paint the world §5Purple§7!");
        desc.add(YT_ID + "item." + ID + "magenta_dye.desc", "Let's paint the world §dMagenta§7!");
        desc.add(YT_ID + "item." + ID + "pink_dye.desc", "Let's paint the world §dPink§7!");

        desc.add(YT_ID + "item." + ID + "bowl.desc", "Can be used to store liquids and food");
        desc.add(YT_ID + "item." + ID + "brick.desc", "A warm brick that can be put together to create a block");
        desc.add(YT_ID + "item." + ID + "nether_brick.desc", "A warm brick that can be put together to create a block");
        desc.add(YT_ID + "item." + ID + "paper.desc", "Beware of paper cuts!");
        desc.add(YT_ID + "item." + ID + "book.desc", "Leather and paper that awaits being written in");
        desc.add(YT_ID + "item." + ID + "glass_bottle.desc", "\"The drink is all this man ever was. And when it's gone, what remains is the bottle.\"");

        desc.add(YT_ID + "item." + ID + "glowstone_dust.desc", "A glowing pile of dust");
        desc.add(YT_ID + "item." + ID + "gunpowder.desc", "A gray powder that can cause explosions");
        desc.add(YT_ID + "item." + ID + "dragon_breath.desc", "A smelly bottle of magical breath");
        desc.add(YT_ID + "item." + ID + "fermented_spider_eye.desc", "Causes the effects of potions to reverse");
        desc.add(YT_ID + "item." + ID + "blaze_powder.desc", "It's intense heat can fuel brewing stands");
        desc.add(YT_ID + "item." + ID + "sugar.desc", "\"Eat too much and you will run up the walls!\"");
        desc.add(YT_ID + "item." + ID + "rabbit_foot.desc", "Luck is on your side!");
        desc.add(YT_ID + "item." + ID + "glistering_melon_slice.desc", "Gold infused into a melon to grant it healing capabilities");
        desc.add(YT_ID + "item." + ID + "magma_cream.desc", "A hot cream that burns your fingers");
        desc.add(YT_ID + "item." + ID + "ghast_tear.desc", "A teardrop that is used to mend wounds");
        desc.add(YT_ID + "item." + ID + "phantom_membrane.desc", "Tonight is going to be a horrible night.");

        desc.add(YT_ID + "item." + ID + "angler_pottery_sherd.desc", "\"It's just 200 fish\"");
        desc.add(YT_ID + "item." + ID + "archer_pottery_sherd.desc", "A ceramic remnant with a bow painted on it");
        desc.add(YT_ID + "item." + ID + "arms_up_pottery_sherd.desc", "A ceramic remnant with a figure pointing their arms up painted on it");
        desc.add(YT_ID + "item." + ID + "blade_pottery_sherd.desc", "A ceramic remnant with a sharp blade painted on it");
        desc.add(YT_ID + "item." + ID + "brewer_pottery_sherd.desc", "A ceramic remnant with a bitter brew painted on it");
        desc.add(YT_ID + "item." + ID + "burn_pottery_sherd.desc", "A ceramic remnant with an ember painted on it");
        desc.add(YT_ID + "item." + ID + "danger_pottery_sherd.desc", "A ceramic remnant with a creeper painted on it");
        desc.add(YT_ID + "item." + ID + "explorer_pottery_sherd.desc", "\"Finder's keepers!\"");
        desc.add(YT_ID + "item." + ID + "friend_pottery_sherd.desc", "\"Best friends forever\"");
        desc.add(YT_ID + "item." + ID + "heart_pottery_sherd.desc", "A ceramic remnant with a heart painted on it");
        desc.add(YT_ID + "item." + ID + "heartbreak_pottery_sherd.desc", "A ceramic remnant with a broken heart painted on it");
        desc.add(YT_ID + "item." + ID + "howl_pottery_sherd.desc", "A ceramic remnant with a wolf painted on it");
        desc.add(YT_ID + "item." + ID + "miner_pottery_sherd.desc", "A ceramic remnant with a pickaxe painted on it");
        desc.add(YT_ID + "item." + ID + "mourner_pottery_sherd.desc", "A ceramic remnant with something wicked painted on it");
        desc.add(YT_ID + "item." + ID + "plenty_pottery_sherd.desc", "A ceramic remnant with a chest painted on it");
        desc.add(YT_ID + "item." + ID + "prize_pottery_sherd.desc", "A ceramic remnant with a gemstone painted on it");
        desc.add(YT_ID + "item." + ID + "sheaf_pottery_sherd.desc", "A ceramic remnant with wheat painted on it");
        desc.add(YT_ID + "item." + ID + "shelter_pottery_sherd.desc", "A ceramic remnant with a tree painted on it");
        desc.add(YT_ID + "item." + ID + "skull_pottery_sherd.desc", "A ceramic remnant with a skull painted on it");
        desc.add(YT_ID + "item." + ID + "snort_pottery_sherd.desc", "A ceramic remnant with an ancient creature painted on it");

        desc.add(YT_ID + "item." + ID + "netherite_upgrade_smithing_template.desc", "A netherrack tablet that can upgrade diamond equipment to netherite");
        desc.add(YT_ID + "item." + ID + "smithing_template.desc", "A mysterious tablet that can be used to trim armor");

        desc.add(YT_ID + "item." + ID + "sentry_armor_trim_smithing_template.desc", "A cobblestone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "vex_armor_trim_smithing_template.desc", "A cobblestone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "wild_armor_trim_smithing_template.desc", "A mossy cobblestone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "coast_armor_trim_smithing_template.desc", "A cobblestone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "dune_armor_trim_smithing_template.desc", "A sandstone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "wayfinder_armor_trim_smithing_template.desc", "A terracotta tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "host_armor_trim_smithing_template.desc", "A terracotta tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "shaper_armor_trim_smithing_template.desc", "A terracotta tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "raiser_armor_trim_smithing_template.desc", "A terracotta tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "ward_armor_trim_smithing_template.desc", "A cobbled deepslate tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "silence_armor_trim_smithing_template.desc", "A cobbled deepslate tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "tide_armor_trim_smithing_template.desc", "A prismarine tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "snout_armor_trim_smithing_template.desc", "A blackstone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "rib_armor_trim_smithing_template.desc", "A netherrack tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "eye_armor_trim_smithing_template.desc", "An end stone tablet that can be used to trim armor");
        desc.add(YT_ID + "item." + ID + "spire_trim_smithing_template.desc", "A purpur block tablet that can be used to trim armor");

        desc.add(YT_ID + "item." + ID + "experience_bottle.desc", "A glowing bottle that can contain 3-11 experience");
        desc.add(YT_ID + "item." + ID + "enchanted_book.desc", "A glowing book that can be used to upgrade equipment");

        desc.add(YT_ID + "block." + ID + "spawner.desc", "A metallic block that summons whatever is inside of it");

        desc.add(YT_ID + "item." + ID + "allay_spawn_egg.desc", "A small blue fairy that collects items for others");
        desc.add(YT_ID + "item." + ID + "axolotl_spawn_egg.desc", "A small aquatic creature that comes in many colors!");
        desc.add(YT_ID + "item." + ID + "bat_spawn_egg.desc", "A small animal with poor vision, relying entirely on echolocation");
        desc.add(YT_ID + "item." + ID + "bee_spawn_egg.desc", "According to all know laws of aviation there is no way a bee should be able to fly.");
        desc.add(YT_ID + "item." + ID + "blaze_spawn_egg.desc", "A fiery elemental that shoots balls of fire");
        desc.add(YT_ID + "item." + ID + "camel_spawn_egg.desc", "A tall animal that can be ridden by 2 people, they like to sleep");
        desc.add(YT_ID + "item." + ID + "cat_spawn_egg.desc", "A small animal that likes to bring gifts home to it's owners");
        desc.add(YT_ID + "item." + ID + "cave_spider_spawn_egg.desc", "A small monster that poisons attackers");
        desc.add(YT_ID + "item." + ID + "chicken_spawn_egg.desc", "A small animal that lays eggs occasionally");
        desc.add(YT_ID + "item." + ID + "cod_spawn_egg.desc", "A size 1 fish that commonly swims through oceans");
        desc.add(YT_ID + "item." + ID + "cow_spawn_egg.desc", "A large animal that can be milked");
        desc.add(YT_ID + "item." + ID + "creeper_spawn_egg.desc", "A monster that will explode when near it's target");
        desc.add(YT_ID + "item." + ID + "dolphin_spawn_egg.desc", "An aquatic creature that will lead those who feed it to buried treasure");
        desc.add(YT_ID + "item." + ID + "donkey_spawn_egg.desc", "An animal that can be ridden for faster travel or be strapped with a chest");
        desc.add(YT_ID + "item." + ID + "drowned_spawn_egg.desc", "A zombie that learned to swim a little too late...");
        desc.add(YT_ID + "item." + ID + "elder_guardian_spawn_egg.desc", "An unnatural fish-like monster that guards it's monument");
        desc.add(YT_ID + "item." + ID + "enderman_spawn_egg.desc", "A creature from another world with mysterious intentions");
        desc.add(YT_ID + "item." + ID + "endermite_spawn_egg.desc", "A small creature with immense hatred for enderic creatures");
        desc.add(YT_ID + "item." + ID + "evoker_spawn_egg.desc", "An outcast of a village who has magical powers");
        desc.add(YT_ID + "item." + ID + "fox_spawn_egg.desc", "A small animal that loves to eat berries- and chickens");
        desc.add(YT_ID + "item." + ID + "frog_spawn_egg.desc", "A small animal that loves to eat slimes and magma cubes");
        desc.add(YT_ID + "item." + ID + "ghast_spawn_egg.desc", "A large monster that shoots explosive balls at it's target");
        desc.add(YT_ID + "item." + ID + "glow_squid_spawn_egg.desc", "A glowing creature that can be found in caverns");
        desc.add(YT_ID + "item." + ID + "goat_spawn_egg.desc", "Greatest of all Time");
        desc.add(YT_ID + "item." + ID + "guardian_spawn_egg.desc", "An unnatural fish-like monster that guards it's monument");
        desc.add(YT_ID + "item." + ID + "hoglin_spawn_egg.desc", "An animal that roams the crimson forests, fights back it's predators");
        desc.add(YT_ID + "item." + ID + "horse_spawn_egg.desc", "An animal that can be ridden for faster travel");
        desc.add(YT_ID + "item." + ID + "husk_spawn_egg.desc", "A monster that starves it's victims");
        desc.add(YT_ID + "item." + ID + "iron_golem_spawn_egg.desc", "An unnatural creation to guard those who create it");
        desc.add(YT_ID + "item." + ID + "llama_spawn_egg.desc", "An animal that spits at those who bother it");
        desc.add(YT_ID + "item." + ID + "magma_cube_spawn_egg.desc", "A fiery monster that can jump extremely high");
        desc.add(YT_ID + "item." + ID + "mooshroom_spawn_egg.desc", "A cow that has been overtaken by fungus, produces mushroom stew");
        desc.add(YT_ID + "item." + ID + "mule_spawn_egg.desc", "An animal that can be ridden for faster travel or be strapped with a chest");
        desc.add(YT_ID + "item." + ID + "ocelot_spawn_egg.desc", "A fast animal that flees from those who scare it");
        desc.add(YT_ID + "item." + ID + "panda_spawn_egg.desc", "A large furry animal who enjoys bamboo... and cake?");
        desc.add(YT_ID + "item." + ID + "parrot_spawn_egg.desc", "A small animal that can be tamed with seeds");
        desc.add(YT_ID + "item." + ID + "phantom_spawn_egg.desc", "An undead monster to pester those who experience insomnia");
        desc.add(YT_ID + "item." + ID + "pig_spawn_egg.desc", "A small pink animal that can be ridden");
        desc.add(YT_ID + "item." + ID + "piglin_spawn_egg.desc", "A humanoid creature with an immense obsession for gold, can be tricked by those who wear gold");
        desc.add(YT_ID + "item." + ID + "piglin_brute_spawn_egg.desc", "A fierce piglin guard who defends it's bastion");
        desc.add(YT_ID + "item." + ID + "pillager_spawn_egg.desc", "An outcast of a village who has nothing but hatred for villagers");
        desc.add(YT_ID + "item." + ID + "polar_bear_spawn_egg.desc", "A large animal who will do anything to defend it's cub");
        desc.add(YT_ID + "item." + ID + "pufferfish_spawn_egg.desc", "A small creature that poisons those who scare it");
        desc.add(YT_ID + "item." + ID + "rabbit_spawn_egg.desc", "A small, sweet, precious animal who could kill anyone at any moment");
        desc.add(YT_ID + "item." + ID + "ravager_spawn_egg.desc", "A massive beast ridden by pillagers");
        desc.add(YT_ID + "item." + ID + "salmon_spawn_egg.desc", "A size 1 fish that commonly swims through rivers and oceans");
        desc.add(YT_ID + "item." + ID + "sheep_spawn_egg.desc", "A fluffy animal who can be dyed and sheared");
        desc.add(YT_ID + "item." + ID + "shulker_spawn_egg.desc", "An enderic guardian that blends in with it's environment");
        desc.add(YT_ID + "item." + ID + "silverfish_spawn_egg.desc", "A pesty creature that infests stone blocks");
        desc.add(YT_ID + "item." + ID + "skeleton_spawn_egg.desc", "A smart monster who can use a bow to attack it's target");
        desc.add(YT_ID + "item." + ID + "skeleton_horse_spawn_egg.desc", "A horse that succumbed a terrible fate");
        desc.add(YT_ID + "item." + ID + "slime_spawn_egg.desc", "A bouncy monster that splits into smaller pieces upon death");
        desc.add(YT_ID + "item." + ID + "sniffer_spawn_egg.desc", "An ancient creature who can locate ancient seeds in the ground");
        desc.add(YT_ID + "item." + ID + "snow_golem_spawn_egg.desc", "An unnatural creation who fires snowballs at it's target");
        desc.add(YT_ID + "item." + ID + "spider_spawn_egg.desc", "A monster that can climb walls to reach it's target");
        desc.add(YT_ID + "item." + ID + "squid_spawn_egg.desc", "A creature that can be found in oceans");
        desc.add(YT_ID + "item." + ID + "stray_spawn_egg.desc", "A skeleton who has been frozen over, uses slowing arrows to keep it's target in place");
        desc.add(YT_ID + "item." + ID + "strider_spawn_egg.desc", "A creature who can be ridden across lava if fed");
        desc.add(YT_ID + "item." + ID + "tadpole_spawn_egg.desc", "A small creature that grows up into different frogs based on the temperature of the biome it grows up in");
        desc.add(YT_ID + "item." + ID + "trader_llama_spawn_egg.desc", "An animal that spits at those who bother it or it's owner");
        desc.add(YT_ID + "item." + ID + "tropical_fish_spawn_egg.desc", "A size 1 fish that commonly swims through warm oceans, comes in 2700 variants");
        desc.add(YT_ID + "item." + ID + "turtle_spawn_egg.desc", "A slow animal who drops it's scute when maturing");
        desc.add(YT_ID + "item." + ID + "vex_spawn_egg.desc", "A small gray fairy that attacks others with a sharp iron blade");
        desc.add(YT_ID + "item." + ID + "villager_spawn_egg.desc", "A creature who is willing to trade various items to others");
        desc.add(YT_ID + "item." + ID + "vindicator_spawn_egg.desc", "An outcast of a village who has nothing but hatred for villagers");
        desc.add(YT_ID + "item." + ID + "wandering_trader_spawn_egg.desc", "A creature who is willing to trade various unique items to others");
        desc.add(YT_ID + "item." + ID + "warden_spawn_egg.desc", "A massive monster who can only navigate using smell and vibrations");
        desc.add(YT_ID + "item." + ID + "witch_spawn_egg.desc", "A creature who has extensive knowledge in brewing");
        desc.add(YT_ID + "item." + ID + "wither_skeleton_spawn_egg.desc", "A smart monster who can use a sword to attack amd wither it's target");
        desc.add(YT_ID + "item." + ID + "wolf_spawn_egg.desc", "An animal who hunts sheep and can be tamed using a bone");
        desc.add(YT_ID + "item." + ID + "zoglin_spawn_egg.desc", "A hoglin who has been infected by the colder air of a different dimension, kills everything in sight");
        desc.add(YT_ID + "item." + ID + "zombie_spawn_egg.desc", "An undead monster that infects others");
        desc.add(YT_ID + "item." + ID + "zombie_horse_spawn_egg.desc", "A horse that succumbed a terrible fate");
        desc.add(YT_ID + "item." + ID + "zombie_villager_spawn_egg.desc", "An undead monster that infects others, can be cured with a golden apple and weakness");
        desc.add(YT_ID + "item." + ID + "zombified_piglin_spawn_egg.desc", "A piglin who has been infected by the colder air of a different dimension");
        desc.add(YT_ID + "item." + ID + "ender_dragon_spawn_egg.desc", "The last of it's kind defending what it still can");
        desc.add(YT_ID + "item." + ID + "wither_spawn_egg.desc", "A terrible amalgamate that kills anything that comes in it's path");

        desc.add(YT_ID + "block." + ID + "command_block.desc", "A powerful block that can execute various commands only when activated");
        desc.add(YT_ID + "block." + ID + "chain_command_block.desc", "A powerful block that can execute various commands every time it's triggered");
        desc.add(YT_ID + "block." + ID + "repeating_command_block.desc", "A powerful block that can execute various commands every 1/20th of a second if activated");
        desc.add(YT_ID + "item." + ID + "command_block_minecart.desc", "Acts similar to a repeating command block but can move on rails");
        desc.add(YT_ID + "block." + ID + "jigsaw.desc", "Allows creating small templates that can be used for larger structures");
        desc.add(YT_ID + "block." + ID + "structure_block.desc", "Allows saving and loading structures");
        desc.add(YT_ID + "block." + ID + "structure_void.desc", "When in a loaded structure it will turn into the block that originally existed at it's position in the world");
        desc.add(YT_ID + "block." + ID + "barrier.desc", "An invisible block that cannot be broken, block outline becomes invisible in survival");
        desc.add(YT_ID + "item." + ID + "debug_stick.desc", "When the attack key is used it will select a blockstate, when the use key is used it will change the blockstates");
        desc.add(YT_ID + "block." + ID + "light.desc", "An invisible block that glows");
        desc.add(YT_ID + "block." + ID + "petrified_oak_slab.desc", "A remnant of the past...");

        desc.add(YT_ID + "item." + EB_ID + "royalty_pottery_sherd.desc", "Fit for a queen!");
        desc.add(YT_ID + "item." + EB_ID + "ancient_pottery_sherd.desc", "Suffering leaves, suffering leaves");
        desc.add(YT_ID + "item." + EB_ID + "bitter_pottery_sherd.desc", "A mixture of dried spices- oh wait it's just paint...");
        desc.add(YT_ID + "item." + EB_ID + "boin_pottery_sherd.desc", "A ceramic remnant with a currency painted on it");
        desc.add(YT_ID + "item." + EB_ID + "bustling_pottery_sherd.desc", "A ceramic remnant with a fungus painted on it");
        desc.add(YT_ID + "item." + EB_ID + "checkered_pottery_sherd.desc", "A ceramic remnant with a checkered pattern painted on it");
        desc.add(YT_ID + "item." + EB_ID + "decay_pottery_sherd.desc", "A ceramic remnant with a wither skull painted on it");
        desc.add(YT_ID + "item." + EB_ID + "destruction_pottery_sherd.desc", "A ceramic remnant with a horrible storm painted on it");
        desc.add(YT_ID + "item." + EB_ID + "forwards_pottery_sherd.desc", "A ceramic remnant with an arrow painted on it");
        desc.add(YT_ID + "item." + EB_ID + "hexxed_pottery_sherd.desc", "A ceramic remnant with a hex painted on it");
        desc.add(YT_ID + "item." + EB_ID + "kitteh_pottery_sherd.desc", "A cewamic wemnant with a colwon thwee painted on it");
        desc.add(YT_ID + "item." + EB_ID + "life_pottery_sherd.desc", "A ceramic remnant with an ankh painted on it");
        desc.add(YT_ID + "item." + EB_ID + "mesmerize_pottery_sherd.desc", "A ceramic remnant with a mesmerizing eye painted on it");
        desc.add(YT_ID + "item." + EB_ID + "portal_pottery_sherd.desc", "A ceramic remnant with a portal painted on it");
        desc.add(YT_ID + "item." + EB_ID + "pottery_pottery_sherd.desc", "A ceramic remnant with a pot painted on it");
        desc.add(YT_ID + "item." + EB_ID + "ring_pottery_sherd.desc", "\"Tell em to make it count\"");
        desc.add(YT_ID + "item." + EB_ID + "snout_pottery_sherd.desc", "A ceramic remnant with a snout painted on it");
        desc.add(YT_ID + "item." + EB_ID + "sprite_pottery_sherd.desc", "A ceramic remnant with a-esprite painted on it");
        desc.add(YT_ID + "item." + EB_ID + "twins_pottery_sherd.desc", "A ceramic remnant with twin hearts painted on it");
        desc.add(YT_ID + "item." + EB_ID + "wrathful_pottery_sherd.desc", "A ceramic remnant with an ancient evil painted on it");
        desc.add(YT_ID + "item." + EB_ID + "is_that_pottery_sherd.desc", ":)");
        desc.add(YT_ID + "item." + EB_ID + "kokos_bug_pottery_sherd.desc", "A ceramic remnant with a KOKOS BUG painted on it");
        desc.add(YT_ID + "item." + EB_ID + "thief_pottery_sherd.desc", "A ceramic remnant with a thief painted on it");

        desc.add(YT_ID + "item." + AC_ID + "red_paintbrush.desc", "§4...so pick up your brush, and paint §4the world §4§lRED");

        desc.add(YT_ID + "item." + SP_ID + "frozen_porkchop.desc", "A frigid porkchop that freezes the consumer");
        desc.add(YT_ID + "item." + SP_ID + "snow_pig_spawn_egg.desc", "A pig that has been frozen by powdered snow");
    }
}