package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_Dstone_Axe extends Entity {

    public OBJ_Dstone_Axe(GamePanel gp) {
        super(gp);

        type = type_axe;
        typeAxe = 5;
        name = "Dark Stone Axe";
        down1 = setup("/objects/dark_stone_axe", gp.tileSize, gp.tileSize);
        attackValue = 6;
        description = "[ " + name + " ]\nAn Very Strong \nAxe Used To \nCut Trees.";

        attackArea.width = 40;
        attackArea.height = 40;
    }
}
