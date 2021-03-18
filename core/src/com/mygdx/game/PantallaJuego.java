package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PantallaJuego extends BaseScreen {

    public PantallaJuego(MyGdxGame game) {
        super(game);
    }

    SpriteBatch spriteBatch;
    Texture back;

    Skater skater = new Skater();

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        back = new Texture("back.jpg");


    }

    @Override
    public void render(float delta) {

        spriteBatch.begin();
        spriteBatch.draw(back, 0,0, 870, 500);
        skater.render(spriteBatch);
        spriteBatch.end();
    }
}
