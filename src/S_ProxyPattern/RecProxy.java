package S_ProxyPattern;

public class RecProxy implements Recomendation {

    private Recomendation recs;

    @Override
    public void showRecomendations(User user) {

        if (user.isPremuim()) {
            if (recs == null) {
                recs = new SongRecomendation(user);
            }
            recs.showRecomendations(user);
        } else {
            System.out.println("Upgrade to premium to see recomendation");
        }
    }

}
