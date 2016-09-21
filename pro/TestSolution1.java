public class TestSolution1{
public static void main(String[] args){
Solution4 s=new Solution4();
System.out.println(s.embedword("<<>>","pavani"));
}
}

public String embedword(String s1,String s2){
StringBuilder sb=new StringBuilder(s1);
sb.insert(s1.length()/2,s2);
return sb.toString();
}
}
