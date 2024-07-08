package net.azurune.yapping_tooltips.mixin;

import net.azurune.yapping_tooltips.YappingTooltips;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(Item.class)
public abstract class ItemStackMixin {
	@Shadow
	public abstract String getTranslationKey();

	@Inject(at = @At("HEAD"), method = "appendTooltip")
	private void getTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context, CallbackInfo ci) {
		if (TranslationStorage.getInstance().hasTranslation(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc") && !stack.isOf(Items.SPYGLASS)) {
			if (InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(),
					((IKeybindingMixin) MinecraftClient.getInstance().options.sneakKey).getBoundKey().getCode())) {
				tooltip.add(Text.translatable(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc").formatted(Formatting.GRAY));
			} else {
				tooltip.add(Text.translatable("yapping_tooltips.more_information",
						Text.translatable(MinecraftClient.getInstance().options.sneakKey.getBoundKeyTranslationKey())
								.formatted(Formatting.GOLD)).formatted(Formatting.GRAY));
			}
		}
		if (!YappingTooltips.isModLoaded("stained-lenses") && stack.isOf(Items.SPYGLASS)) { //removes spyglass tooltip if Stained Lenses is installed to prevent double tooltips
			tooltip.add(Text.translatable("yapping_tooltips.item.minecraft.spyglass.desc").formatted(Formatting.GRAY));
		}
	}
}
//TODO: Add configs for colors and shift key