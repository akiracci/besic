package ex.ex22;

class Ex22 {
   /* public static void main(String[] args) {
        //Ex19をStreamで処理しなさい。

        //CSVの読み込み
        Path path = Paths.get("src","ex","ex22","student.csv");
        List<Student> studentList = new ArrayList<>();
        Function<String, Student> toData = s -> {
        String[] column = s.split(",",7);
       return new Student(column[0],column[1]);
        };

        try (Stream<String> lines = Files.lines(path)) {
            studentList = lines
                    .map(toData)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        studentList.forEach(System.out::println);

    } */
}