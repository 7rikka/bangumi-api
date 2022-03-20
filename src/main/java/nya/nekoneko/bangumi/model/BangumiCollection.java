package nya.nekoneko.bangumi.model;

import lombok.Data;

@Data
public class BangumiCollection {
    /**
     * 搁置
     */
    private Integer on_hold;
    /**
     * 抛弃
     */
    private Integer dropped;
    /**
     * 想看
     */
    private Integer wish;
    /**
     * 看过
     */
    private Integer collect;
    /**
     * 在看
     */
    private Integer doing;
}
