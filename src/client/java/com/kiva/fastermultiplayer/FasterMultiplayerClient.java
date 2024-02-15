package com.kiva.fastermultiplayer;

import com.fox2code.foxloader.loader.ClientMod;

public class FasterMultiplayerClient extends FasterMultiplayer implements ClientMod {
    @Override
    public void onInit() {
        System.out.println("FasterMultiplayer initialized");
    }
}
