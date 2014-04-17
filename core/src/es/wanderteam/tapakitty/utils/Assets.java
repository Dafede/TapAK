package es.wanderteam.tapakitty.utils;

import com.badlogic.gdx.assets.AssetManager;

public class Assets {
	public static final AssetManager manager = new AssetManager();
	
	//public static final String ruta = "ruta/textura.png";
	
	public static void load() {
		//manager.load(ruta, Texture.class);
	}
	
	public static void dispose() {
		manager.dispose();
	}
	
	
}

/**

Usage:

Get a loaded texture:

	Assets.manager.get(Assets.ruta, Texture.class);

How to Load:

	while(!Assets.manager.update())
		System.out.println("Progress: " + Assets.manager.getProgress());
		
How to load without doing nothing:
	Assets.manager.finishLoading();


**/