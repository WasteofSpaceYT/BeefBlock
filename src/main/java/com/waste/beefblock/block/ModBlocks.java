package com.waste.beefblock.block;

import com.waste.beefblock.Item.ModItems;
import com.waste.beefblock.beefblock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static DeferredRegister<Block>
            Blocks = DeferredRegister.create(ForgeRegistries.BLOCKS, beefblock.MOD_ID);
    public static RegistryObject<Block> beefblockblock = registerBlock("beefblockblock", () -> new Block(AbstractBlock.Properties.create(Material.NETHER_PLANTS).hardnessAndResistance(3f).sound(SoundType.HONEY)));

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = Blocks.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    }
    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }

}
