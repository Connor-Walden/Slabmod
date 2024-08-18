package net.salami.slabandstairmod.items.tools;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.salami.slabandstairmod.blocks.ModBlocks;
import net.salami.slabandstairmod.blocks.slabs.SlabBlock;
import net.salami.slabandstairmod.blocks.slabs.SlabType;
import net.salami.slabandstairmod.items.ModItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Configurator extends Item
{
    private List<String> ssList = new ArrayList<String>();

    public Configurator(Item.Properties pProperties)
    {
        super(pProperties);

        ssList.add("block.slabandstairmod.acacia_slab");
        ssList.add("block.slabandstairmod.andesite_slab");
    }

    public InteractionResult useOn(UseOnContext pContext)
    {
        if(pContext.getHand() == InteractionHand.MAIN_HAND) {
            String clickedName = pContext.getLevel().getBlockState(pContext.getClickedPos()).getBlock().getName().getContents().toString().split("'")[1];
            Player player = pContext.getPlayer();

            // Rotate slabs so player can achieve any orientation without destroying and replacing the block
            if (ssList.contains(clickedName)) {
                if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.TOP)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BACK), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.BACK)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.RIGHT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.RIGHT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.FRONT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.FRONT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.LEFT), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.LEFT)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.BOTTOM), 1);
                else if (pContext.getLevel().getBlockState(pContext.getClickedPos()).getValue(SlabBlock.TYPE) == SlabType.BOTTOM)
                    pContext.getLevel().setBlock(pContext.getClickedPos(), ModBlocks.ACACIA_SLAB.get().defaultBlockState().setValue(SlabBlock.TYPE, SlabType.TOP), 1);
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
