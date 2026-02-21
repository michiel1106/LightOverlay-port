package me.shedaniel.lightoverlay.fabric.mixin;

import com.mojang.blaze3d.vertex.*;
import me.shedaniel.lightoverlay.fabric.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.debug.*;
import net.minecraft.client.renderer.rendertype.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(DebugRenderer.class)
public class MixinDebugRenderer {
    @Inject(method = "emitGizmos", at = @At("HEAD"))
    private void render(Frustum frustum, double d, double e, double f, float g, CallbackInfo ci) {
        LightOverlayImpl.renderWorldLast(null);

    }
}
