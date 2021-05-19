public class BonusMilesService {
    // Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.
    // Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля. Дробные мили не начисляются.
    public int calculate(int price) {
        int BONUS_STEP = 20;
        int bonus = price / BONUS_STEP;
        return bonus;
    }
}
