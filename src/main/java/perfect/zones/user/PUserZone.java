package perfect.zones.user;

import org.bukkit.entity.Player;
import perfect.zones.managers.zone.Zone;

import java.util.List;

public interface PUserZone {

    Player getPlayer();

    void setPlayer(Player player);

    Zone getZone();

    void setZone(Zone zone);

    String getZoneName();

    void setZoneName(String zone);

    List<Zone> getFoundedZones();

    void setFoundedZones(List<Zone> foundedZones);

    boolean isFoundZone(Zone zone);

    void addFoundZone(Zone zone);

    void removeFoundZone(Zone zone);

}