
package net.mcreator.oresandmobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.oresandmobs.OresandmobsModElements;

@OresandmobsModElements.ModElement.Tag
public class SapphireSwordItem extends OresandmobsModElements.ModElement {
	@ObjectHolder("oresandmobs:sapphire_sword")
	public static final Item block = null;
	public SapphireSwordItem(OresandmobsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3254;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 4.5f;
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
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("sapphire_sword"));
	}
}
