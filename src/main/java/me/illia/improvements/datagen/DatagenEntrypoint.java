package me.illia.improvements.datagen;

import me.illia.improvements.ImprovementsMod;
import net.fabricmc.fabric.api.datagen.v1.*;

public class DatagenEntrypoint implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

    }

    @Override
    public String getEffectiveModId() {
        return ImprovementsMod.MODID;
    }
}
