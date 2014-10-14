package no.web.mazegame;

import org.junit.Test;

public class MazeGameTest {

    @Test
    public void should_have_mazegame () {
        MazeGame game = new MazeGame();
    }

    @Test
    public void should_have_magical_mazegame () {
        MagiclMazeGame game = new MagiclMazeGame();
    }

    @Test
    public void maze_should_have_rooms () {
        Room room1 = new Room();
    }

    @Test
    public void maze_should_have_magical_rooms () {
        MagicalRoom room1 = new MagicalRoom();
    }


    @Test
    public void mazegame_should_should_have_winner () {
        MazeGame mazeGame = new MazeGame();
        mazeGame.announceWinner();
    }
}

