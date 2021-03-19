package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Obstaculo {

    enum Tipo {basura}

    static Texture basura = new Texture("bolsabasura.png");

    int x, y, w, h;
    float vx;
    Tipo tipo;

    public Obstaculo(int velocidad, Tipo tipo) {
        x = 700;
        y = 10;
        w = 50;
        h = 50;
        this.tipo = tipo;
        vx = velocidad;
    }

    public void render(SpriteBatch spriteBatch) {
        Texture texture = null;

        switch (tipo) {
            case basura:
                texture = basura;
                break;
        }

        x-=vx;

        if (x == -40) x = 700;

        spriteBatch.draw(texture, x, y, w, h);
    }
}
