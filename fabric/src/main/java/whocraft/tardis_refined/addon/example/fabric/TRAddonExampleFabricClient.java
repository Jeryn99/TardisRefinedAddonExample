package whocraft.tardis_refined.addon.example.fabric;

import net.fabricmc.api.ClientModInitializer;
import whocraft.tardis_refined.addon.example.events.TRAddonClientEvents;

public class TRAddonExampleFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        TRAddonClientEvents.setup();
    }
}
