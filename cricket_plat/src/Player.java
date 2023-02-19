public class Player {
    private final String name;
    private final int age;
    private int totalRuns;
    private int ballsPlayed;
    private String type;

//    constructor
    Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalRuns = 0;
        this.ballsPlayed = 0;
    }

//    getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public String getType() {
        return type;
    }

//    setters
    public void setType(String type) {
        this.type = type;
    }

    public void display() {
//        using printf function
        System.out.printf("%15s (%s) : %3d (%d) \n ", getName(), getType(), getTotalRuns(), getBallsPlayed());
    }
}
