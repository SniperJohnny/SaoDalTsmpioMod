package net.sniperjohnny.saodaltsmpiomod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sniperjohnny.saodaltsmpiomod.datagen.ModModelProvider;
import net.sniperjohnny.saodaltsmpiomod.datagen.ModRecipeProvider;

public class SaodaltsmpiomodDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
