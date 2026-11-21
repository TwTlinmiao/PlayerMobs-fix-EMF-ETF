package se.gory_moon.player_mobs.client.render;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import se.gory_moon.player_mobs.entity.PlayerMobEntity;

public class PlayerMobModel extends PlayerModel<PlayerMobEntity> {
    public PlayerMobModel(ModelPart root, boolean slim) {
        super(root, slim);
    }

    @Override
    public void setupAnim(PlayerMobEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        if (entity.isBaby()) {
            hat.copyFrom(head);
            hat.visible = true;
        }
    }
}
