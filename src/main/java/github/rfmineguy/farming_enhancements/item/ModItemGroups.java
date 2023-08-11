package github.rfmineguy.farming_enhancements.item;

import github.rfmineguy.farming_enhancements.FarmingEnhancements;
import github.rfmineguy.farming_enhancements.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEM_GROUP =
            Registry.register(Registries.ITEM_GROUP,
                    new Identifier(FarmingEnhancements.MOD_ID, "group"),
                    FabricItemGroup.builder().displayName(Text.translatable("item_group.group")).icon(ModItems.CURRENCY_LOW::getDefaultStack)
                            .entries(((displayContext, entries) -> {
                                entries.add(ModItems.CURRENCY_LOW);
                                entries.add(ModBlocks.MY_BLOCK);
                            })).build());

    public static void RegisterModItemGroups() {

    }
}
