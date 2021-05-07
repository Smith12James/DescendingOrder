import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(num);
        char temp[] = sb.toString().toCharArray();

        Arrays.sort(temp);

        for(int i = temp.length - 1; i >= 0; i--) {
            sb2.append(temp[i]);
        }

        return Integer.parseInt(sb2.toString());
    }

    public static void main(String[] args) {

        System.out.print(sortDesc(12345));
        System.out.print(sortDesc(621858));
        System.out.print(sortDesc(123456789));
        System.out.print(sortDesc(6545));

    }
}