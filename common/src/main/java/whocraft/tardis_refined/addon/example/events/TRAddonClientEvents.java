package whocraft.tardis_refined.addon.example.events;

import net.minecraft.client.model.geom.EntityModelSet;
import org.apache.logging.log4j.Level;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.api.event.TardisEvents;

public class TRAddonClientEvents {

    public static void setup(){
        // Setup Models Event
        TardisEvents.SHELLENTRY_MODELS_SETUP.register(new TardisEvents.SetupModels() {
            @Override
            public void setUpShellAndInteriorModels(EntityModelSet context) {
                TRAddonExample.LOGGER.log(Level.ALL, "Setting up TARDIS shell and interior models");
                // Add your model setup code here
            }
        });
    }

}
