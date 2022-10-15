package chapter05;

public class EX5_1_1 {
    public static void main(String[] args) {
        int n = 1, ans;
        System.out.println(++n);
        System.out.println(n++);
        ans = 1 + n++;
        System.out.println(ans);
        System.out.println(n);
    }
}
