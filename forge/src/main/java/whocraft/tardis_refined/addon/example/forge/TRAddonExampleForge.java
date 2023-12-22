package whocraft.tardis_refined.addon.example.forge;

import net.neoforged.fml.common.Mod;
import whocraft.tardis_refined.addon.example.TRAddonExample;

@Mod(TRAddonExample.MOD_ID)
public class TRAddonExampleForge {
    public TRAddonExampleForge() {
        TRAddonExample.init();
    }
}