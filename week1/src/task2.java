public class task2 {
    public static void main(String[] args){
        int a,b,c,num,count = 0;
        System.out.println("1000以内水仙花数有；");
        for(a= 1; a<10; a++){
            for(b=0;b<10;b++){
                for(c=0;c<10;c++){
                    num = a*100+b*10+c;
                    if(num==a*a*a+b*b*b+c*c*c){
                        System.out.println(num+"\n");
                        count++;
                    }
                }
            }
        }
        System.out.println("共计"+count+"个");
    }

}
