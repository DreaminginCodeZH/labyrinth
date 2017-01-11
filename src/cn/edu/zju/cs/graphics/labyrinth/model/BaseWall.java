package cn.edu.zju.cs.graphics.labyrinth.model;

import cn.edu.zju.cs.graphics.labyrinth.rendering.Renderer;
import org.dyn4j.dynamics.Body;

public class BaseWall<EntityType extends BaseWall<EntityType>> extends Entity<EntityType> {

    public static final double DEFAULT_THICKNESS = 20;
    public static final double RESTITUTION = Ball.RESTITUTION;

    public BaseWall(Body body, Renderer<EntityType> renderer) {
        super(body, renderer);
    }
}
