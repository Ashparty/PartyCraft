
package net.mcreator.partycraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.partycraft.ElementsPartycraftMod;

@ElementsPartycraftMod.ModElement.Tag
public class ItemButterset extends ElementsPartycraftMod.ModElement {
	@GameRegistry.ObjectHolder("partycraft:buttersethelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("partycraft:buttersetbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("partycraft:buttersetlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("partycraft:buttersetboots")
	public static final Item boots = null;
	public ItemButterset(ElementsPartycraftMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BUTTERSET", "partycraft:butter", 30, new int[]{5, 7, 8, 6}, 100,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.firework.blast")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("buttersethelmet")
				.setRegistryName("buttersethelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("buttersetbody")
				.setRegistryName("buttersetbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("buttersetlegs")
				.setRegistryName("buttersetlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("buttersetboots")
				.setRegistryName("buttersetboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("partycraft:buttersethelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("partycraft:buttersetbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("partycraft:buttersetlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("partycraft:buttersetboots", "inventory"));
	}
}
