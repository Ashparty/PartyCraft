
package net.mcreator.partycraft.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.partycraft.ElementsPartycraftMod;

@ElementsPartycraftMod.ModElement.Tag
public class LootTableButterachvement extends ElementsPartycraftMod.ModElement {
	public LootTableButterachvement(ElementsPartycraftMod instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("partycraft", "butterachvement"));
	}
}
