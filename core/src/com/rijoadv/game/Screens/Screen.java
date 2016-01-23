package com.rijoadv.game.Screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by jespe_000 on 2016-01-23.
 */
public abstract class Screen implements IScreen {
    protected boolean running = false;
    protected boolean isShowing = true;

    @Override
    public boolean Running() {
        return running;
    }

    @Override
    public void Pause() {
        running = false;
    }

    @Override
    public void Resume() {
        running = true;
    }

    @Override
    public void Hide() {
        isShowing = false;
    }

    @Override
    public void Show() {
        isShowing = true;
    }
}
