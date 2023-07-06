package com.smartergolem.entity;


import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class NeoGolemEntity extends Mob{
    protected NeoGolemEntity(EntityType<? extends Mob> p_21368_, Level p_21369_) {
        super(p_21368_, p_21369_);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // This makes the golem attack any ZombieEntity in sight
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Zombie.class, true));
    }


    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        // Here you can define what happens when a player interacts with your golem
        // For example, you can make the golem play a sound:
        this.level.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.ANVIL_FALL, this.getSoundSource(), 1.0F, 1.0F);
        return InteractionResult.SUCCESS;
    }

}
