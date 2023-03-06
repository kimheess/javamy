package chap03;

import java.util.Comparator;

public class HeightOrderComparator implements Comparator<PhyiscData> {
    public int compare(PhyiscData d1, PhyiscData d2) {
        return (d1.height > d2.height) ?  1 :
               (d1.height < d2.height) ? -1 : 0;
    }
}
