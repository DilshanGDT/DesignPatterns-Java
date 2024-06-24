package S_ProxyPattern;

public class SongRecomendation implements Recomendation {

    public SongRecomendation(User user) {
        getData(user);
    }

    @Override
    public void showRecomendations(User user) {
        System.out.println(
                "Showing some recomendations for " + user.getName() + " Based on their top tracks, artists & genres.");
    }

    private void getData(User user) {
        System.out.println("Getting " + user.getName() + "'s top tracks from database...");
        System.out.println("Getting " + user.getName() + "'s top artists from database...");
        System.out.println("Getting " + user.getName() + "'s top genres from database...");
    }

}
