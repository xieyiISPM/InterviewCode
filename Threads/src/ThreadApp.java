import java.util.Scanner;

public class ThreadApp {
    public static void main(String[] args){

    /*    ThreadTest[] tt = new ThreadTest[10];
        for (int i=0; i< 4; i++){
            tt[i] = new ThreadTest();
            tt[i].start();
        }

        Thread[] myThread = new Thread[10];
        for(int i = 0; i< 3; i++){
            myThread[i] = new Thread(new MyThread());
            myThread[i].start();
        }
    */

        Processor p1 = new Processor();
        p1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        p1.shutdown();

    }
}
