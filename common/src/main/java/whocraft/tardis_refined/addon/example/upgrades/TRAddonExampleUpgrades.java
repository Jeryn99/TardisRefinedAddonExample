package whocraft.tardis_refined.addon.example.upgrades;

import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.common.capability.upgrades.Upgrade;
import whocraft.tardis_refined.common.capability.upgrades.Upgrades;
import whocraft.tardis_refined.registry.DeferredRegistry;

public class TRAddonExampleUpgrades {

    public static final DeferredRegistry<Upgrade> UPGRADE_DEFERRED_REGISTRY = DeferredRegistry.create(TRAddonExample.MOD_ID, Upgrades.UPGRADE_REGISTRY_KEY);



}
