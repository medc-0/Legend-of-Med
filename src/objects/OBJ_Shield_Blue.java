package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Blue extends Entity {

    public OBJ_Shield_Blue(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Refined Shield";
        down1 = setup("/items/shield_blue", gp.tileSize, gp.tileSize);
        defenseValue = 1;
        description = "[ " + name + " ]\nAn Refined Shield \nMuch more stable!";

    }
}
