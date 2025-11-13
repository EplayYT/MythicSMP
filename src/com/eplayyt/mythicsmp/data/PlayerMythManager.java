package com.eplayyt.mythicsmp.data;

import java.util.HashMap;
import java.util.Map;

public class PlayerMythManager {

    private static Map<String, String> playerMyths = new HashMap<>();

    public static void addMyth(String playerName, String myth) {
        playerMyths.put(playerName, myth);
    }

    public static String getMyth(String playerName) {
        return playerMyths.getOrDefault(playerName, "Efsane bulunamadı.");
    }

}
