package recipick;

import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
