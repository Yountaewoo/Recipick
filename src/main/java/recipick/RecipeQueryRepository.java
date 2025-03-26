package recipick;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeQueryRepository {

    private final QRecipe recipe = QRecipe.recipe;
    private final JPAQueryFactory queryFactory;

    public RecipeQueryRepository(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public List<Recipe> findRecipesByKeyWord(String keyWord) {
        return queryFactory.selectFrom(recipe)
                .where(findByCkgNm(keyWord))
                .fetch();
    }

    public List<Recipe> findRecipeByIngredient(String keyword) {
        return queryFactory.selectFrom(recipe)
                .where(findByIngredient(keyword))
                .fetch();
    }

    public BooleanExpression findByCkgNm(String keyWord) {
        if (keyWord == null) {
            return null;
        }
        return recipe.ckgNm.contains(keyWord);
    }


    public BooleanExpression findByIngredient(String keyWord) {
        if (keyWord == null) {
            return null;
        }
        return recipe.ckgMtrlActoNm.contains(keyWord);
    }


}

