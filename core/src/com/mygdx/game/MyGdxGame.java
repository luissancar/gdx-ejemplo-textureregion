package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
	private Texture badlogic,sierra;// nombre interno tarjetas gráficas
	private TextureRegion regionSierra;
	private SpriteBatch batch;
	private int x,y,xBad,yBad;

	public MyGdxGame() {
		// no hacer nada crítico
	}

	@Override
	public void create() {
		badlogic=new Texture("badlogic.jpg"); // mejor utilizar png
		sierra=new Texture("nave2-4.png");
		batch = new SpriteBatch();

		x=Gdx.graphics.getWidth();  //ancho pantalla
		y=Gdx.graphics.getHeight(); // alto pantalla
		xBad=badlogic.getWidth(); // ancho imagen
		yBad=badlogic.getHeight(); // alto imagen
		regionSierra=new TextureRegion(sierra,0,128,256,196);



	}

	@Override
	public void dispose() {
		// las regiones no se pueden disposear
		badlogic.dispose();  // muy importante liberar recursos
		sierra.dispose();
		batch.dispose();
	}

	@Override
	public void render() {
		// es más eficiente representar todas las texturas de golpe, repesentar 1 textura= representar 50
		Gdx.gl.glClearColor(1,0.12f,0.67f,0.19f); //color fondo. rojo, verda, azul, intensidad, valores de 0 a 1
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); //limpia buffer tarjeta
		Gdx.graphics.getWidth();  //ancho
		Gdx.graphics.getHeight(); // alto
		batch.begin();
		batch.draw(badlogic,0,0,20,20); // está en la izquierda debajo x, y
		batch.draw(regionSierra,128,0);


		batch.end();

	}
}