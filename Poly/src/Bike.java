public class Bike<T> {
    public Bike (){

    }
    public void setGear(T num){
        T gearNum = num;
        System.out.println("This is parent bike- gear= "+ gearNum);

    }

    public void tire(){
        System.out.println("This is parent bike tire ");
    }
}
