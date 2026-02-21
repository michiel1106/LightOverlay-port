package me.shedaniel.lightoverlay.neoforge.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import me.shedaniel.lightoverlay.neoforge.LightOverlayImpl;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.debug.DebugRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DebugRenderer.class)
public class MixinDebugRenderer {
    @Inject(method = "emitGizmos", at = @At("HEAD"))
    private void render(Frustum arg, double d, double e, double f, float g, CallbackInfo ci) {
        LightOverlayImpl.renderWorldLast(null);
    }
}
