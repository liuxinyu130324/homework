package org.example;
public class Day4 {
    public static void main(String[] args) {
        doGame();
    }
    public static void doGame(){
        // 使用 for 循环获取 1 到 20 的数
        for(int i = 1;i <= 20;i++){
            // 判断数字是否是7的倍数或者含数字7
            if(i % 7 == 0 || i % 10 == 7 || i / 10  == 7){
                System.out.println("数字 " + i + " 过！");
            }
        }
    }
}

