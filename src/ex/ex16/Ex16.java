package ex.ex16;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ex16 {
    public static void main(String[] args) {
        List<String> zipCode = List.of("000-0000","1234-567","A23-b567","123-4567");
        List<String> phoneNo = List.of("03-1234-5678","011-234-5678","0123-12-9999","123-456-789");

        Pattern pattern1 = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        for (String s : zipCode){
            Matcher matcher1 = pattern1.matcher(s);
            System.out.println(s + ":" + matcher1.matches());
        }
        System.out.println();
        Pattern pattern2 = Pattern.compile("^0([0-9]-[0-9]{4}|[0-9]{2}-[0-9]{3}|[0-9]{3}-[0-9]{2})-[0-9]{4}$");
        for (String s : phoneNo){
            Matcher matcher2 = pattern2.matcher(s);
            System.out.println(s + ":" + matcher2.matches());
        }
    }
}