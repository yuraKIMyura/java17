package dev1;


record BaseballPlayer(String name, String position){ }
public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_socre){
        String message = team1.setScore(t1_score, t2_socre);
        team2.setScore(t2_socre, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
