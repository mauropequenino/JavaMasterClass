package generics.lesson_2;

public class Main {
    public static void main(String[] args) {
        FootballPlayer john = new FootballPlayer("John");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer lucas = new SoccerPlayer("Lucas");

        Team <FootballPlayer>adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(john);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freamntle");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        System.out.println(adelaideCrows.numPlayer());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
    }
}
