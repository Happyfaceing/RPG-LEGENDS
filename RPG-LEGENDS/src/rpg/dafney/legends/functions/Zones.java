package rpg.dafney.legends.functions;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;

public class Zones {

	// ** Chunk Coordinates
	private static final int SpawnMinX = -1;
	private static final int SpawnMaxX = 0;
	private static final int SpawnMinZ = -1;
	private static final int SpawnMaxZ = 0;

	// ** Chunk ID
	private static final String Spawn_ID = "Spawn";
	private static final String Unknown_ID = "Unknown";

	// ** Get Zone
	public static String getZone(Player p) {
		// ** Player Chunk
		Chunk player_chunk = p.getLocation().getChunk();

		// ** Player X Chunk
		final int pChunkX = player_chunk.getX();

		// ** Player Z Chunk
		final int pChunkZ = player_chunk.getZ();

		if (pChunkX >= SpawnMinX && pChunkX <= SpawnMaxX && pChunkZ >= SpawnMinZ && pChunkZ <= SpawnMaxZ) {
            return Spawn_ID;
        } else {
        	return Unknown_ID;
        }
	}
}