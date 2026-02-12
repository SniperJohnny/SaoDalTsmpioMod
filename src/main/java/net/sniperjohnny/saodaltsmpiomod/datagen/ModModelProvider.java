package net.sniperjohnny.saodaltsmpiomod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModArmor;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModItems;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModTools;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModWeapons;
import net.sniperjohnny.saodaltsmpiomod.modblocks.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
    //normal cube
    blockModelGenerators.createTrivialCube(ModBlocks.CRYSTALLITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
    itemModelGenerators.generateFlatItem(ModItems.CRYSTALLITE_ORE, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.METALL_SCRAP, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.METALL, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.REINFORCED_LEATHER_STICK, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.RABBIT_RAGOUT, ModelTemplates.FLAT_ITEM);

    //tools/weapons
    itemModelGenerators.generateFlatItem(ModTools.CRYSTALLITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerators.generateFlatItem(ModWeapons.DARK_REPULSOR, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerators.generateFlatItem(ModWeapons.ELUCIDATOR, ModelTemplates.FLAT_HANDHELD_ITEM);
    itemModelGenerators.generateFlatItem(ModTools.CRYSTALLITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);

    //Armor_Item
        itemModelGenerators.generateFlatItem(ModArmor.BLACK_LEATHER_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModArmor.BLACKWYRMCOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModArmor.BLACK_LEATHER_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModArmor.BLACK_LEATHER_BOOTS, ModelTemplates.FLAT_ITEM);
    }
}
