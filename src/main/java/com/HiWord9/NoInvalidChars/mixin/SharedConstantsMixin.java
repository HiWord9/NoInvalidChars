package com.HiWord9.NoInvalidChars.mixin;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
	@Inject(at = @At("RETURN"), method = "isValidChar", cancellable = true)
	private static void init(char chr, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}
}
