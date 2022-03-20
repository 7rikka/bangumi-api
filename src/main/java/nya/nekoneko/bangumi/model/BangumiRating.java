package nya.nekoneko.bangumi.model;

import lombok.Data;

import java.util.Map;

@Data
public class BangumiRating {
    private Integer total;
    private Double score;
    private Integer rank;
    private Map<Integer,Integer> count;
}
