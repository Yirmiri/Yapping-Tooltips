package net.azurune.yapping_tooltips.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin(KeyBinding.class)
public interface IKeybindingMixin {
    @Accessor("boundKey")
    InputUtil.Key getBoundKey();
}