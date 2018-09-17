public class PlayingCat {
    // !summer - cat plays between 25 & 35 inclusive
    // summer - cat plays between 25 & 45 inclusive

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean result;

        if (!summer) {
            result = (temperature >= 25 && temperature <= 35) ? true : false;
        } else {
            result = (temperature >= 25 && temperature <= 45) ? true : false;
        }

        return result;
    }
}
