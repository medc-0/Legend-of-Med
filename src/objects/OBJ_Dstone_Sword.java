package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Dstone_Sword extends Entity {

    public OBJ_Dstone_Sword(GamePanel gp) {
        super(gp);

        type = type_sword;
        typeSword = 6;
        name = "Dark Stone Sword";
        down1 = setup("/objects/dark_stone_sword", gp.tileSize,gp.tileSize);
        attackValue = 7;
        description = "[ " + name + " ]\nMade with Dark Stone \nForged In Hell.";
        attackArea.width = 44;
        attackArea.height = 44;
    }
}
