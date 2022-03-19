package nya.nekoneko.bangumi.model;

import lombok.Data;

@Data
public class BangumiImage {
    /**
     * 所属subjectId
     */
    private Integer id;
    private String large;
    private String common;
    private String medium;
    private String small;
    private String grid;
}
