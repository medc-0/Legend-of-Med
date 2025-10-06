package objects;

import entity.Entity;
import main.GamePanel;

public class OBJ_HealPotion extends Entity {

    GamePanel gp;
    int value = 5;

    public OBJ_HealPotion(GamePanel gp) {
        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Healing Potion I ";
        down1 = setup("/objects/potion_red", gp.tileSize, gp.tileSize);
        defenseValue = 1;
        description = "[ " + name + " ]\nHealing Potion: \nHeals 5 Hearts!";
    }

    public void use(Entity entity) {

        gp.gameState = gp.dialogState;
        gp.ui.currentDialogue = "You drink the " + name + "!\n"
                + "Your life Has recovered by " + value + ".";
        gp.player.life += value;
        if (gp.player.life > gp.player.maxLife) {
            gp.player.life = gp.player.maxLife;
        }
        gp.playSE(2);
    }
}