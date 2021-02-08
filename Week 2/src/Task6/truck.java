package Task6;

public class truck extends car {//也可以作为小车的子类
   int payload;

    public int truck2(int payload){
        this.payload=payload;
        return payload;
    }
    public truck(int wheels, int weight,int londer,int payload) {
        super(wheels, weight,londer);
        truck2(payload);
    }

}
