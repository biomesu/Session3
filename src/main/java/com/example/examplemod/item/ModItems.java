package com.example.examplemod.item;
import com.example.examplemod.block.ModBlocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ACMIUM = ITEMS.register("raw_acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
