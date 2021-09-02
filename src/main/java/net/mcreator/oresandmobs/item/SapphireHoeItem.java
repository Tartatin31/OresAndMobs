
package net.mcreator.oresandmobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.oresandmobs.OresandmobsModElements;

@OresandmobsModElements.ModElement.Tag
public class SapphireHoeItem extends OresandmobsModElements.ModElement {
	@ObjectHolder("oresandmobs:sapphire_hoe")
	public static final Item block = null;
	public SapphireHoeItem(OresandmobsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3254;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SapphireItem.block));
			}
		}, 0, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sapphire_hoe"));
	}
}
