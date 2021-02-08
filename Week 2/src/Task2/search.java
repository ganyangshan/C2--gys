package Task2;

import java.util.Scanner;

public class search {
    public String search(String[] str) {
        String a="";//相似的字符串
        int flag=1;//做标记
        for(int i=0;i<str[0].length();i++){//以第一个为标准
            char b=str[0].charAt(i);//定义b等于第一个字符串的第i个字母，在拿b与其余字符串做比较
            for(int j=0;j<str.length;j++){

                if(i>=str[j].length()){//到了最短字符串则退出循环
                    flag=0;
                    break  ;
                }

                if(b!=str[j].charAt(i)){
                    flag=0;//遇到不同则退出
                    break;
                }

                else{
                    if(j==str.length-1){
                        a+=b;//加上单个的字符b
                    }
                }

            }
            if(flag==0){
                break;
            }
        }
        return a;
    }


}
