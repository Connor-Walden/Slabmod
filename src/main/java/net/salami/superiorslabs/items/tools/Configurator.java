package net.salami.superiorslabs.items.tools;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import net.salami.superiorslabs.blocks.ModBlocks;
import net.salami.superiorslabs.blocks.slabs.SlabBlock;
import net.salami.superiorslabs.blocks.slabs.SlabType;

import java.util.ArrayList;
import java.util.List;

public class Configurator extends Item
{
    private List<String> ssList = new ArrayList<String>();

    public Configurator(Item.Properties pProperties)
    {
        super(pProperties);

        ssList.add("block.superiorslabs.acacia_slab");
        ssList.add("block.superiorslabs.andesite_slab");
        ssList.add("block.superiorslabs.bamboo_mosaic_slab");
        ssList.add("block.superiorslabs.bamboo_slab");
        ssList.add("block.superiorslabs.birch_slab");
        ssList.add("block.superiorslabs.blackstone_slab");
        ssList.add("block.superiorslabs.brick_slab");
        ssList.add("block.superiorslabs.cherry_slab");
        ssList.add("block.superiorslabs.cobbled_deppslate_slab");
        ssList.add("block.superiorslabs.cobblestone_slab");
        ssList.add("block.superiorslabs.crimson_slab");
        ssList.add("block.superiorslabs.cut_copper_slab");
        ssList.add("block.superiorslabs.cut_red_sandstone_slab");
        ssList.add("block.superiorslabs.cut_sandstone_slab");
        ssList.add("block.superiorslabs.dark_oak_slab");
        ssList.add("block.superiorslabs.dark_prismarine_slab");
        ssList.add("block.superiorslabs.deepslate_brick_slab");
        ssList.add("block.superiorslabs.deepslate_tile_slab");
    }

    public InteractionResult useOn(UseOnContext pContext)
    {
        if(pContext.getHand() == InteractionHand.MAIN_HAND) {
            String clickedName = pContext.getLevel().getBlockState(pContext.getClickedPos()).getBlock().getName().getContents().toString().split("'")[1];
            Player player = pContext.getPlayer();

            // Rotate slabs so player can achieve any orientation without destroying and replacing the block
            if (ssList.contains(clickedName)) {
                BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos());

                if (blockstate.getValue(SlabBlock.TYPE) == SlabType.TOP)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BACK), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.BACK)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.RIGHT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.RIGHT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.FRONT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.FRONT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.LEFT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.LEFT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BOTTOM), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), blockstate.getBlock().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.TOP), 1);
            }

            if (player != null) {
                pContext.getItemInHand().hurtAndBreak(1, player, (p_43122_) -> {
                    p_43122_.broadcastBreakEvent(pContext.getHand());
                });
            }
        }

        return InteractionResult.sidedSuccess(pContext.getLevel().isClientSide);
    }
}
