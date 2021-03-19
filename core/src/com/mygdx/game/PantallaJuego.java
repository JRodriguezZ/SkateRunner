package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

public class PantallaJuego extends BaseScreen {

    public PantallaJuego(MyGdxGame game) {
        super(game);
    }

    SpriteBatch spriteBatch;
    Texture back;
    Skater skater;
    List<Obstaculo> obstaculoList;

    @Override
    public void show() {
        spriteBatch = new SpriteBatch();
        back = new Texture("back.jpg");
        skater = new Skater();

        obstaculoList = new ArrayList<>();
        obstaculoList.add(new Obstaculo(5, Obstaculo.Tipo.basura));
        obstaculoList.add(new Obstaculo(10, Obstaculo.Tipo.basura));


    }

    @Override
    public void render(float delta) {

        spriteBatch.begin();

        spriteBatch.draw(back, 0,0, 870, 500);
        skater.render(spriteBatch);
        for (Obstaculo obstaculo : obstaculoList) obstaculo.render(spriteBatch);

        spriteBatch.end();
    }
}
