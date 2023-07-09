package com.smartergolem.items;

import com.smartergolem.mod.SmarterGolemMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // create a list of items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SmarterGolemMod.MOD_ID);

    public static final RegistryObject<Item> CoIB = ITEMS.register("core_of_intelligence_block",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> SGS = ITEMS.register("neo_golem_spawn",
            () -> new NeoGolemSpawnItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void registerItems(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
