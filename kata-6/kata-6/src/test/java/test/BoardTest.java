package test;

import org.junit.Test;
import software.ulpgc.kata6.Board;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static test.BoardTest.Boards.*;

public class BoardTest {

    public static class Boards{
        static final String empty= """
                ...
                ...
                ...
                """;

        static final String oneAliveCell= """
                ...
                ...
                ..X
                """;

        static final String squareLiveCell= """
                ...
                .XX
                .XX
                """;

        static final String triangleLiveCell= """
                ...
                ..X
                .XX
                """;
    }

    @Test
    public void should_return_empty_board_given_empty_board(){
        assertThat(new Board(empty).next().toString()).isEqualTo(empty);
    }

    @Test
    public void should_return_empty_board_given_one_cell_alive_board(){
        assertThat(new Board(oneAliveCell).next().toString()).isEqualTo(empty);
    }

    @Test
    public void should_return_square_board_given_square_board(){
        assertThat(new Board(squareLiveCell).next().toString()).isEqualTo(squareLiveCell);
    }

    @Test
    public void should_return_square_board_given_triangle_board(){
        assertThat(new Board(triangleLiveCell).next().toString()).isEqualTo(squareLiveCell);
    }

}
