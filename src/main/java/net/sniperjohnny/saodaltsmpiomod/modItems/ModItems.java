package net.sniperjohnny.saodaltsmpiomod.modItems;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.sniperjohnny.saodaltsmpiomod.Saodaltsmpiomod;

import java.util.function.Function;

public class ModItems {
    public static Consumable RABBIT_RAGOUT_CONSUMABLE_COMPONENT = Consumables.defaultFood()

            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SATURATION, 100 * 20, 1), 10f))
            .build();

    public static final FoodProperties RABBIT_RAGOUT_COMPONENT = new FoodProperties.Builder()
            .alwaysEdible()
            .build();
    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {

        //Resource Item Key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Saodaltsmpiomod.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    public static final Item RABBIT_RAGOUT = register("rabbit_ragout", Item::new, new Item.Properties()
            .food(RABBIT_RAGOUT_COMPONENT, RABBIT_RAGOUT_CONSUMABLE_COMPONENT));
    public static final Item CRYSTALLITE_ORE = register("crystallite_ore", Item::new, new Item.Properties());
    public static final Item REINFORCED_LEATHER_STICK = register("reinforced_leather_stick", Item::new, new Item.Properties());
    public static final Item METALL = register("metall", Item::new, new Item.Properties());
    public static final Item METALL_SCRAP = register("metall_scrap", Item::new, new Item.Properties());
    public static void initialize() {

        }

}
