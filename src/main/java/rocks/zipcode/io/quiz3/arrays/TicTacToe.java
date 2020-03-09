package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];
        String first = "";
        String second = "";
        String third = "";
        first += board[value][0];
        second += board[value][1];
        third += board[value][2];
        for (int i = 0; i <row.length ; i++) {
            if (i == 0){
                row[i] = first;
            }
            if( i == 1){
                row[i] = second;
            }
            if( i == 2){
                row[i] = third;
            }
        }

        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        String top = "";
        String middle = "";
        String bottem = "";
        top += board[0][value];
        middle += board[1][value];
        bottem += board[2][value];
        for (int i = 0; i <column.length ; i++) {
            if (i == 0){
                column[i] = top;
            }
            if( i == 1){
                column[i] = middle;
            }
            if( i == 2){
                column[i] = bottem;
            }
        }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
