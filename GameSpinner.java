public class GameSpinner extends Runner {
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

    public void run() {
        System.out.println("Gamespinner with 12 sectors");
        GameSpinner g = new GameSpinner(12);
        System.out.println("current run " + g.currentRun());
        System.out.println("spin" + g.spin());
        System.out.println("current run " + g.currentRun());
        System.out.println("spin " + g.spin());
        System.out.println("current run " + g.currentRun());

    }

    @Override
    public String desc() {
        return "2020 Q2";
    }

}
