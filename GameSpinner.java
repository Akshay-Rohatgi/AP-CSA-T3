public class GameSpinner {
    private int currentRunLength;
    private int sectorNum;
    private int prevSpin;

    public GameSpinner(int sectors) {
        sectorNum = sectors;
        currentRunLength = 0;
        prevSpin = -1;
    }

    public int spin() {
        int spinNum = (int) (Math.random() * (sectorNum-1)) + 1;
        if (spinNum == prevSpin) {
            currentRunLength += 1;
        } else {
            prevSpin = spinNum;
            currentRunLength = 1;
        }
        return spinNum;
    }

    public int currentRun() {
        return currentRunLength;
    }

    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(12);
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());
        System.out.println(g.spin());
        System.out.println(g.currentRun());

    }

}
