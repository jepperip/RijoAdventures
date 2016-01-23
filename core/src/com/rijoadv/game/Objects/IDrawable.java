package com.rijoadv.game.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public interface IDrawable {
    public void Draw(SpriteBatch sb);
    public Texture GetTexture();
    public void SetTexture(Texture value);
    public Vector2 GetPosition();
    public void SetPosition(Vector2 value);
    public boolean GetVisible();
    public void Hide();
    public void Show();
}
