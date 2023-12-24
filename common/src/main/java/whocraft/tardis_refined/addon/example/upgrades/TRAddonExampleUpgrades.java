package whocraft.tardis_refined.addon.example.upgrades;

import net.minecraft.world.item.Items;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.common.capability.upgrades.Upgrade;
import whocraft.tardis_refined.common.capability.upgrades.Upgrades;
import whocraft.tardis_refined.registry.DeferredRegistry;
import whocraft.tardis_refined.registry.RegistrySupplier;

import static whocraft.tardis_refined.addon.example.TRAddonExample.makeKey;

public class TRAddonExampleUpgrades {

    public static final DeferredRegistry<Upgrade> UPGRADE_DEFERRED_REGISTRY = DeferredRegistry.create(TRAddonExample.MOD_ID, Upgrades.UPGRADE_REGISTRY_KEY);
    // Base Upgrades
    public static final RegistrySupplier<Upgrade> TELEPORTATION = UPGRADE_DEFERRED_REGISTRY.register("teleportation", () ->
            new Upgrade(Items.ENDER_PEARL::getDefaultInstance, Upgrades.TARDIS_XP, makeKey("teleportation"), Upgrade.UpgradeType.MAIN_UPGRADE)
                    .setSkillPointsRequired(75).setPosition(1, 0));

    // Chameleon Circuit Upgrades
    public static final RegistrySupplier<Upgrade> HOLOGRAPHIC_DISGUISE = UPGRADE_DEFERRED_REGISTRY.register("holographic_disguise", () ->
            new Upgrade(Items.GLOW_INK_SAC::getDefaultInstance, Upgrades.CHAMELEON_CIRCUIT_SYSTEM, makeKey("holographic_disguise"), Upgrade.UpgradeType.SUB_UPGRADE)
                    .setSkillPointsRequired(80).setPosition(3, 0));

    // Defense Upgrades
    public static final RegistrySupplier<Upgrade> FORCE_FIELD_GENERATOR = UPGRADE_DEFERRED_REGISTRY.register("force_field_generator", () ->
            new Upgrade(Items.NETHER_STAR::getDefaultInstance, Upgrades.DEFENSE_SYSTEM, makeKey("force_field_generator"), Upgrade.UpgradeType.SUB_UPGRADE)
                    .setSkillPointsRequired(90).setPosition(2, 1));

    // Navigation Upgrades
    public static final RegistrySupplier<Upgrade> WORMHOLE_JUMP = UPGRADE_DEFERRED_REGISTRY.register("wormhole_jump", () ->
            new Upgrade(Items.SHULKER_SHELL::getDefaultInstance, Upgrades.NAVIGATION_SYSTEM, makeKey("wormhole_jump"), Upgrade.UpgradeType.MAIN_UPGRADE)
                    .setSkillPointsRequired(100).setPosition(2, 2));

    // In your dreams
    public static final RegistrySupplier<Upgrade> TIME_TRAVEL = UPGRADE_DEFERRED_REGISTRY.register("time_travel", () ->
            new Upgrade(Items.CLOCK::getDefaultInstance, WORMHOLE_JUMP, makeKey("time_travel"), Upgrade.UpgradeType.SUB_UPGRADE)
                    .setSkillPointsRequired(120).setPosition(3, 2));

}
