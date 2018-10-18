package mycontroller;

import tiles.*;
import utilities.*;

public abstract class Strategy {
	//TODO: calculate a heuristic value of a tile
	public abstract int getHeuristic(Coordinate startPos, Coordinate endPos,
			MapTile startTile, MapTile endTile);
	
}
