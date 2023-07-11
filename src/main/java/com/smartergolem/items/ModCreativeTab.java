package com.smartergolem.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab NEO_GOLEM_TAB = new CreativeModeTab("neogolemtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SGS.get());
        }
    };
}
