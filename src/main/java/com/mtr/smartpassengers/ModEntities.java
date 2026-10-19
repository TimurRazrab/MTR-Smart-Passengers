
package com.mtr.smartpassengers;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(
                    ForgeRegistries.ENTITIES,
                    SmartPassengersMod.MOD_ID
            );

    static {
        ENTITY_TYPES.register("passenger",
                () -> EntityType.Builder
                        .of(PassengerEntity::new, MobCategory.MISC)
                        .sized(0.6F, 1.8F)
                        .build("mtr_smart_passengers:passenger"));
    }
}
