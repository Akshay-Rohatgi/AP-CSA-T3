import java.util.List;

public class MultipleGroups extends Runner {
    private List<NumberGroup> groupList;

    public void addGroup(Range r) {
        groupList.add(r);
    }



    @Override
    public void run() {
        MultipleGroups multiple1 = new MultipleGroups();

        Range r1 = new Range(5, 8);
        Range r2 = new Range(10, 12);
        Range r3 = new Range(1, 6);

        multiple1.addGroup(r1);
        multiple1.addGroup(r2);
        multiple1.addGroup(r3);

        System.out.println(multiple1.contains(11));

    }

    public boolean contains(int n) {
        for (NumberGroup group : groupList ) {
            if (group.contains(n)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String desc() {
        return "MultipleGroups";
    }
}
