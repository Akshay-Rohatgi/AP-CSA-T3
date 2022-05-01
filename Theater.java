import java.util.Arrays;

public class Theater {
    private Seat[][] theaterSeats;

    public Theater(int seatsPerRow, int tier1Rows, int tier2Rows) {
        int j;
        int i;
        theaterSeats = new Seat[tier1Rows + tier2Rows][seatsPerRow];

        for (i = 0; i < tier1Rows; i++) {
            for (j = 0; j < seatsPerRow; j++) {
                theaterSeats[i][j] = new Seat(true, 1);
            }
        }

        for (i = tier1Rows; i < (tier1Rows+tier2Rows); i++) {
            for (j = 0; j < seatsPerRow; j++) {
                theaterSeats[i][j] = new Seat(true, 2);
            }
        }

    }

    public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
        if (theaterSeats[fromRow][fromCol].getTier() <= theaterSeats[toRow][toCol].getTier()) {
            theaterSeats[fromRow][fromCol].setAvailability(true);
            theaterSeats[toRow][toCol].setAvailability(false);
            return true;
        } else {
            return false;
        }
    }

    public Seat[][] getTheaterSeats() {
        return theaterSeats;
    }

    public static void main(String[] args) {
        Theater one = new Theater(3, 2, 1);
        System.out.println(Arrays.deepToString(one.getTheaterSeats()));
        boolean tmp = one.reassignSeat(0, 0, 2, 2);
        System.out.println(Arrays.deepToString(one.getTheaterSeats()));

    }

}
