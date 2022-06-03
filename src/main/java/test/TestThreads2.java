package test;

import core.threads.Work;
import core.threads.command.RunOn;
import core.threads.impl.Threads;

public class TestThreads2 implements Work {

    @Override
    @RunOn(thread = Threads.BACKGROUND)
    public Object async() {
        String work = "Work 2";

        return work;
    }

    @Override
    @RunOn(thread = Threads.LOOPER)
    public void start(Object asyncReturn) {
        System.out.println("Using shared data2 " + asyncReturn);
    }


    @RunOn(thread = Threads.LOOPER)
    public void start2(Object asyncReturn) {
        System.out.println("Using shared data " + asyncReturn);
    }
}