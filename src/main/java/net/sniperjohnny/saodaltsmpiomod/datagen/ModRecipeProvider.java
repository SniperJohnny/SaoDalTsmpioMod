package net.sniperjohnny.saodaltsmpiomod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModItems;
import net.sniperjohnny.saodaltsmpiomod.modItems.ModTools;
import net.sniperjohnny.saodaltsmpiomod.modblocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput explorer) {
        return new RecipeProvider(registryLookup, explorer) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.COMBAT, ModTools.CRYSTALLITE_PICKAXE, 1)
                        .pattern("ccc")
                        .pattern(" s ")
                        .pattern(" s ")
                        .define('s', Items.STICK)
                        .define('c', ModItems.CRYSTALLITE_ORE)
                        .group("crystallite_pickaxe")
                        .unlockedBy(getHasName(ModItems.CRYSTALLITE_ORE), has(ModItems.CRYSTALLITE_ORE))
                        .save(output);
                shaped(RecipeCategory.COMBAT, ModTools.CRYSTALLITE_AXE, 1)
                        .pattern("cc ")
                        .pattern("cs ")
                        .pattern(" s ")
                        .define('s', Items.STICK)
                        .define('c', ModItems.CRYSTALLITE_ORE)
                        .group("crystallite_axe")
                        .unlockedBy(getHasName(ModItems.CRYSTALLITE_ORE), has(ModItems.CRYSTALLITE_ORE))
                        .save(output);

                shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALLITE_BLOCK, 1)
                        .pattern("ccc")
                        .pattern("ccc")
                        .pattern("ccc")
                        .define('c', ModItems.CRYSTALLITE_ORE)
                        .group("crystallite_block")
                        .unlockedBy(getHasName(ModItems.CRYSTALLITE_ORE), has(ModItems.CRYSTALLITE_ORE))
                        .save(output);
                shapeless(RecipeCategory.MISC, ModItems.CRYSTALLITE_ORE, 9)
                        .requires(ModBlocks.CRYSTALLITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.CRYSTALLITE_BLOCK), has(ModBlocks.CRYSTALLITE_BLOCK))
                        .save(output);
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
