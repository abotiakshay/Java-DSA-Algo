import java.util.*;

class Data {
    int l;
    int r;

    Data(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

public class mosalgo {
    public static void main(String[] args) {
        ArrayList<Data> a = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int arr[] = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
        a.add(new Data(0, 4));
        a.add(new Data(1, 3));
        a.add(new Data(2, 4));

        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = 0;
            for (int j = a.get(i).l; j <= a.get(i).r; j++) {
                sum = sum + arr[j];

            }
            result.add(sum);

        }

        System.out.println(result.toString());

    }
}
