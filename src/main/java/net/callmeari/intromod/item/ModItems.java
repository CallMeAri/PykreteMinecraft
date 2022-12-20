package net.callmeari.intromod.item;

import net.callmeari.intromod.IntroMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IntroMod.MOD_ID);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

