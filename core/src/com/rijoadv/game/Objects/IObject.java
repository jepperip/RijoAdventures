package com.rijoadv.game.Objects;

/**
 * Created by jespe_000 on 2016-01-23.
 */
public interface IObject extends IDrawable {
    public void Update(float dt);
    public boolean GetActive();
    public void Activate();
    public void Deactivate();
}
