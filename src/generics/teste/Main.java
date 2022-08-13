package generics.teste;

public class Main {
    public static void main(String[] args) {
        //Liga
        Room <Team<CarGamePlayer>> raceRoom = new Room<>("Speed Race");
        //Criar varias team
        Team<CarGamePlayer> team1 = new Team("Team 1");
        Team<CarGamePlayer> team2 = new Team("Team 2");
        Team<CarGamePlayer> team3 = new Team("Team 3");

        //Adicionar as teams na liga
        raceRoom.add(team1);
        raceRoom.add(team2);
        raceRoom.add(team3);

        //Adicionar jogadores as teams
        CarGamePlayer john = new CarGamePlayer("John", "17");
        CarGamePlayer jane = new CarGamePlayer("Jane", "18");
        CarGamePlayer charles = new CarGamePlayer("Charles", "16");
        team1.addPlayer(jane);
        team2.addPlayer(charles);
        team3.addPlayer(john);

        //Criar resultados
        System.out.println();
        team1.matchResult(team2, 2,5);
        team2.matchResult(team1, 5,3);
        team3.matchResult(team1, 7, 7);

        //Mostrar a classificao da liga
        raceRoom.showRoomTab();


        //Criar uma liga em que podem contem jogadores de todos
        Team<WarGamePlayer> warTeam1 = new Team<>("War Team 1");
        Room rawRoom = new Room("Raw room");
        rawRoom.add(team1);
        rawRoom.add(warTeam1);


    }
}
