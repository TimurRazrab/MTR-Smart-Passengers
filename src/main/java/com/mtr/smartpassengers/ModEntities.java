package com.mtr.smartpassengers;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, SmartPassengersMod.MOD_ID);

    public static final RegistryObject<EntityType<PassengerEntity>> PASSENGER =
            ENTITY_TYPES.register("passenger",
                    () -> EntityType.Builder
                            .of(PassengerEntity::new, MobCategory.MISC)
                            .sized(0.6F, 1.8F)
                            .build("passenger"));
}
