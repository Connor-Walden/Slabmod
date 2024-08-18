package net.salami.slabandstairmod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.salami.slabandstairmod.Slabmod;
import net.salami.slabandstairmod.items.tools.Configurator;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Slabmod.MOD_ID);

    public static final RegistryObject<Item> CONFIGURATOR = ITEMS.register("configurator",
            () -> new Configurator(new Item.Properties()));

    public static void register(IEventBus eventbus)
    {
        ITEMS.register(eventbus);
    }
}
