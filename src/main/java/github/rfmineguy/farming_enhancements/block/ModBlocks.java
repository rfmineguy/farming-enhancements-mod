package github.rfmineguy.farming_enhancements.block;

import github.rfmineguy.farming_enhancements.FarmingEnhancements;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MY_BLOCK = RegisterBlock("my_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block RegisterBlock(String name, Block block) {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FarmingEnhancements.MOD_ID, name), block);
    }
    private static Item RegisterBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FarmingEnhancements.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void RegisterModBlocks() {
        FarmingEnhancements.LOGGER.info("Registering ModBlocks for " + FarmingEnhancements.MOD_ID);
        FarmingEnhancements.LOGGER.info("Registered  ModBlocks for " + FarmingEnhancements.MOD_ID);
    }
}
