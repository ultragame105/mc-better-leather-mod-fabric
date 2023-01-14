package tk.ultragame105.betterleather;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;


public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("magic-stuff");

	// an instance of our new item
	public static final Item CUSTOM_ITEM =
			Registry.register(Registry.ITEM, new Identifier("magic-stuff", "custom_item_thing"),
					new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(3)));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		LOGGER.info("Hello Fabric world! I am going!");
	}
}
