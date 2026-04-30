package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

public class ModMaterials {
    public static final TagKey<Item> REPAIRS_CRYSTALLITE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "repairs_crystallite_armor"));
    public static final ToolMaterial CRYSTALLIE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            7555555,
            10.0f,
            1.5f,
            200,
            REPAIRS_CRYSTALLITE_ARMOR
    );
    public static final TagKey<Item> REPAIRS_BLACK_METALL_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "repairs_black_metall_armor"));
    public static final ToolMaterial BLACK_METALL_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            755555555,
            11.5f,
            2f,
            255,
            REPAIRS_BLACK_METALL_ARMOR
    );
   public static final TagKey<Item> REPAIRS_MOB_DROP_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "repairs_mob_drop_armor"));
   public static final ToolMaterial MOB_DROP_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            800000000,
            13.5f,
            4f,
            255,
            REPAIRS_MOB_DROP_ARMOR
    );
}
