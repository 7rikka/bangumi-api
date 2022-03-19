package nya.nekoneko.bangumi.api.calender;

import nya.nekoneko.bangumi.config.UrlConfig;
import nya.nekoneko.bangumi.model.BangumiCalenderItem;
import nya.nekoneko.bangumi.util.BangumiRequestFactor;
import nya.nekoneko.bangumi.util.Call;
import okhttp3.Request;
import org.noear.snack.ONode;

import java.util.LinkedList;
import java.util.List;

public class CalenderApi implements ICalender{
    @Override
    public List<BangumiCalenderItem> getCalender() {
        Request request = BangumiRequestFactor.getRequest()
                .url(UrlConfig.CALENDAR_URL)
                .get()
                .buildRequest();
        String s = Call.doCall(request);
        return ONode.deserialize(s, new LinkedList<BangumiCalenderItem>() {
        }.getClass());
    }
}
