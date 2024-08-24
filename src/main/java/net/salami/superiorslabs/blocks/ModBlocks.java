package net.salami.superiorslabs.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.salami.superiorslabs.Slabmod;
import net.salami.superiorslabs.blocks.slabs.SlabBlock;
import net.salami.superiorslabs.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Slabmod.MOD_ID);

    // replacing vanilla behaviour
    public static final RegistryObject<Block> ACACIA_SLAB = registerBlock("acacia_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)));
    public static final RegistryObject<Block> ANDESITE_SLAB = registerBlock("andesite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE_SLAB)));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC_SLAB)));
    public static final RegistryObject<Block> BAMBOO_SLAB = registerBlock("bamboo_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC_SLAB)));
    public static final RegistryObject<Block> BIRCH_SLAB = registerBlock("birch_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB)));
    public static final RegistryObject<Block> BLACKSTONE_SLAB = registerBlock("blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE_SLAB)));
    public static final RegistryObject<Block> BRICK_SLAB = registerBlock("brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_SLAB)));
    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_SLAB = registerBlock("cobbled_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_SLAB)));
    public static final RegistryObject<Block> COBBLESTONE_SLAB = registerBlock("cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> CRIMSON_SLAB = registerBlock("crimson_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB)));
    public static final RegistryObject<Block> CUT_COPPER_SLAB = registerBlock("cut_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB)));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_SLAB = registerBlock("cut_red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> CUT_SANDSTONE_SLAB = registerBlock("cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> DARK_OAK_SLAB = registerBlock("dark_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB)));
    public static final RegistryObject<Block> DARK_PRISMARINE_SLAB = registerBlock("dark_prismarine_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE_SLAB)));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_SLAB = registerBlock("deepslate_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB)));
    public static final RegistryObject<Block> DEEPSLATE_TILE_SLAB = registerBlock("deepslate_tile_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILE_SLAB)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}
