package net.azurune.yapping_tooltips.mixin;

import com.mojang.blaze3d.platform.InputConstants;
import net.azurune.yapping_tooltips.YTConfig;
import net.azurune.yapping_tooltips.YappingTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.client.resources.language.ClientLanguage;
import net.minecraft.client.util.InputUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(Item.class)
public abstract class ItemStackMixin {
	@Unique
	public abstract String getTranslationKey();

	@Inject(at = @At("HEAD"), method = "appendHoverText")
	private void getTooltip(ItemStack pStack, Item.TooltipContext pContext, List<Component> tooltip, TooltipFlag pTooltipFlag, CallbackInfo ci) {
		if (ClientLanguage.getInstance().has(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc")) {

			//if translation is empty do not display a tooltip
			if (!ClientLanguage.getInstance().getOrDefault(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc").isEmpty()) {

				//if sneak key is pressed or enableSneakToDisplay is false then display tooltip
				if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), ((IKeybindingMixin) Minecraft.getInstance().options.keyShift).getBoundKey().getValue())
						|| !YTConfig.ENABLE_SNEAK_TO_DISPLAY.get()) {
					tooltip.add(Component.translatable(YappingTooltips.MOD_ID + "." + this.getTranslationKey() + ".desc").withStyle(ChatFormatting.GRAY));

				} else {
					tooltip.add(Component.translatable("yapping_tooltips.more_information",
							Component.translatable(Minecraft.getInstance().options.keyShift.getName())
									.withStyle(ChatFormatting.GOLD)).withStyle(ChatFormatting.GRAY));
				}
			}
		}
	}
}