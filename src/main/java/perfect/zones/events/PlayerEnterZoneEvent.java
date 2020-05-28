package perfect.zones.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import perfect.zones.managers.zone.Zone;
import perfect.zones.user.UserZone;

public class PlayerEnterZoneEvent extends Event implements Cancellable {

    private static HandlerList handlers = new HandlerList();

    private Player player;
    private UserZone userZone;
    private String zoneName;
    private Zone zone;
    private boolean cancelled = false;

    public PlayerEnterZoneEvent(Player player, UserZone userZone, Zone zone, String zoneName){
        this.userZone = userZone;
        this.player = player;
        this.zone = zone;
        this.zoneName = zoneName;
    }

    public Player getPlayer() {
        return player;
    }

    public String getZoneName() {
        return zoneName;
    }

    public UserZone getUserZone() {
        return userZone;
    }

    public Zone getZone() {
        return zone;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList(){
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}