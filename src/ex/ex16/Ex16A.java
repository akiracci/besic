package ex.ex16;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ex16A {
    public static void main(String[] args) {
        List<String> zipCode = List.of("000-0000","1234-567","A23-b567","123-4567");
        List<String> phoneNo = List.of("03-1234-5678","011-234-5678","0123-12-9999","123-456-789");

        //郵便番号
        Pattern zip = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        //Pattern zip = Pattern.compile("^\\d{3}-\\d{4}$");
        for (String z:zipCode) {
            Matcher matcher = zip.matcher(z);//それぞれの文字列を正規表現比較
            System.out.println(z + ":" + matcher.matches());//結果表示
        }

        //電話番号
        Pattern phone = Pattern.compile("^0([0-9]-[0-9]{4}|[0-9]{2}-[0-9]{3}|[0-9]{3}-[0-9]{2}|[0-9]{4}-[0-9])-[0-9]{4}$");
        //Pattern phone = Pattern.compile("^0(\\d-\\d{4}|\\d{2}-\\d{3}|\\d{3}-\\d{2}|\\d{4}-\\d)-\\d{4}$");
        for (String p:phoneNo) {
            Matcher matcher = phone.matcher(p);//それぞれの文字列を正規表現比較
            System.out.println(p + ":" + matcher.matches());//結果表示
        }

        //おまけ 数値のレンジチェック 例 0-100
        //https://www.simple-edition.com/prog_memo/number_range_regexp
        List<String> numList = List.of("-1","0","50","100","101");
        Pattern limitNum = Pattern.compile("^\\d|[1-9]\\d|100$");
        for (String n:numList) {
            Matcher matcher = limitNum.matcher(n);//それぞれの文字列を正規表現比較
            System.out.println(n + ":" + matcher.matches());//結果表示
        }
    }
}