package com.mtr.smartpassengers.client;

import com.mtr.smartpassengers.PassengerEntity;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PassengerRenderer extends MobRenderer<PassengerEntity, PlayerModel<PassengerEntity>> {

    private static final ResourceLocation STEVE_TEXTURE =
            new ResourceLocation("minecraft", "textures/entity/steve.png");

    public PassengerRenderer(
            EntityRendererProvider.Context context
    ) {
        super(
                context,
                new PlayerModel<>(context.bakeLayer(ModelLayers.PLAYER), false),
                0.5F
        );
    }

    @Override
    public ResourceLocation getTextureLocation(PassengerEntity entity) {
        return STEVE_TEXTURE;
    }
}
