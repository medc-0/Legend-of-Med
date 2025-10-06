package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Iron_Sword extends Entity {

    public OBJ_Iron_Sword(GamePanel gp) {
        super(gp);

        type = type_sword;
        typeSword = 2;
        name = "Iron Sword";
        down1 = setup("/objects/iron_sword", gp.tileSize, gp.tileSize);
        attackValue = 4;
        description = "[ " + name + " ]\nAn New sword Used \nTo fight With.";
        attackArea.width = 38;
        attackArea.height = 38;
    }
}
