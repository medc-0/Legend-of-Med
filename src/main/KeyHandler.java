package main;

import entity.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    GamePanel gp;

    public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed, shotKeyPressed;
    //DEBUG
    boolean showDebugText = false;

    public KeyHandler(GamePanel gp) {
        this.gp = gp;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        //  int code = e.getKeyCode();

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        // TITLE STATE
        if (gp.gameState == gp.titleState) {
            titleState(code);
        }

        // PLAYSTATE
        else if (gp.gameState == gp.playState) {
            playState(code);
        }

        // PAUSE STATE
        else if (gp.gameState == gp.pauseState) {
            pauseState(code);
        }

        // DIALOGUE STATE
        else if (gp.gameState == gp.dialogState) {
            dialogueState(code);
        }

        // CHARACTER STATE
        else if (gp.gameState == gp.characterState) {
            characterState(code);
        }
    }

    public void titleState(int code) {

        if (gp.ui.titleScreenState == 0) {

            if (code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if (gp.ui.commandNum < 0) {
                    gp.ui.commandNum = 2;
                }
            }
            if (code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if (gp.ui.commandNum > 2) {
                    gp.ui.commandNum = 0;
                }
            }
            if (code == KeyEvent.VK_ENTER) {
                if (gp.ui.commandNum == 0) {
                    gp.ui.titleScreenState = 1;
                }
                if (gp.ui.commandNum == 1) {
                    // LATER
                }
                if (gp.ui.commandNum == 2) {
                    System.exit(0);
                }
            }
        }
        // CLASS SELECTOR SCREEN
        else if (gp.ui.titleScreenState == 1) {

            if (code == KeyEvent.VK_W) {
                gp.ui.commandNum--;
                if (gp.ui.commandNum < 0) {
                    gp.ui.commandNum = 2;
                }
            }
            if (code == KeyEvent.VK_S) {
                gp.ui.commandNum++;
                if (gp.ui.commandNum > 2) {
                    gp.ui.commandNum = 0;
                }
            }
            if (code == KeyEvent.VK_ENTER) {
                if (gp.ui.commandNum == 0) {
                    gp.fighterClass = true;
                    System.out.println("FIGHTER");
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if (gp.ui.commandNum == 1) {
                    gp.survivorClass = true;
                    System.out.println("SURVIVOR");
                    gp.gameState = gp.playState;
                    gp.playMusic(0);
                }
                if (gp.ui.commandNum == 2) {
                    gp.ui.titleScreenState = 0;
                }
            }
        }
    }

    public void playState(int code) {

        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }
        if (code == KeyEvent.VK_Q) {
            gp.gameState = gp.characterState;
        }
        if (code == KeyEvent.VK_P) {
            gp.gameState = gp.pauseState;
        }
        if (code == KeyEvent.VK_ENTER) {
            enterPressed = true;
        }
        if (code == KeyEvent.VK_E) {
            shotKeyPressed = true;
        }

        // DEBUG
        if (code == KeyEvent.VK_T) {
            if (showDebugText == false && gp.collisionShow == false) {
                showDebugText = true;
                gp.collisionShow = true;
            } else if (showDebugText == true && gp.collisionShow == true) {
                showDebugText = false;
                gp.collisionShow = false;
            }
        }
        if (code == KeyEvent.VK_R) {
            gp.tileM.loadMap("/maps/mainmap02.txt");
        }
    }

    public void pauseState(int code) {

        if (code == KeyEvent.VK_P) {
            gp.gameState = gp.playState;
        }
    }

    public void dialogueState(int code) {

        if (code == KeyEvent.VK_ENTER) {
            gp.gameState = gp.playState;
        }
    }

    public void characterState(int code) {

        if (code == KeyEvent.VK_Q) {
            gp.gameState = gp.playState;
        }
        if (code == KeyEvent.VK_UP) {
            if (gp.ui.slotRow != 0) {
                gp.ui.slotRow--;
                gp.playSE(7);
            }
        }
        if (code == KeyEvent.VK_LEFT) {
            if (gp.ui.slotCol != 0) {
                gp.ui.slotCol--;
                gp.playSE(7);
            }
        }
        if (code == KeyEvent.VK_DOWN) {
            if (gp.ui.slotRow != 3) {
                gp.ui.slotRow++;
                gp.playSE(7);
            }
        }
        if (code == KeyEvent.VK_RIGHT) {
            if (gp.ui.slotCol != 4) {
                gp.ui.slotCol++;
                gp.playSE(7);
            }
        }
        if (code == KeyEvent.VK_ENTER) {
            gp.player.selectItem();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
        }
        if (code == KeyEvent.VK_E) {
            shotKeyPressed = false;
        }
    }
}
