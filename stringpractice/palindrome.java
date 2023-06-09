


public class palindrome {
    public static void main(String[] args) {

        String aa = "A man, a plan, a knal: Panama";
        String a = aa.toLowerCase();
        String new1 = "";
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                new1 = new1 + a.charAt(i);
            }

        }
        System.out.println(new1);

        int f = 0;

        for (int i = 0, j = new1.length() - 1; i < new1.length() / 2; i++, j--) {
            if (new1.charAt(i) == new1.charAt(j)) {
                f = 1;
                System.out.println(new1.charAt(i));
                System.out.println(new1.charAt(j));
            } else {

                f = 0;
                break;
            }
        }

        if (f == 1) {
            System.out.println("palindrme");
        } else {
            System.out.println(" not palindrme");
        }
    }
}