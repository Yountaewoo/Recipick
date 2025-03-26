package recipick;

import org.springframework.stereotype.Service;
import recipick.dto.RecipeDetailResponse;
import recipick.dto.RecipeListResponse;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeQueryRepository recipeQueryRepository;

    public RecipeService(RecipeRepository recipeRepository, RecipeQueryRepository recipeQueryRepository) {
        this.recipeRepository = recipeRepository;
        this.recipeQueryRepository = recipeQueryRepository;
    }

    public RecipeListResponse findByCookName(String keyWord) {
        List<Recipe> recipes = recipeQueryRepository.findRecipesByKeyWord(keyWord);
        return new RecipeListResponse(recipes.stream().
                map(recipe -> new RecipeDetailResponse(
                        recipe.getRcpSno(),
                        recipe.getRcpTtl(),
                        recipe.getCkgNm(),
                        recipe.getRgtrId(),
                        recipe.getRgtrNm(),
                        recipe.getInqCnt(),
                        recipe.getRcmmCnt(),
                        recipe.getSrapCnt(),
                        recipe.getCkgMthActoNm(),
                        recipe.getCkgStaActoNm(),
                        recipe.getCkgMtrlActoNm(),
                        recipe.getCkgKndActoNm(),
                        recipe.getCkgIpdc(),
                        recipe.getCkgMtrlCn(),
                        recipe.getCkgInbunNm(),
                        recipe.getCkgDodfNm(),
                        recipe.getCkgTimeNm(),
                        recipe.getFirstRegDt(),
                        recipe.getRcpImgUrl()
                )).toList());
    }

    public RecipeListResponse findByIngredient(String keyWord) {
        List<Recipe> recipes = recipeQueryRepository.findRecipeByIngredient(keyWord);
        return new RecipeListResponse(recipes.stream().
                map(recipe -> new RecipeDetailResponse(
                        recipe.getRcpSno(),
                        recipe.getRcpTtl(),
                        recipe.getCkgNm(),
                        recipe.getRgtrId(),
                        recipe.getRgtrNm(),
                        recipe.getInqCnt(),
                        recipe.getRcmmCnt(),
                        recipe.getSrapCnt(),
                        recipe.getCkgMthActoNm(),
                        recipe.getCkgStaActoNm(),
                        recipe.getCkgMtrlActoNm(),
                        recipe.getCkgKndActoNm(),
                        recipe.getCkgIpdc(),
                        recipe.getCkgMtrlCn(),
                        recipe.getCkgInbunNm(),
                        recipe.getCkgDodfNm(),
                        recipe.getCkgTimeNm(),
                        recipe.getFirstRegDt(),
                        recipe.getRcpImgUrl()
                )).toList());
    }
}

