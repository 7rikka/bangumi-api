package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class BangumiItem {
    private Integer id;
    private String url;
    private Integer type;
    private String name;
    private String name_cn;
    private String summary;
    @ONodeAttr(format = "yyyy-MM-dd")
    private LocalDate date;
    private Integer air_weekday;
    private String platform;
    private Integer total_episodes;
    private BangumiRating rating;
    private BangumiImage images;
    private BangumiCollection collection;
    private List<BangumiInfo> infobox;

}