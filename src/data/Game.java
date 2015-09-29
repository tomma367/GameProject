package data;

import static helpers.Artist.QuickLoad;

public class Game {

	private TileGrid grid;
	private Player player;
	private WaveManager waveManager;
	public static final int TILE_SIZE = 64;
	
	
	public Game(int[][] map) {
		grid = new TileGrid(map);
		waveManager = new WaveManager(new Enemy(QuickLoad("UFO64"), 
				grid.GetTile(14, 8), grid, TILE_SIZE, TILE_SIZE, 70), 2, 2);
		player = new Player(grid, waveManager);
	}
	
	public void update() {
		grid.Draw();
		waveManager.update();
		player.update();
	}
}
