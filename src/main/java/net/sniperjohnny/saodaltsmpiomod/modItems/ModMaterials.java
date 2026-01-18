package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

public class ModMaterials {
    public static final TagKey<Item> REPAIRS_CRYSTALLITE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "repairs_crystallite_armor"));
    public static final ToolMaterial CRYSTALLIE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            7555555,
            10.0f,
            1.5f,
            200,
            REPAIRS_CRYSTALLITE_ARMOR
    );

}
