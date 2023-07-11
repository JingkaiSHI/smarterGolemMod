package com.smartergolem.items.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class NeoGolemSpawnItem extends Item {
    public NeoGolemSpawnItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
//        if (!context.getLevel().isClientSide) { // make sure this is on the server side
//            BlockPos pos = context.getClickedPos(); // get the position where the player clicked
//            Level world = context.getLevel(); // get the current world
//
//            NeoGolemEntity golem = ModEntityTypes.NEO_GOLEM.get().create(world); // create a new instance of your golem
//            golem.moveTo(pos, 0, 0); // set the golem's position
//            world.addFreshEntity(golem); // add the golem to the world
//        }

        return InteractionResult.SUCCESS; // return success to indicate the item was used successfully
    }
}
