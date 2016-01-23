package com.rijoadv.game.Screens;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by jespe_000 on 2016-01-23.
 */
public interface IScreen {
    public void Draw(SpriteBatch sb);
    public void Update(float dt);
    public void LoadContent(AssetManager manager);
    public boolean ShouldClose();
    public boolean Running();
    public void Pause();
    public void Resume();
    public void Hide();
    public void Show();
}
