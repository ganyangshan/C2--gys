package Task6;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//        示例一：
//        输入：s = "()"
//        输出：true
public class jadge {//必须成对存在

    public boolean jadge(String s) {
        if(s.length()<2||s.length()%2!=0){//单个存在的排除
                return false;
        }
        int count = 0;
        while(count<s.length()/2){
            s = s.replace("{}","").replace("[]","").replace("()","");
            count++;
        }
        if(s.length()>0){
            return false;
        }
        else{
            return true;
        }
    }


}
