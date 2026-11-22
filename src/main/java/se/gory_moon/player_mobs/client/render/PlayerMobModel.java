package se.gory_moon.player_mobs.client.render;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import se.gory_moon.player_mobs.entity.PlayerMobEntity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class PlayerMobModel extends PlayerModel<PlayerMobEntity> {
    public PlayerMobModel(ModelPart root, boolean slim) {
        super(root, slim);
    }

    @Override
    public void setupAnim(PlayerMobEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        if (entity.isBaby()) {
            hat.visible = true;
        }
    }

    @Override
    protected Iterable<ModelPart> headParts() {
        return young ? ImmutableList.of(head, hat) : super.headParts();
    }

    @Override
    protected Iterable<ModelPart> bodyParts() {
        return young ? Iterables.filter(super.bodyParts(), part -> part != hat) : super.bodyParts();
    }
}
