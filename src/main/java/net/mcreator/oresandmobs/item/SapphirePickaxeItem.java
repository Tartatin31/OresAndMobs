
package net.mcreator.oresandmobs.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.oresandmobs.OresandmobsModElements;

@OresandmobsModElements.ModElement.Tag
public class SapphirePickaxeItem extends OresandmobsModElements.ModElement {
	@ObjectHolder("oresandmobs:sapphire_pickaxe")
	public static final Item block = null;
	public SapphirePickaxeItem(OresandmobsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3254;
			}

			public float getEfficiency() {
				return 8.5f;
			}

			public float getAttackDamage() {
				return 4f;
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
		}.setRegistryName("sapphire_pickaxe"));
	}
}
