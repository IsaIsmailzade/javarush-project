package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Простая программа
*/

public class SymbolGame extends Game {

    public void initialize() {
        setScreenSize(8, 3);
        setCellValueEx(0, 1, Color.ORANGE, "J", Color.BLACK);
        setCellValueEx(1, 1, Color.ORANGE, "A", Color.BLACK);
        setCellValueEx(2, 1, Color.ORANGE, "V", Color.BLACK);
        setCellValueEx(3, 1, Color.ORANGE, "A", Color.BLACK);
        setCellValueEx(4, 1, Color.ORANGE, "R", Color.BLACK);
        setCellValueEx(5, 1, Color.ORANGE, "U", Color.BLACK);
        setCellValueEx(6, 1, Color.ORANGE, "S", Color.BLACK);
        setCellValueEx(7, 1, Color.ORANGE, "H", Color.BLACK);
    }
}
