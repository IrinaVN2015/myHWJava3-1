public class BonusMilesService {
    public int calculate(int price) {
        int bonusesPerMile = 20; //количество рублей для одной бонусной мили
        int ollMile = (price / bonusesPerMile);
        return ollMile;
    }

}
