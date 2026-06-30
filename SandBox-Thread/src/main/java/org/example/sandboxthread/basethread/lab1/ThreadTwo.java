package org.example.sandboxthread.basethread.lab1;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        for (char a = 'a'; a <= 'j'; a++){
            System.out.println(a);
        }
    }
}
