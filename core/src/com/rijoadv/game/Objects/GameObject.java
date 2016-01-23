package com.rijoadv.game.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by jespe_000 on 2016-01-23.
 */
public abstract class GameObject implements IObject {
    protected boolean visible = true;
    protected boolean activated = true;
    protected Vector2 position = new Vector2(0,0);
    protected Texture texture = null;

    @Override
    public boolean GetActive() {
        return activated;
    }

    @Override
    public void Activate() {
        activated = true;
    }

    @Override
    public void Deactivate() {
        activated = false;
    }

    @Override
    public void Draw(SpriteBatch sb) {
        if(GetVisible()){
            sb.draw(GetTexture(), GetPosition().x, GetPosition().y);
        }
    }

    @Override
    public Texture GetTexture() {
        return texture;
    }

    @Override
    public void SetTexture(Texture value){
        texture = value;
    }

    @Override
    public Vector2 GetPosition() {
        return position;
    }

    @Override
    public void SetPosition(Vector2 value) {
        position = value;
    }

    @Override
    public boolean GetVisible() {
        return visible;
    }

    @Override
    public void Hide() {
        visible = false;
    }

    @Override
    public void Show() {
        visible = true;
    }

}
