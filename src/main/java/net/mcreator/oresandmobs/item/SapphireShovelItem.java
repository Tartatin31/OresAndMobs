
package net.mcreator.oresandmobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.oresandmobs.OresandmobsModElements;

@OresandmobsModElements.ModElement.Tag
public class SapphireShovelItem extends OresandmobsModElements.ModElement {
	@ObjectHolder("oresandmobs:sapphire_shovel")
	public static final Item block = null;
	public SapphireShovelItem(OresandmobsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3254;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 1, -2.7999999999999998f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sapphire_shovel"));
	}
}
