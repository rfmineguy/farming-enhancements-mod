package github.rfmineguy.farming_enhancements;

import github.rfmineguy.farming_enhancements.block.ModBlocks;
import github.rfmineguy.farming_enhancements.item.ModItemGroups;
import github.rfmineguy.farming_enhancements.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmingEnhancements implements ModInitializer {
	public static final String MOD_ID = "item_transmutation";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.RegisterModItemGroups();
		ModItems.RegisterModItems();
		ModBlocks.RegisterModBlocks();

		for (Item i : Registries.ITEM) {
			LOGGER.info(Item.getRawId(i) + "");
		}
	}
}