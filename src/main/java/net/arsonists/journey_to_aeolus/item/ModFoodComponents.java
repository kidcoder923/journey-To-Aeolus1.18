package net.arsonists.journey_to_aeolus.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent EMBERFRUIT = new FoodComponent.Builder().hunger(6).saturationModifier(5f).build();
    public static final FoodComponent EMBER_CRYSTAL = new FoodComponent.Builder().hunger(2).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 0), 0.3f).build();

}
