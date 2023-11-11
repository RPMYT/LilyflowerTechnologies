package xyz.lilyflower.technologies.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.lilyflower.technologies.LilyTech;

public class Registries {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, LilyTech.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LilyTech.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB, LilyTech.MODID);

    public static void init(IEventBus bus) {
        Registries.BLOCKS.register(bus);
        Registries.ITEMS.register(bus);
        Registries.TABS.register(bus);
    }

    public static RegistryObject<Item> item(String name, Item item) {
        return ITEMS.register(name, () -> item);
    }
}
