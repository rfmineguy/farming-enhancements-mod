package github.rfmineguy.farming_enhancements.item;

import github.rfmineguy.farming_enhancements.FarmingEnhancements;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CURRENCY_LOW = RegisterItem("currency_low", new Item(new FabricItemSettings()));

    private static void AddItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CURRENCY_LOW);
    }

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FarmingEnhancements.MOD_ID, name), item);
    }

    public static void RegisterModItems() {
        FarmingEnhancements.LOGGER.info("Registering ModItems for " + FarmingEnhancements.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientTabItemGroup);

        FarmingEnhancements.LOGGER.info("Registered ModItems for " + FarmingEnhancements.MOD_ID);
    }
}
