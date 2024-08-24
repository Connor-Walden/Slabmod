package net.salami.superiorslabs;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.salami.superiorslabs.blocks.ModBlocks;
import net.salami.superiorslabs.items.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Slabmod.MOD_ID)
public class Slabmod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "superiorslabs";

    public Slabmod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(final BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
        {
            event.accept(ModItems.CONFIGURATOR);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ModBlocks.ACACIA_SLAB);
            event.accept(ModBlocks.ANDESITE_SLAB);
            event.accept(ModBlocks.BAMBOO_MOSAIC_SLAB);
            event.accept(ModBlocks.BAMBOO_SLAB);
            event.accept(ModBlocks.BIRCH_SLAB);
            event.accept(ModBlocks.BLACKSTONE_SLAB);
            event.accept(ModBlocks.BRICK_SLAB);
            event.accept(ModBlocks.CHERRY_SLAB);
            event.accept(ModBlocks.COBBLED_DEEPSLATE_SLAB);
            event.accept(ModBlocks.COBBLESTONE_SLAB);
            event.accept(ModBlocks.CRIMSON_SLAB);
            event.accept(ModBlocks.CUT_COPPER_SLAB);
            event.accept(ModBlocks.CUT_RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.CUT_SANDSTONE_SLAB);
            event.accept(ModBlocks.DARK_OAK_SLAB);
            event.accept(ModBlocks.DARK_PRISMARINE_SLAB);
            event.accept(ModBlocks.DEEPSLATE_BRICK_SLAB);
            event.accept(ModBlocks.DEEPSLATE_TILE_SLAB);
            event.accept(ModBlocks.DIORITE_SLAB);
            event.accept(ModBlocks.END_STONE_BRICK_SLAB);
            event.accept(ModBlocks.EXPOSED_CUT_COPPER_SLAB);
            event.accept(ModBlocks.GRANITE_SLAB);
            event.accept(ModBlocks.JUNGLE_SLAB);
            event.accept(ModBlocks.MANGROVE_SLAB);
            event.accept(ModBlocks.MOSSY_COBBLESTONE_SLAB);
            event.accept(ModBlocks.MOSSY_STONE_BRICK_SLAB);
            event.accept(ModBlocks.MUD_BRICK_SLAB);
            event.accept(ModBlocks.NETHER_BRICK_SLAB);
            event.accept(ModBlocks.OAK_SLAB);
            event.accept(ModBlocks.OXIDIZED_CUT_COPPER_SLAB);
            event.accept(ModBlocks.PETRIFIED_OAK_SLAB);
            event.accept(ModBlocks.POLISHED_ANDESITE_SLAB);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_BRICK_SLAB);
            event.accept(ModBlocks.POLISHED_BLACKSTONE_SLAB);
            event.accept(ModBlocks.POLISHED_DEEPSLATE_SLAB);
            event.accept(ModBlocks.POLISHED_DIORITE_SLAB);
            event.accept(ModBlocks.POLISHED_GRANITE_SLAB);
            event.accept(ModBlocks.PRISMARINE_SLAB);
            event.accept(ModBlocks.PRISMARINE_BRICK_SLAB);
            event.accept(ModBlocks.PURPUR_SLAB);
            event.accept(ModBlocks.QUARTZ_SLAB);
            event.accept(ModBlocks.RED_NETHER_BRICK_SLAB);
            event.accept(ModBlocks.RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.SANDSTONE_SLAB);
            event.accept(ModBlocks.SMOOTH_QUARTZ_SLAB);
            event.accept(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.SMOOTH_RED_SANDSTONE_SLAB);
            event.accept(ModBlocks.SMOOTH_SANDSTONE_SLAB);
            event.accept(ModBlocks.SMOOTH_STONE_SLAB);
            event.accept(ModBlocks.SPRUCE_SLAB);
            event.accept(ModBlocks.STONE_BRICK_SLAB);
            event.accept(ModBlocks.STONE_SLAB);
            event.accept(ModBlocks.WARPED_SLAB);
            event.accept(ModBlocks.WEATHERED_CUT_COPPER_SLAB);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
