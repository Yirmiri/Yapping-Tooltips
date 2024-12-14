package net.azurune.yapping_tooltips.mixin;

import net.azurune.yapping_tooltips.YTConfig;
import net.azurune.yapping_tooltips.YappingTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.language.ClientLanguage;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.mojang.blaze3d.platform.InputConstants;
import java.util.List;

@Mixin(Item.class)
public abstract class ItemStackMixin {

	@Shadow public abstract String getDescriptionId();

	@Inject(at = @At("HEAD"), method = "appendHoverText")
	private void getTooltip(ItemStack stack, Item.TooltipContext context, List<Component> tooltip, TooltipFlag type, CallbackInfo ci) {
		if (ClientLanguage.getInstance().has(YappingTooltips.MOD_ID + "." + this.getDescriptionId() + ".desc")) {

			//if translation is empty do not display a tooltip
			if (!ClientLanguage.getInstance().getOrDefault(YappingTooltips.MOD_ID + "." + this.getDescriptionId() + ".desc").isEmpty()) {

				//if sneak key is pressed or enableSneakToDisplay is false then display tooltip
				if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), (Minecraft.getInstance().options.keyShift).getDefaultKey().getValue())) {
						//|| !YTConfig.ENABLE_SNEAK_TO_DISPLAY.get()) { //TODO: Re-add im lazy and its 2am
					tooltip.add(Component.translatable(YappingTooltips.MOD_ID + "." + this.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY));

				} else {
					tooltip.add(Component.translatable("yapping_tooltips.more_information",
							Component.translatable(Minecraft.getInstance().options.keyShift.saveString())
									.withStyle(ChatFormatting.GOLD)).withStyle(ChatFormatting.GRAY));
				}
			}
		}
	}
}