package whocraft.tardis_refined.addon.example.forge;

import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.addon.example.forge.data.AddonExampleEnglishLangProvider;
import whocraft.tardis_refined.common.data.LangProviderEnglish;

@Mod(TRAddonExample.MOD_ID)
public class TRAddonExampleForge {
    public TRAddonExampleForge() {
        TRAddonExample.init();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onGatherData);

    }


    public void onGatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        /*Resource Pack*/
        generator.addProvider(e.includeClient(), new AddonExampleEnglishLangProvider(generator.getPackOutput()));
    }

}