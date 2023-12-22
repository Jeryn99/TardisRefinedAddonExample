package whocraft.tardis_refined.addon.example.events;

import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import org.apache.logging.log4j.Level;
import whocraft.tardis_refined.addon.example.TRAddonExample;
import whocraft.tardis_refined.api.event.EventResult;
import whocraft.tardis_refined.api.event.TardisEvents;
import whocraft.tardis_refined.common.capability.TardisLevelOperator;
import whocraft.tardis_refined.common.capability.upgrades.Upgrade;
import whocraft.tardis_refined.common.entity.ControlEntity;
import whocraft.tardis_refined.common.tardis.ExteriorShell;
import whocraft.tardis_refined.common.tardis.TardisNavLocation;
import whocraft.tardis_refined.common.tardis.control.Control;

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
                TRAddonExample.LOGGER.log(Level.ALL, "A Tardis changed its outer shell");
            }
        });

        // Entity entered Tardis event
        TardisEvents.TARDIS_ENTRY_EVENT.register(new TardisEvents.TardisEntry() {
            @Override
            public void onEnterTardis(TardisLevelOperator tardisLevelOperator, ExteriorShell shell, Player player, BlockPos externalPos, net.minecraft.world.level.Level level, Direction direction) {
                TRAddonExample.LOGGER.log(Level.ALL, "Something entered a TARDIS");
            }
        });

        // Tardis Land Event
        TardisEvents.LAND.register(new TardisEvents.Land() {
            @Override
            public void onLand(TardisLevelOperator tardisLevelOperator, LevelAccessor level, BlockPos pos) {
                TRAddonExample.LOGGER.log(Level.ALL, "A TARDIS has landed");
            }
        });

        // Tardis TakeOff Event
        TardisEvents.TAKE_OFF.register(new TardisEvents.TakeOff() {
            @Override
            public EventResult onTakeOff(TardisLevelOperator tardisLevelOperator, LevelAccessor level, BlockPos pos) {
                TRAddonExample.LOGGER.log(Level.ALL, "A TARDIS is taking off");
                return EventResult.pass(); // You can customize the result based on conditions
            }
        });

        // Tardis Crash Event
        TardisEvents.TARDIS_CRASH_EVENT.register(new TardisEvents.TardisCrash() {
            @Override
            public void onTardisCrash(TardisLevelOperator tardisLevelOperator, TardisNavLocation crashLocation) {
                TRAddonExample.LOGGER.log(Level.ALL, "A TARDIS has crashed at " + crashLocation);
            }
        });

        // Upgrade Unlocked Event
        TardisEvents.UPGRADE_UNLOCKED.register(new TardisEvents.UpgradeUnlocked() {
            @Override
            public void onUpgradeUnlock(TardisLevelOperator tardisLevelOperator, Upgrade upgrade) {
                TRAddonExample.LOGGER.log(Level.ALL, "A TARDIS has unlocked a new upgrade: " + upgrade.getDisplayName());
            }
        });

        // Player Control Interaction Event
        TardisEvents.PLAYER_CONTROL_INTERACT.register(new TardisEvents.CanControlBeUsed() {
            @Override
            public EventResult canControlBeUsed(TardisLevelOperator tardisLevelOperator, Control control, ControlEntity controlEntity) {
                TRAddonExample.LOGGER.log(Level.ALL, "Player is interacting with TARDIS controls");
                return EventResult.pass(); // You can customize the result based on conditions
            }
        });
    }
}
