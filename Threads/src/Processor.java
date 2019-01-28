public class Processor extends Thread {
    private boolean singal;
    public void run(){
        while(this.singal){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public void shutdown(){
        this.singal = false;
    }

}
