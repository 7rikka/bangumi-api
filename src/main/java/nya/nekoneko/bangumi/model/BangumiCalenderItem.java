package nya.nekoneko.bangumi.model;

import lombok.Data;

import java.util.List;

@Data
public class BangumiCalenderItem {
    private BangumiWeekday weekday;
    private List<BangumiItem> items;
}