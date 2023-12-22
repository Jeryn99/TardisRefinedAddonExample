package whocraft.tardis_refined.addon.example.events;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import org.apache.logging.log4j.Level;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.api.event.TardisEvents;
import whocraft.tardis_refined.common.capability.TardisLevelOperator;
import whocraft.tardis_refined.common.tardis.ExteriorShell;

public class TRAddonCommonEvents {

    public static void setupEvents(){

        // Door Closed Event
        TardisEvents.DOOR_CLOSED_EVENT.register(new TardisEvents.CloseDoor() {
            @Override
            public void onDoorClosed(TardisLevelOperator tardisLevelOperator) {
                TRAddonExample.LOGGER.log(Level.ALL, "A Tardis Door Closed");
            }
        });

        // Door Open Event
        TardisEvents.DOOR_OPENED_EVENT.register(new TardisEvents.OpenDoor() {
            @Override
            public void onDoorOpen(TardisLevelOperator tardisLevelOperator) {
                TRAddonExample.LOGGER.log(Level.ALL, "A Tardis Door Opened");
            }
        });

        // Shell Change Event
        TardisEvents.SHELL_CHANGE_EVENT.register(new TardisEvents.ShellChange() {
            @Override
            public void onShellChange(TardisLevelOperator tardisLevelOperator, ResourceLocation theme, boolean isSetupTardis) {
                TRAddonExample.LOGGER.log(Level.ALL, "A Tardis changed it's outer shell");
            }
        });

        // Entity entered Tardis event
        TardisEvents.TARDIS_ENTRY_EVENT.register(new TardisEvents.TardisEntry() {
            @Override
            public void onEnterTardis(TardisLevelOperator tardisLevelOperator, ExteriorShell shell, Player player, BlockPos externalPos, net.minecraft.world.level.Level level, Direction direction) {
                TRAddonExample.LOGGER.log(Level.ALL, "Something entered a TARDIS");
            }
        });



    }

}
