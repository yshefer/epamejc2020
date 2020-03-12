package homework.homework3;

import homework.homework3.arrays.RandomPyramidalMatrix;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomPyramidalMatrixTest {

    @Test
    public void matrixSizeTest() {
        int rowsCount = 46;

        RandomPyramidalMatrix charTable = new RandomPyramidalMatrix(rowsCount);
        char[][] matrix = charTable.getMatrix();

        assertEquals(rowsCount, matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            assertEquals(i + "th row size mismatch  ", rowsCount-i, matrix[i].length);
        }
    }

}