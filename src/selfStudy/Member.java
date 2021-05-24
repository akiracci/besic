package selfStudy;

class Member {

    private String id;
    private String name;
    private int rank;
    private String club;
    private String position;

    public Member(String id, String name, int rank, String club, String position) {

        this.id = id;
        this.name = name;
        this.rank = rank;
        this.club = club;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s",
                id, name, rank, club, position);
    }

    public static void main(String[] args) {

        Member[] members = {
                new Member("1", "かわい", 1, "吹奏楽", "いきもの"),
                new Member("2", "きよふじ", 2, "新聞", "委員長"),
                new Member("3", "しんどう", 3, "サッカー", "給食")
        };

        for (Member member : members) {
            System.out.println(member);
        }
    }
}