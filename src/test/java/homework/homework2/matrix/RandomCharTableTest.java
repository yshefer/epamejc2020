package homework.homework2.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomCharTableTest {

    @Test
    public void charTableSizeTest() {
        int rowsCount = 46;
        int columnsCount = 59;

        RandomCharTable charTable = new RandomCharTable(rowsCount, columnsCount);
        char[][] matrix = charTable.getMatrix();

        assertEquals(rowsCount, matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            assertEquals(i + "th row size mismatch  ", columnsCount, matrix[i].length);
        }
    }
}