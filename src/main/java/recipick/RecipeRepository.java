package recipick;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
