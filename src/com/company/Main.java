package com.company;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("F성적을 받을 수 있는 경우의 수\n\n");

            String cheat = "부정행위"; // 부정행위
            String hour = "1시간 * 15번"; // 1시간 결석 * 15회
            String day = "하루 결석"; // 하루 3시간 결석

            String[] select = { cheat, hour, day };
            Select d = new Select(select);
            d.cycle(3, 2, 0);
            d.cycle(3, 1, 0);
            d.cycle(3, 3, 0);
        }
    }
}
