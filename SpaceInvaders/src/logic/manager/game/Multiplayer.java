package logic.manager.game;

import logic.player.Player;
import logic.player.Team;
import logic.sprite.Coordinate;
import logic.sprite.dinamic.SpaceShip;
import logic.sprite.dinamic.bullets.Bullet;
import main.Dimensions;
import logic.thread.ThreadUpdate;
import network.data.MessageBuilder;

import java.util.concurrent.ConcurrentHashMap;

public class Multiplayer extends Game{
    private MessageBuilder messageBuilder;
    private Team team;

    private ThreadUpdate threadUpdate;
    private static int DELTA = 1;

    public Multiplayer(MessageBuilder messageBuilder){
        this.messageBuilder = messageBuilder;
        team = new Team();
    }

    public Player init(int ID, String[] name){
        Coordinate coordinate = new Coordinate((Dimensions.MAX_WIDTH / 2 - Dimensions.SHIP_WIDTH / 2),
                (Dimensions.MAX_HEIGHT - Dimensions.SHIP_HEIGHT));
        SpaceShip defaultShip = new SpaceShip(coordinate);
        Player player = new Player(Integer.toString(ID), defaultShip);
        team.addPlayer(ID, player);
        return player;
    }

    public void startGame(){
        super.startGame();
        messageBuilder.setGameStateInfo(States.START);
        update(DELTA);
    }

    public void stopGame() {
        super.stopGame();
        if(isThreadRunning()) {
            threadUpdate.stop();
        }
        team.clear();
    }

    /**
     * Attivazione thread di aggiornamento di tutti gli elementi presenti sul campo di gioco
     */
    public void update(int delta) {
        threadUpdate = new ThreadUpdate(this, messageBuilder, delta);
        threadUpdate.start();
    }

    public Team getTeam(){
        return team;
    }

    public ConcurrentHashMap<Integer, Player> getPlayers(){
        return team.getPlayers();
    }

    public SpaceShip getSpaceShip(int ID){
        return getPlayers().get(ID).getSpaceShip();
    }

    public Bullet getSpaceShipBullet(int ID){
        return getSpaceShip(ID).getShipBullet();
    }

}
