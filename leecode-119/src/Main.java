import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liulingzhou
 * @Date: 2021/2/12 23:17
 * @descption
 */
public class Main {

    //杨辉三角。第K行第N个数字是第K-1行的第N-1个数字+N+1个数字的和
    //K从0开始，即第0行是1
    //观察不难发现，每一行的最后一个都是数字1.即如果从第0行开始的话，默认不走循环
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        int[][] ch = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ch[i][j] = 1;
                } else {
                    ch[i][j] = ch[i - 1][j] + ch[i - 1][j - 1];
                }
                if (i == rowIndex)
                    list.add(ch[i][j]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}