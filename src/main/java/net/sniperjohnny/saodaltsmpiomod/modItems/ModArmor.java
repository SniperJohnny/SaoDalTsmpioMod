package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

import java.util.function.Function;


public class ModArmor {

    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {

        //Resource Item Key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item BLACK_LEATHER_HELMET = register(
            "black_leather_helmet",
            Item::new,
            new Item.Properties().humanoidArmor(ArmorMaterials.INSTANCE, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ArmorMaterials.BASE_DURABILITY))
    );
    public static final Item BLACKWYRMCOAT = register("blackwyrmcoat",
            Item::new,
            new Item.Properties().humanoidArmor(ArmorMaterials.INSTANCE, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(ArmorMaterials.BASE_DURABILITY))
    );

    public static final Item BLACK_LEATHER_LEGGINGS = register(
            "black_leather_leggings",
            Item::new,
            new Item.Properties().humanoidArmor(ArmorMaterials.INSTANCE, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(ArmorMaterials.BASE_DURABILITY))
    );

    public static final Item BLACK_LEATHER_BOOTS = register(
            "black_leather_boots",
            Item::new,
            new Item.Properties().humanoidArmor(ArmorMaterials.INSTANCE, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(ArmorMaterials.BASE_DURABILITY))
    );

    public static void initialize() {

    }
}
