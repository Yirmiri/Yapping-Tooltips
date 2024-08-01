package net.azurune.yapping_tooltips.mixin;

import net.azurune.yapping_tooltips.YTConfig;
import net.azurune.yapping_tooltips.YappingTooltips;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
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
	private void getTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type, CallbackInfo ci) {
		if (TranslationStorage.getInstance().hasTranslation(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc")) {

			//if translation is empty do not display a tooltip
			if (!TranslationStorage.getInstance().get(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc").isEmpty()) {

				//if sneak key is pressed or enableSneakToDisplay is false then display tooltip
				if (InputUtil.isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), ((IKeybindingMixin) MinecraftClient.getInstance().options.sneakKey).getBoundKey().getCode())
						|| !YTConfig.ENABLE_SNEAK_TO_DISPLAY.get()) {
					tooltip.add(Text.translatable(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc").formatted(Formatting.GRAY));

				} else {
					tooltip.add(Text.translatable("yapping_tooltips.more_information",
							Text.translatable(MinecraftClient.getInstance().options.sneakKey.getBoundKeyTranslationKey())
									.formatted(Formatting.GOLD)).formatted(Formatting.GRAY));
				}
			}
		}
	}
}