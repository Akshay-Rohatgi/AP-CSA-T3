import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;

    private final List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int row, int col) {
        for (SparseArrayEntry item : entries) {
            if ((item.getRow() == row) && (item.getCol() == col)) {
                return item.getValue();
            } else {
                return 0;
            }
        }
        return -1;
    }

    public void removeColumn(int col) {
        for (int n = 0; n < entries.size(); n++) {
            if (entries.get(n).getCol() == col) {
                int newCol = entries.get(n).getCol() -1;
                entries.set(n, new SparseArrayEntry(entries.get(n).getRow(), newCol, entries.get(n).getValue()));
            }
        }
    }

}
