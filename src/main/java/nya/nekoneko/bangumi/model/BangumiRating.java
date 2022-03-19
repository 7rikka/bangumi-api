package nya.nekoneko.bangumi.model;

import lombok.Data;

import java.util.Map;

@Data
public class BangumiRating {
    /**
     * 所属subjectId
     */
    private Integer id;
    private Integer total;
    private Double score;
    private Integer rank;
    private Map<Integer,Integer> count;
}
