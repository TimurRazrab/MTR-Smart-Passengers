
package com.mtr.smartpassengers;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;

public class PassengerEntity extends Mob {

    public PassengerEntity(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
        this.setCustomName(
                new TextComponent(PassengerNames.randomName())
        );
        this.setCustomNameVisible(true);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
