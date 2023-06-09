import java.util.ArrayList;

public class arrayoalindronme {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(5);
        a.add(1);

        int count = 0;
        int i = 0, j = a.size() - 1;
        while (i <= j) {
            if (a.get(i) == a.get(j)) {
                i++;
                j--;
            } else if (a.get(i) < a.get(j)) {
                int sum = a.get(i) + a.get(i + 1);
                i++;
                a.add(i, sum);
                count++;
            } else {
                int sum = a.get(j) + a.get(j - 1);
                j--;
                a.add(j, sum);
                count++;
            }
        }
        System.out.println(a.toString() + " " + count);
    }
}
