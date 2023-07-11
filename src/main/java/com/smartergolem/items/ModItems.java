package com.smartergolem.items;

import com.smartergolem.items.custom.NeoGolemSpawnItem;
import com.smartergolem.mod.SmarterGolemMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // create a list of items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SmarterGolemMod.MOD_ID);

    public static final RegistryObject<Item> SGS = ITEMS.register("neo_golem_spawn",
            () -> new NeoGolemSpawnItem(new Item.Properties().tab(ModCreativeTab.NEO_GOLEM_TAB)));

    public static void registerItems(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
