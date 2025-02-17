package com.faboslav.friendsandfoes.init;

import com.faboslav.friendsandfoes.FriendsAndFoes;
import com.faboslav.friendsandfoes.platform.RegistryHelper;
import com.faboslav.friendsandfoes.platform.StructureEntityProcessorTypes;
import com.faboslav.friendsandfoes.world.processor.IllusionerShackBrewingStandProcessor;
import net.minecraft.structure.processor.StructureProcessorType;

/**
 * @see StructureProcessorType
 */
public final class FriendsAndFoesStructureProcessorTypes
{
	public static StructureProcessorType<IllusionerShackBrewingStandProcessor> ILLUSIONER_SHACK_BREWING_STAND_PROCESSOR = () -> IllusionerShackBrewingStandProcessor.CODEC;

	public static void init() {
	}

	public static void postInit() {
		RegistryHelper.registerStructureProcessorType(FriendsAndFoes.makeID("illusioner_shack_brewing_stand_processor"), ILLUSIONER_SHACK_BREWING_STAND_PROCESSOR);
		StructureEntityProcessorTypes.postInit();
	}

	private FriendsAndFoesStructureProcessorTypes() {
	}
}
