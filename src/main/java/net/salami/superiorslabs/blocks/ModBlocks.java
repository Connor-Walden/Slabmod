package net.salami.superiorslabs.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.salami.superiorslabs.Slabmod;
import net.salami.superiorslabs.blocks.slabs.SlabBlock;
import net.salami.superiorslabs.items.ModItems;

import java.util.function.Supplier;


// SLABS
// replaces vanilla slabs and adds a few more slab variants to satisfy your building needs!

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
    public static final RegistryObject<Block> DIORITE_SLAB = registerBlock("diorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE_SLAB)));
    public static final RegistryObject<Block> END_STONE_BRICK_SLAB = registerBlock("end_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> EXPOSED_CUT_COPPER_SLAB = registerBlock("exposed_cut_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER_SLAB)));
    public static final RegistryObject<Block> GRANITE_SLAB = registerBlock("granite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE_SLAB)));
    public static final RegistryObject<Block> JUNGLE_SLAB = registerBlock("jungle_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB)));
    public static final RegistryObject<Block> MANGROVE_SLAB = registerBlock("mangrove_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB)));
    public static final RegistryObject<Block> MOSSY_COBBLESTONE_SLAB = registerBlock("mossy_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB)));
    public static final RegistryObject<Block> MOSSY_STONE_BRICK_SLAB = registerBlock("mossy_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> MUD_BRICK_SLAB = registerBlock("mud_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICK_SLAB)));
    public static final RegistryObject<Block> NETHER_BRICK_SLAB = registerBlock("nether_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_SLAB)));
    public static final RegistryObject<Block> OAK_SLAB = registerBlock("oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_SLAB = registerBlock("oxidized_cut_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER_SLAB)));
    public static final RegistryObject<Block> PETRIFIED_OAK_SLAB = registerBlock("petrified_oak_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PETRIFIED_OAK_SLAB)));
    public static final RegistryObject<Block> POLISHED_ANDESITE_SLAB = registerBlock("polished_andesite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("polished_blackstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB)));
    public static final RegistryObject<Block> POLISHED_BLACKSTONE_SLAB = registerBlock("polished_blackstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_SLAB)));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_SLAB = registerBlock("polished_deepslate_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE_SLAB)));
    public static final RegistryObject<Block> POLISHED_DIORITE_SLAB = registerBlock("polished_diorite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE_SLAB)));
    public static final RegistryObject<Block> POLISHED_GRANITE_SLAB = registerBlock("polished_granite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE_SLAB)));
    public static final RegistryObject<Block> PRISMARINE_BRICK_SLAB = registerBlock("prismarine_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICK_SLAB)));
    public static final RegistryObject<Block> PRISMARINE_SLAB = registerBlock("prismarine_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_SLAB)));
    public static final RegistryObject<Block> PURPUR_SLAB = registerBlock("purpur_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_SLAB)));
    public static final RegistryObject<Block> QUARTZ_SLAB = registerBlock("quartz_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));
    public static final RegistryObject<Block> RED_NETHER_BRICK_SLAB = registerBlock("red_nether_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICK_SLAB)));
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB = registerBlock("red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> SANDSTONE_SLAB = registerBlock("sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE_SLAB)));
    public static final RegistryObject<Block> SMOOTH_QUARTZ_SLAB = registerBlock("smooth_quartz_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_SLAB)));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_SLAB = registerBlock("smooth_red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_SLAB = registerBlock("smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> SMOOTH_STONE_SLAB = registerBlock("smooth_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB)));
    public static final RegistryObject<Block> SPRUCE_SLAB = registerBlock("spruce_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB)));
    public static final RegistryObject<Block> STONE_BRICK_SLAB = registerBlock("stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)));
    public static final RegistryObject<Block> STONE_SLAB = registerBlock("stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<Block> WARPED_SLAB = registerBlock("warped_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_SLAB)));
    public static final RegistryObject<Block> WEATHERED_CUT_COPPER_SLAB = registerBlock("weathered_cut_copper_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER_SLAB)));

    // Make sure to register the block and the block item
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // This separates the block items from regular items, keeps the 'ModItems' file clean.
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus)
    {
        BLOCKS.register(eventbus);
    }
}
