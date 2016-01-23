package com.rijoadv.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rijoadv.game.Objects.MainCharacter;
import com.rijoadv.game.Screens.IScreen;

/**
 * Created by jespe_000 on 2016-01-23.
 */
public class GameEngine {
    AssetManager assetManager;
    IScreen currentScreen;
    MainCharacter c;
    public void Initialize(){
        assetManager = new AssetManager();
    }

    public void LoadContent()
    {
        c = new MainCharacter();
        Texture tex = new Texture("star.png");
        c.SetTexture(tex);
    }

    public void Update(float dt){


    }
    
    public void Draw(SpriteBatch sb){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();

        c.Draw(sb);
        sb.end();
    }
}
