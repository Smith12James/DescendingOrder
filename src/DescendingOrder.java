import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        //initialize two stringBuilders, one to take input and the second to sort with
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb.append(num);
        //array is used to sort array
        char temp[] = sb.toString().toCharArray();

        Arrays.sort(temp);

        //reverse array using for loop
        for(int i = temp.length - 1; i >= 0; i--) {
            sb2.append(temp[i]);
        }

        return Integer.parseInt(sb2.toString());
    }

    public static void main(String[] args) {

        System.out.println(12345 + "\t\t->\t" + (sortDesc(12345)));
        System.out.println(621858 + "\t\t->\t" + (sortDesc(621858)));
        System.out.println(123456789 + "\t->\t" + (sortDesc(123456789)));
        System.out.println(6545 + "\t\t->\t" + (sortDesc(6545)));

    }
}