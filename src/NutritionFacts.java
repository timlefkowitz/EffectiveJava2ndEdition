/*


        Telescoping Constructor Pattern - DOES NOT scale well!


 */

public class NutritionFacts {

    private final int servingSize;  // (ml)                     required
    private final int servings;     // (per container)          required
    private final int calories;     //                          optional
    private final int fat;          // (g)                      optional
    private final int sodium;       // (mg)                     optional
    private final int carbohydrate; // (g)                      optional



    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

}
