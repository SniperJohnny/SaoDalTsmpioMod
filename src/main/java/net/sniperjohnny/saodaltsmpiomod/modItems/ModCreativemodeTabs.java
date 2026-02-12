package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;
import net.sniperjohnny.saodaltsmpiomod.modblocks.ModBlocks;


public class ModCreativemodeTabs {
    public static final ResourceKey<CreativeModeTab> SAODALTSMPIO_INGREDIENTS_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "ingredients"));
    public static final CreativeModeTab SAODALTSMPIO_INGREDIENTS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CRYSTALLITE_ORE))
            .title(Component.translatable("itemgroup.saodaltsmpio_ingredients"))
            .build();


    public static final CreativeModeTab SAODALTSMPIO_FOOD = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RABBIT_RAGOUT))
            .title(Component.translatable("itemgroup.saodaltsmpio_food"))
            .build();
    public static final ResourceKey<CreativeModeTab> SAODALTSMPIO_FOOD_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "food"));

    // WEAPONS/tools TAB
    public static final ResourceKey<CreativeModeTab> SAODALTSMPIO_WEAPONS_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "weapons"));

    public static final CreativeModeTab SAODALTSMPIO_WEAPONS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModWeapons.DARK_REPULSOR))
            .title(Component.translatable("itemgroup.saodaltsmpio_weapons"))
            .build();
    // WEAPONS TAB
    public static final ResourceKey<CreativeModeTab> SAODALTSMPIO_TOOLS_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "tools"));

    public static final CreativeModeTab SAODALTSMPIO_tools = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModTools.CRYSTALLITE_PICKAXE))
            .title(Component.translatable("itemgroup.saodaltsmpio_tools"))
            .build();
    // BLOCK TAB
    public static final ResourceKey<CreativeModeTab> SAODALTSMPIO_BLOCKS_KEY =
            ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),
                    Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "blocks"));

    public static final CreativeModeTab SAODALTSMPIO_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.CRYSTALLITE_BLOCK))
            .title(Component.translatable("itemgroup.saodaltsmpio_blocks"))
            .build();




    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SAODALTSMPIO_INGREDIENTS_KEY, SAODALTSMPIO_INGREDIENTS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SAODALTSMPIO_TOOLS_KEY, SAODALTSMPIO_tools);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SAODALTSMPIO_WEAPONS_KEY, SAODALTSMPIO_WEAPONS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SAODALTSMPIO_FOOD_KEY, SAODALTSMPIO_FOOD);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, SAODALTSMPIO_BLOCKS_KEY, SAODALTSMPIO_BLOCKS);
        //INGREDIENTS
        ItemGroupEvents.modifyEntriesEvent(SAODALTSMPIO_INGREDIENTS_KEY).register(group -> {
            group.accept(ModItems.CRYSTALLITE_ORE);
            group.accept(ModItems.METALL_SCRAP);
            group.accept(ModItems.METALL);
            group.accept(ModItems.REINFORCED_LEATHER_STICK);
        });

        //TOOLS
        ItemGroupEvents.modifyEntriesEvent(SAODALTSMPIO_TOOLS_KEY).register(group -> {
            group.accept(ModTools.CRYSTALLITE_PICKAXE);
            group.accept(ModTools.CRYSTALLITE_AXE);
        });

        //WEAPONS
        ItemGroupEvents.modifyEntriesEvent(SAODALTSMPIO_WEAPONS_KEY).register(group -> {
            group.accept(ModWeapons.DARK_REPULSOR);
            group.accept(ModWeapons.ELUCIDATOR);
        });

        //FOOD
        ItemGroupEvents.modifyEntriesEvent(SAODALTSMPIO_FOOD_KEY).register(group -> {
            group.accept(ModItems.RABBIT_RAGOUT);
        });
        //Blocks
        ItemGroupEvents.modifyEntriesEvent(SAODALTSMPIO_BLOCKS_KEY).register(group -> {
            group.accept(ModBlocks.CRYSTALLITE_BLOCK);
        });
    }
}
