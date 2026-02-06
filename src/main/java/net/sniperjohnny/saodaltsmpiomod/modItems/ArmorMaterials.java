package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

import java.util.Map;

public class ArmorMaterials {
    public static final int BASE_DURABILITY = 15555;
    public static final TagKey<Item> REPAIRS_BLACK_LEATHER_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "repairs_black_leather_armor"));
    public static final ResourceKey<EquipmentAsset> BLACK_LEATHER_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, "black_leather"));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 10,
                    ArmorType.CHESTPLATE, 15,
                    ArmorType.LEGGINGS, 13,
                    ArmorType.BOOTS, 10
            ),
            5000,
            SoundEvents.ARMOR_EQUIP_LEATHER,
            5.0F,
            0.5F,
            REPAIRS_BLACK_LEATHER_ARMOR,
            BLACK_LEATHER_MATERIAL_KEY
    );
}
