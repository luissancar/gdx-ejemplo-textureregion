package com.mygdx.game;

/**
 * Created by luissancar on 26/12/16.
 */

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

public class proesador extends InputAdapter{

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        System.out.println("posición "+screenX+","+screenY);
        System.out.println("dedo "+pointer+" botón "+button);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
}
