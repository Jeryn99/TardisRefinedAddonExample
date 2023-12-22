package whocraft.tardis_refined.addon.example.fabric;

import whocraft.tardis_refined.addon.example.TRAddonExample;
import net.fabricmc.api.ModInitializer;

public class TRAddonExampleFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TRAddonExample.init();
    }
}