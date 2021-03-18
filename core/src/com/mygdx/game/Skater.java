package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Skater {

    static Texture skater = new Texture("skater.png");

    int x, y, w, h;
    float vy;
    int floory;

    public Skater() {
        x = 90;
        y = 10;
        w = 60;
        h = 100;
        vy = 0;
        floory = 10;
    }

    public void render(SpriteBatch spriteBatch) {
        Texture texture = skater;

        if (y == floory){
            if(Gdx.input.isKeyJustPressed(Input.Keys.ANY_KEY)){
                vy = 15;
            }
        }
        vy--;

        if(y <= floory && vy < 0) vy = 0;

        y += vy;

        spriteBatch.draw(texture, x, y, w, h);
    }

}
