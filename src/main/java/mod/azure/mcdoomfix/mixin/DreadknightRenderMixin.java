package mod.azure.mcdoomfix.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.azure.doom.client.render.DreadKnightRender;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

@Mixin(DreadKnightRender.class)
public abstract class DreadknightRenderMixin extends GeoEntityRenderer {

	public DreadknightRenderMixin(EntityRendererManager renderManager, AnimatedGeoModel modelProvider) {
		super(renderManager, modelProvider);
	}

	@Overwrite
	public void renderRecursively(GeoBone bone, MatrixStack stack, IVertexBuilder bufferIn, int packedLightIn,
			int packedOverlayIn, float red, float green, float blue, float alpha) {
		super.renderRecursively(bone, stack, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}
}
