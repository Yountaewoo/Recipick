package recipick;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "RECIPE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Recipe {

    @Id
    @Column(name = "RCP_SNO", nullable = false, precision = 40)
    private Long rcpSno;

    @Column(name = "RCP_TTL", length = 200)
    private String rcpTtl;

    @Column(name = "CKG_NM", length = 40)
    private String ckgNm;

    @Column(name = "RGTR_ID", length = 32)
    private String rgtrId;

    @Column(name = "RGTR_NM", length = 64)
    private String rgtrNm;

    @Column(name = "INQ_CNT")
    private Integer inqCnt;

    @Column(name = "RCMM_CNT")
    private Integer rcmmCnt;

    @Column(name = "SRAP_CNT")
    private Integer srapCnt;

    @Column(name = "CKG_MTH_ACTO_NM", length = 200)
    private String ckgMthActoNm;

    @Column(name = "CKG_STA_ACTO_NM", length = 200)
    private String ckgStaActoNm;

    @Column(name = "CKG_MTRL_ACTO_NM", length = 200)
    private String ckgMtrlActoNm;

    @Column(name = "CKG_KND_ACTO_NM", length = 200)
    private String ckgKndActoNm;

    @Column(name = "CKG_IPDC", length = 4000)
    private String ckgIpdc;

    @Column(name = "CKG_MTRL_CN", length = 4000)
    private String ckgMtrlCn;

    @Column(name = "CKG_INBUN_NM", length = 200)
    private String ckgInbunNm;

    @Column(name = "CKG_DODF_NM", length = 200)
    private String ckgDodfNm;

    @Column(name = "CKG_TIME_NM", length = 200)
    private String ckgTimeNm;

    @Column(name = "FIRST_REG_DT", length = 14)
    private String firstRegDt;

    @Column(name = "RCP_IMG_URL", length = 4000)
    private String rcpImgUrl;
}

