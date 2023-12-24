package whocraft.tardis_refined.addon.example.forge.data;

import net.minecraft.Util;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.common.capability.upgrades.Upgrade;
import whocraft.tardis_refined.common.capability.upgrades.Upgrades;
import whocraft.tardis_refined.addon.example.upgrades.TRAddonExampleUpgrades; // Import the upgrades class

public class AddonExampleEnglishLangProvider extends LanguageProvider {

    public AddonExampleEnglishLangProvider(PackOutput output) {
        super(output, TRAddonExample.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

        addUpgrade(TRAddonExampleUpgrades.TELEPORTATION.get(), "Teleportation", "Allows the TARDIS to teleport to a different location.");
        addUpgrade(TRAddonExampleUpgrades.HOLOGRAPHIC_DISGUISE.get(), "Holographic Disguise", "Provides the TARDIS with a holographic disguise, making it blend into its surroundings.");
        addUpgrade(TRAddonExampleUpgrades.FORCE_FIELD_GENERATOR.get(), "Force Field Generator", "Generates a protective force field around the TARDIS, enhancing its defense capabilities.");
        addUpgrade(TRAddonExampleUpgrades.WORMHOLE_JUMP.get(), "Wormhole Jump", "Enables the TARDIS to perform a quick and efficient wormhole jump to a specified location.");
        addUpgrade(TRAddonExampleUpgrades.TIME_TRAVEL.get(), "Time Travel", "Unlocks the ability to travel through time, allowing the TARDIS to visit different eras and periods.");
    }

    private void addUpgrade(Upgrade upgrade, String title, String description) {
        add(Util.makeDescriptionId("upgrade", Upgrades.UPGRADE_REGISTRY.getKey(upgrade)), title);
        add(Util.makeDescriptionId("upgrade", Upgrades.UPGRADE_REGISTRY.getKey(upgrade)) + ".description", description);
    }
}
