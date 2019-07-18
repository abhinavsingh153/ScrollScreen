package com.scrollscreen.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.xml.soap.Text;

public class SrollScreen extends ApplicationAdapter {

	SpriteBatch batch;
	Texture background1;
	Texture background2;

	private float backgroundVelocity = 4;
	private float backgroundX = 0;
	private float screenHeight;
	private float screenWidth;

	@Override
	public void create () {

		batch = new SpriteBatch();
		screenHeight = Gdx.graphics.getHeight();
		screenWidth = Gdx.graphics.getWidth();

		background1 = new Texture("bg.png");
		background2 = new Texture("bg.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(background1 , backgroundX , 0 , screenWidth , screenHeight);
		batch.draw(background2 , backgroundX + screenWidth, 0 , screenWidth , screenHeight);
		batch.end();

		backgroundX -= backgroundVelocity;

		if (backgroundX +screenWidth ==0){
			backgroundX = 0;
		}

	}

	@Override
	public void dispose () {

		background1.dispose();
		background2.dispose();
	}
}
