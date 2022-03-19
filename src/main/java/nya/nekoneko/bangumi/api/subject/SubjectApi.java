package nya.nekoneko.bangumi.api.subject;

import nya.nekoneko.bangumi.config.UrlConfig;
import nya.nekoneko.bangumi.model.BangumiItem;
import nya.nekoneko.bangumi.util.BangumiRequestFactor;
import nya.nekoneko.bangumi.util.Call;
import okhttp3.Request;
import org.noear.snack.ONode;

public class SubjectApi implements ISubject {
    /**
     * 获取指定条目信息
     *
     * @param id
     * @return
     */
    @Override
    public BangumiItem getSubject(int id) {
        Request request = BangumiRequestFactor.getRequest()
                .url(UrlConfig.GET_SUBJECT + id)
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        BangumiItem item = ONode.deserialize(result, BangumiItem.class);
        //补充id
        item.getRating().setId(id);
        item.getImages().setId(id);
        item.getCollection().setId(id);
        item.getInfobox().forEach(i -> i.setId(id));
        return item;
    }
}
