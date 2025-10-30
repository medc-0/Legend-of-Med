package main;

import entity.NPC_OldMan;
import monster.MON_GreenSlime;
import objects.*;

public class AssetSetter {

    GamePanel gp;
    public boolean changer = false;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        int i = 0;

        gp.obj[i] = new OBJ_Iron_Axe(gp);
        gp.obj[i].worldX = gp.tileSize * 31;
        gp.obj[i].worldY = gp.tileSize * 20;
        i++;
        gp.obj[i] = new OBJ_Boots(gp);
        gp.obj[i].worldX = gp.tileSize * 31;
        gp.obj[i].worldY = gp.tileSize * 21;
        i++;
        gp.obj[i] = new OBJ_HealPotion(gp);
        gp.obj[i].worldX = gp.tileSize * 31;
        gp.obj[i].worldY = gp.tileSize * 22;
    }

    public void setNPC() {

        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize * 31;
        gp.npc[0].worldY = gp.tileSize * 23;

    }

    public void setMonster() {

        int i = 0;

        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 31;
        gp.monster[i].worldY = gp.tileSize * 24;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 31;
        gp.monster[i].worldY = gp.tileSize * 26;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 29;
        gp.monster[i].worldY = gp.tileSize * 23;
        i++;
        gp.monster[i] = new MON_GreenSlime(gp);
        gp.monster[i].worldX = gp.tileSize * 26;
        gp.monster[i].worldY = gp.tileSize * 22;
    }

}
