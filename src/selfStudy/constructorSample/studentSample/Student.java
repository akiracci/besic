package selfStudy.constructorSample.studentSample;

class Student {
    private String name;
    private int grade;
    private int cl;
    private int no;

    //コンストラクター
    public Student(String name, int grade, int cl, int no) {
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %2d",
                name,grade,cl,no);
    }



}