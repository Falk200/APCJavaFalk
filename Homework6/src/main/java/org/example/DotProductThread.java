package org.example;

public class DotProductThread extends Thread {

    private int v1;
    private int v2;
    private int dot;

    public DotProductThread(int v1, int v2, int dot) {
        this.v1 = v1;
        this.v2 = v2;
        this.dot = dot;
    }

    public int getDot(){
        return dot;
    }

    @Override
    public void run() {
        dot = v1 * v2;
    }
}
