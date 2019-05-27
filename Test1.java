/*
题目描述
二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1
每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能等于2。
对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为:
( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根
小易想知道最多可以放多少块蛋糕在网格盒子里。
输入描述:
每组数组包含网格长宽W,H，用空格分割.(1 ≤ W、H ≤ 1000)
输出描述:
输出一个最多可以放的蛋糕数
示例1
输入

3 2
输出
4
*/

package bishi0527;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int w = sc.nextInt();
            int count = 0;
            for(int i = 0;i<h;i++){
                int j =0;
                if(i/2%2 !=0){
                    j=2;
                }
                for(;j<w;j+=4){
                    if(j+1<w){
                        count +=2;
                    }else{
                        count+=1;
                    }
                }
            }
            System.out.println(count);

    }
}
