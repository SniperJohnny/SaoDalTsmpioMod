package net.sniperjohnny.saodaltsmpiomod.modItems;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

import java.util.function.Function;

public class ModWeapons {  public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {

    //Resource Item Key
    ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, name));

    GenericItem item = itemFactory.apply(settings.setId(itemKey));

    Registry.register(BuiltInRegistries.ITEM, itemKey, item);

    return item;
}

public static final Item DARK_REPULSOR = register(
        "dark_repulsor",
        Item::new,
        new Item.Properties().sword(ModMaterials.CRYSTALLIE_TOOL_MATERIAL, 10f, -2.4f)
);

public static void initialize() {

}
}
