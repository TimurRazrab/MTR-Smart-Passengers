
package com.mtr.smartpassengers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SmartPassengersMod.MOD_ID)
public class SmartPassengersMod {

    public static final String MOD_ID = "mtr_smart_passengers";

    public SmartPassengersMod() {
        IEventBus modEventBus =
                FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.ENTITY_TYPES.register(modEventBus);

        System.out.println("[MTR Smart Passengers] Passenger entity registered!");
    }
}
