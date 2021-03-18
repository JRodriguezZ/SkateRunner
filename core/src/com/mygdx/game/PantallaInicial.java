package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class PantallaInicial extends BaseScreen {

    private Stage stage;

    public PantallaInicial(MyGdxGame game) {
        super(game);
    }

    @Override
    public void show() {
        BaseButton buttonStart = new BaseButton("button_start_up.png","button_start_over.png",200,200,350,100,new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                setScreen(new PantallaJuego(game));
                return true;
            }
        });

        Gdx.input.setInputProcessor(stage = new Stage());
        stage.addActor(buttonStart);
    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
    }
}
