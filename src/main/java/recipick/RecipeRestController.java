package recipick;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import recipick.dto.RecipeListResponse;

@RestController
public class RecipeRestController {

    private final RecipeService recipeService;

    public RecipeRestController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes/cookName")
    public RecipeListResponse findByCookName(@RequestParam String cookName) {
        return recipeService.findByCookName(cookName);
    }

    @GetMapping("/recipes/ingredient")
    public RecipeListResponse findVyIngredient(@RequestParam String ingredient) {
        return recipeService.findByIngredient(ingredient);
    }
}
