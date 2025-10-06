package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Wood_Sword extends Entity {

    public OBJ_Wood_Sword(GamePanel gp) {
        super(gp);

        type = type_sword;
        typeSword = 1;
        name = "Starter Sword";
        down1 = setup("/objects/wood_sword", gp.tileSize, gp.tileSize);
        attackValue = 2;
        description = "[ " + name + " ]\nAn Old sword Used \nTo fight With.";
        attackArea.width = 36;
        attackArea.height = 36;
    }
}
