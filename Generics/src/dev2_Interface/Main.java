package dev2_Interface;

interface Player { }

record BaseballPlayer(String name, String position) implements Player{ }
record FootballPlayer(String name, String position) implements Player{ }

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros = new SportsTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);

//no type checking! Guthrie is a BaseballPlayer, but was added to FootballPlayer
        var guthrie = new BaseballPlayer("D Guthrie", "Centre Fielder");
        afc.addTeamMember(guthrie);

        afc.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_socre){
        String message = team1.setScore(t1_score, t2_socre);
        team2.setScore(t2_socre, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_socre){
        String message = team1.setScore(t1_score, t2_socre);
        team2.setScore(t2_socre, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
