package nya.nekoneko.bangumi.api.person;

import nya.nekoneko.bangumi.config.UrlConfig;
import nya.nekoneko.bangumi.model.BangumiPerson;
import nya.nekoneko.bangumi.model.BangumiRelatedCharacter;
import nya.nekoneko.bangumi.model.BangumiRelatedSubject;
import nya.nekoneko.bangumi.util.BangumiRequestFactor;
import nya.nekoneko.bangumi.util.Call;
import okhttp3.Request;
import org.noear.snack.ONode;

import java.util.LinkedList;
import java.util.List;

public class PersonApi implements IPerson {
    /**
     * 获取一名人物的详细信息
     *
     * @param personId 角色id
     */
    @Override
    public BangumiPerson getPersonDetail(int personId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_PERSON_DETAIL, personId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, BangumiPerson.class);
    }

    /**
     * 获取人物相关条目
     *
     * @param personId 人物id
     * @return
     */
    @Override
    public List<BangumiRelatedSubject> getPersonRelatedSubjects(int personId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_PERSON_RELATED_SUBJECTS, personId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, new LinkedList<BangumiRelatedSubject>() {
        }.getClass());
    }

    /**
     * 获取人物相关角色信息
     *
     * @param personId 人物id
     * @return
     */
    @Override
    public List<BangumiRelatedCharacter> getPersonRelatedCharacters(int personId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_PERSON_RELATED_CHARACTERS, personId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, new LinkedList<BangumiRelatedCharacter>() {
        }.getClass());
    }
}
