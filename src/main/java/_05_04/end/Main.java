package _05_04.end;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
//        Runnable runnable = new RunnableExample();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(new RunnableExample());
//        executorService.submit(() -> System.out.println("Hello from a runnable running in an ExecutorService"));
//
//        executorService.shutdown();
        System.out.println(getTwoIntegers(1,2));
    }
    private static int getTwoIntegers(int firstValue, int secondValue){
        Scanner input = new Scanner(System.in);
        firstValue = input.nextInt();
        secondValue = input.nextInt();
        return firstValue + secondValue;
    }

}
