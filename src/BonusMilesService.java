public class BonusMilesService {
    public int calculate(int cost) {
        int milePrice = 100;
        int mileCount = cost / milePrice;

        return mileCount;
    }
}
