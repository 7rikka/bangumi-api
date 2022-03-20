package nya.nekoneko.bangumi.api.character;

import nya.nekoneko.bangumi.config.UrlConfig;
import nya.nekoneko.bangumi.model.BangumiCharacter;
import nya.nekoneko.bangumi.model.BangumiRelatedPerson;
import nya.nekoneko.bangumi.model.BangumiRelatedSubject;
import nya.nekoneko.bangumi.util.BangumiRequestFactor;
import nya.nekoneko.bangumi.util.Call;
import okhttp3.Request;
import org.noear.snack.ONode;

import java.util.LinkedList;
import java.util.List;

public class CharacterApi implements ICharacter {
    /**
     * 获取一名角色的详细信息
     *
     * @param characterId 角色id
     */
    @Override
    public BangumiCharacter getCharacterDetail(int characterId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_CHARACTER_DETAIL, characterId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, BangumiCharacter.class);
    }

    @Override
    public List<BangumiRelatedSubject> getCharacterRelatedSubjects(int characterId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_CHARACTER_RELATED_SUBJECTS, characterId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, new LinkedList<BangumiRelatedSubject>() {
        }.getClass());
    }

    @Override
    public List<BangumiRelatedPerson> getCharacterRelatedPersons(int characterId) {
        Request request = BangumiRequestFactor.getRequest()
                .url(String.format(UrlConfig.GET_CHARACTER_RELATED_PERSONS, characterId))
                .get()
                .buildRequest();
        String result = Call.doCall(request);
        return ONode.deserialize(result, new LinkedList<BangumiRelatedPerson>() {
        }.getClass());

    }
}
