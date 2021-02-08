package Task6;

public class car extends vehicle{
    int loader;
    public int Loader(int loader) {
        this.loader=loader;
        return loader;
    }
    public car(int wheels, int weight,int Loader) {
        super(wheels, weight);//调用父类
        Loader(loader);
    }
}
