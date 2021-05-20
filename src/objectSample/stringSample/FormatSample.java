
package objectSample.stringSample;

import java.text.MessageFormat;
import java.text.NumberFormat;

public class FormatSample {


        public static void main(String[] args) {




            //String.format
            String name = "Tom";
            int age =29;
            System.out.println(String.format("name:%s age:%d", name, age));

            //printf
            System.out.printf("name:%s age:%d",name,age);


            //MessageFormat
            //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/text/MessageFormat.html
            System.out.println(MessageFormat.format("name:{0} age:{1}", name, age));

            //NumberFormat
            //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/text/NumberFormat.html
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            System.out.println(nf.format(1234567));


            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(percent.format(0.724));
        }
    }


