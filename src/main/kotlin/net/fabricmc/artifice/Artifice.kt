package net.fabricmc.artifice

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.util.registry.Registry
import net.minecraft.item.ItemGroup
import net.minecraft.item.Item
import net.minecraft.util.Identifier

class Artifice : ModInitializer {

	companion object {
		final val FABRIC_ITEM : Item = Item(FabricItemSettings().group(ItemGroup.MISC))
	}

    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier("tutorial", "fabric_item"), Artifice.FABRIC_ITEM)
    }

}
