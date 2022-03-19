package nya.nekoneko.bangumi.api.subject;

import nya.nekoneko.bangumi.model.BangumiItem;

public interface ISubject {
    /**
     * 获取指定条目信息
     *
     * @param id
     * @return
     */
    BangumiItem getSubject(int id);
}
