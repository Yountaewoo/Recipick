package recipick.dto;

public record RecipeDetailResponse(
        Long rcpSno,
        String rcpTtl,
        String ckgNm,
        String rgtrId,
        String rgtrNm,
        Integer inqCnt,
        Integer rcmmCnt,
        Integer srapCnt,
        String ckgMthActoNm,
        String ckgStaActoNm,
        String ckgMtrlActoNm,
        String ckgKndActoNm,
        String ckgIpdc,
        String ckgMtrlCn,
        String ckgInbunNm,
        String ckgDodfNm,
        String ckgTimeNm,
        String firstRegDt,
        String rcpImgUrl
) {
}