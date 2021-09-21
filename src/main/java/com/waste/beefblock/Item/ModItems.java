package com.waste.beefblock.Item;

import com.waste.beefblock.beefblock;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {
    public static final Food blockfood = new Food.Builder().hunger(29).saturation(.5f).build();
    public static final DeferredRegister<Item>
            ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, beefblock.MOD_ID);

    public static final RegistryObject<Item> BEEF_BLOCK = ITEMS.register("beefblock",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(blockfood)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
