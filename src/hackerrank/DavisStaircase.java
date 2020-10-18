package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class DavisStaircase {
    private static final Map<Integer, Integer> map = new HashMap<>();

    static int stepPerms(int n) {
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            default:
                Integer val = map.get(n);
                if(val == null) {
                    val = stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
                    map.put(n,val);
                }
                return val;
        }
    }
}
