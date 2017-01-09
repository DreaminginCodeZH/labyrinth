package cn.edu.zju.cs.graphics.labyrinth.rendering;

import cn.edu.zju.cs.graphics.labyrinth.model.Ball;
import cn.edu.zju.cs.graphics.labyrinth.model.ConvexWall;
import cn.edu.zju.cs.graphics.labyrinth.model.FinishHole;
import cn.edu.zju.cs.graphics.labyrinth.model.Hole;
import cn.edu.zju.cs.graphics.labyrinth.model.Wall;

public interface Renderers {

    Renderer<Ball> BALL = PrototypeRenders.BALL;

    Renderer<Wall> WALL = PrototypeRenders.WALL;

    Renderer<Hole> HOLE = PrototypeRenders.HOLE;

    // TODO
    Renderer<ConvexWall> CONVEX_WALL = null;

    // TODO
    Renderer<FinishHole> FINISH_HOLE = null;
}
