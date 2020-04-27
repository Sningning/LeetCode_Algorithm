package array;

/**
 * 70. 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * https://leetcode-cn.com/problems/climbing-stairs/
 *
 * @Author: Song Ningning
 * @Date: 2020-04-25 22:50
 */
public class ClimbingStairs {

    // 解题时要寻找最近重复子问题

    // 1 个台阶：1种；
    // 2 个台阶：2种；
    // 3 个台阶：在2个台阶基础上跨1步 or 在1个台阶基础上跨2步，即 f(2) + f(1)
    // 4 个台阶：在3个台阶基础上跨1步 or 在2个台阶基础上跨2步，即 f(3) + f(2)
    // n 个台阶：在(n - 1)个台阶基础上跨1步 or 在(n - 2)个台阶基础上跨2步，即 f(n - 1) + f(n - 2) ---> Fibonacci
    // 转换为找出以 1 和 2 作为第一项和第二项的斐波那契数列中的第 n 个数，也就是说 Fib(1)=1 且 Fib(2)=2。
    // 时间复杂度：O(n)，单循环到 n，需要计算第 n 个斐波那契数。
    // 空间复杂度：O(1)，使用常量级空间。

    public int climbStairs(int n) {

        // int f1 = 1;
        // int f2 = 2;
        // int fn = 0;
        //
        // if (n == 1) {
        //     return f1;
        // }
        // if (n == 2) {
        //     return f2;
        // }
        //
        // for (int i = 3; i <= n; i++) {
        //     fn = f1 + f2;
        //     f1 = f2;
        //     f2 = fn;
        // }
        // return fn;

        // 也可以Fibonacci数列的第一项也放上，i 从 1 直接开始循环。
        int f1 = 1, f2 = 1, sum = 1;
        for (int i = 1; i < n; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }


}
