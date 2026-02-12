package net.sniperjohnny.saodaltsmpiomod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;
import net.sniperjohnny.saodaltsmpiomod.modblocks.ModBlocks;

import javax.print.DocFlavor;
import java.util.concurrent.CompletableFuture;


public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.CRYSTALLITE_BLOCK);
        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.CRYSTALLITE_BLOCK);

    }
}
