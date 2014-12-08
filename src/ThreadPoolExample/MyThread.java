package ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  //we are creating fixed size thread pool of 5 worker threads.
 //Then we are submitting 5 jobs to this pool, since the pool size is 2,
 // it will start working on 2 jobs and other jobs will be in wait state, as soon as one of the job is finished,
 // another job from the wait queue will be picked up by worker thread and get’s executed.
 */
public class MyThread {

    public static void main(String[] args){
        ExecuterThreadsHelper();
    }

    private static void ExecuterThreadsHelper(){
        ExecutorService executor= Executors.newFixedThreadPool(2);

        for(int i=0;i<=5;i++){
            Runnable worker=new SimpExec(""+i);
            executor.execute(worker);
        }
        executor.shutdown();//this is shutting the threads
        while(!executor.isShutdown()){

        }

        System.out.println("Finished all threads");

    }
}
