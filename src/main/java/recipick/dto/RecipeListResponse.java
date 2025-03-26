package recipick.dto;

import java.util.List;

public record RecipeListResponse(
        List<RecipeDetailResponse> responseList
) {
}
