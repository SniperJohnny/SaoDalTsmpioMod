package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

import java.util.function.Function;

public class ModTools {
    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {

        //Resource Item Key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    public static final Item CRYSTALLITE_PICKAXE = register("crystallite_pickaxe",
            Item::new,
            new Item.Properties().pickaxe(ModMaterials.CRYSTALLIE_TOOL_MATERIAL, 4f, -2.4f));

    public static final Item CRYSTALLITE_AXE = register("crystallite_axe",
            Item::new,
            new Item.Properties().axe(ModMaterials.CRYSTALLIE_TOOL_MATERIAL, 10f, -2.8f));
    public static final Item CRYSTALLITE_SHOVEL = register("crystallite_shovel",
            Item::new,
            new Item.Properties.shovel(ModMaterials.BLACK_METALL_TOOL_MATERIAL, 3f, -2.3f
    public static final Item BLACK_METALL_AXE = register("black_metall_axe", 
            Item::new,
            new Item.Properties().axe(ModMaterials.BLACK_METALL_TOOL_MATERIAL, 9f, -2.8f)
    public static void initialize() {

    }
}
