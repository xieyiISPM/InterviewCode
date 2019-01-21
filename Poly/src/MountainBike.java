public class MountainBike<T> extends Bike<T>{

    public MountainBike(){

    }

    public void setGear(T num){
        T gearNum = num;
        System.out.println("This is child mountain bike: gear= " + gearNum);
    }

    public void tire(){
        System.out.println("This is child mountain bike: tire");
    }

}
