package ex.ex17;

import objectSample.exceptionSample.original.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Person {
    private String name;
    private Gender gender;
    LocalDate birth;

    Person(String name, Gender gender, String birth){

        this.name =name;
        this.gender =gender;
        this.birth = LocalDate.parse(birth);
    }

    public String getName() {
        return name;
    }

    /**
     * 性別の文字列を取得する
     * @return 性別 String
     */
    public String getGender() {
        return gender.getName();
    }

    /**
     * 誕生日のyyyy/MM/dd形式の文字列を取得する
     * @return 誕生日のyyyy/MM/dd形式の文字列 String
     */
    public String getBirth() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return formatter.format(birth);
    }

    /**
     * 年齢を所得する
     * @return 年齢 Long
     */
    //ChronoUnitを活用
    public Long getAge() {
        return ChronoUnit.YEARS.between(birth, LocalDateTime.now());
    }

    /**
     * Personの文字列表現
     * @return 文字列表現 "やまだ 男 2005/02/15 16" String
     */
    @Override
    public String toString() {
        return String.format("%s %s %s %d",
                getName(),getGender(),getBirth(),getAge());
    }
}
/*
    コンストラクターに与えるデータ形式
    名前　name 文字列
    性別　gender
    誕生日　LocalDate 引数はios文字列　文字型　2005-02-15
     */

    /*
    getter
    名前は文字列で性別は「男or女」
    誕生日は2005/02/15
    getAge()で年齢を取得できるように。１６際
     */

