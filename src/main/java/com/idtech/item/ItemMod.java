package com.idtech.item;

import com.idtech.ModTab;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.system.CallbackI;

@Mod.EventBusSubscriber
public class ItemMod {

    //Basic Items
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", ModTab.INSTANCE);


    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", ModTab.INSTANCE);

    //foods
    public static Food yummyFood = (new Food.Builder()).hunger(5).saturation(1.4f).effect(new EffectInstance(Effects.HEALTH_BOOST, 500, 1), 1.0f).effect(new EffectInstance(Effects.SPEED, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item yummyFoodItem = ItemUtils.buildFoodItem("yummyfood", yummyFood);



    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        // Basic Items
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);


        // Regular items
        event.getRegistry().register(FireWandItem.INSTANCE);
        event.getRegistry().register(LightningHammerItem.INSTANCE);
        event.getRegistry().register(TeleportRodItem.INSTANCE);
        event.getRegistry().register(ZooSwordItem.INSTANCE);
        event.getRegistry().register(SheepMagicWand.INSTANCE);
        event.getRegistry().register(SqueakyBallItem.INSTANCE);
        event.getRegistry().register(FunNewItem.INSTANCE);
        event.getRegistry().register(MagicAnimalTamingWand.INSTANCE);
        event.getRegistry().register(CrazyNewItem.INSTANCE);
        event.getRegistry().register(IncredibleNewItem.INSTANCE);
        event.getRegistry().register(FireballWandItem.INSTANCE);

        // Tools
        event.getRegistry().register(GelAxeItem.INSTANCE);
        event.getRegistry().register(GelHoeItem.INSTANCE);
        event.getRegistry().register(GelPickaxeItem.INSTANCE);
        event.getRegistry().register(GelShovelItem.INSTANCE);
        event.getRegistry().register(GelSwordItem.INSTANCE);

        // Food
        event.getRegistry().register(yummyFoodItem);
        event.getRegistry().register(TastyFood.ITEM);

        // Armor
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(CustomArmorItem.CHEST);
        event.getRegistry().register(CustomArmorItem.LEGS);
        event.getRegistry().register(CustomArmorItem.BOOTS);

        // Arrows
        event.getRegistry().register(LightningArrowItem.INSTANCE);
        event.getRegistry().register(BombArrowItem.INSTANCE);
        event.getRegistry().register(TeleportArrowItem.INSTANCE);

        //Custom Bow
        event.getRegistry().register(TeleportBowItem.INSTANCE);

        // Projectiles
        event.getRegistry().register(CustomProjectileItem.INSTANCE);
        event.getRegistry().register(FlyBombItem.INSTANCE);

    }
}
