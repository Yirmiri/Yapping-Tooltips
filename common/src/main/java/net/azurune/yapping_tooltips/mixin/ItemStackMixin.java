package net.azurune.yapping_tooltips.mixin;

import com.mojang.blaze3d.platform.InputConstants;
import net.azurune.yapping_tooltips.YappingTooltips;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.language.ClientLanguage;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    @Inject(method = "getTooltipLines", at = @At("RETURN"), cancellable = true)
    private void yappingTooltips$getTooltipLines(Item.TooltipContext pTooltipContext, Player pPlayer, TooltipFlag pTooltipFlag, CallbackInfoReturnable<List<Component>> cir) {
        ItemStack stack = (ItemStack) (Object) this;
        List<Component> tooltip = new ArrayList<>(cir.getReturnValue());

        if (ClientLanguage.getInstance().has(YappingTooltips.MOD_ID + "." + stack.getDescriptionId() + ".desc")) {
            //if translation is empty do not display a tooltip
            if (!ClientLanguage.getInstance().getOrDefault(YappingTooltips.MOD_ID + "." + stack.getDescriptionId() + ".desc").isEmpty()) {

                //if sneak key is pressed or enableSneakToDisplay is false then display tooltip
                if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), (Minecraft.getInstance().options.keyShift).getDefaultKey().getValue())) {
                    //|| !YTConfig.ENABLE_SNEAK_TO_DISPLAY.get()) { //TODO: Re-add im lazy and its 2am
                    tooltip.add(1, Component.translatable(YappingTooltips.MOD_ID + "." + stack.getDescriptionId() + ".desc").withStyle(ChatFormatting.GRAY));

                } else {
                    tooltip.add(1, Component.translatable("yapping_tooltips.more_information",
                            Component.translatable(Minecraft.getInstance().options.keyShift.saveString()).withStyle(ChatFormatting.GOLD)).withStyle(ChatFormatting.GOLD)); //custom color config
                }
            }
        }
        cir.setReturnValue(tooltip);
    }
}