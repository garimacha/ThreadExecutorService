package ThreadPoolExample;

/**
 * This class is implementing the Runnable interface and its method run()
 */
public class SimpExec implements Runnable {

    private String command;

    //paramaterized constructor
    public SimpExec(String s){
        this.command=s;
    }

    @Override
    public void run(){
        //this is printing the thread start and end
        System.out.println(Thread.currentThread().getName()+"Start. Command = "+command);
        processCommand();

        System.out.println(Thread.currentThread().getName()+" End.");

    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString(){
        return this.command;
    }

}
