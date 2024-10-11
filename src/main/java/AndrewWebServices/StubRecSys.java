package AndrewWebServices;

import java.util.concurrent.TimeUnit;

/*
 * StubRecSys is data implementation of the AndrewWS recommendation system.
 *
 */
public class StubRecSys extends RecSys {
    public String getRecommendation(String accountName) {
        return "Animal House";
    }
}
