package nya.nekoneko.bangumi.api.character;

import nya.nekoneko.bangumi.model.BangumiCharacter;
import nya.nekoneko.bangumi.model.BangumiRelatedPerson;
import nya.nekoneko.bangumi.model.BangumiRelatedSubject;

import java.util.List;

/**
 * 角色相关
 */
public interface ICharacter {
    /**
     * 获取一名角色的详细信息
     *
     * @param characterId 角色id
     */
    BangumiCharacter getCharacterDetail(int characterId);

    /**
     * 获取角色相关条目
     *
     * @param characterId 角色id
     * @return
     */
    List<BangumiRelatedSubject> getCharacterRelatedSubjects(int characterId);

    /**
     * 获取角色相关人物信息
     *
     * @param characterId 角色id
     * @return
     */
    List<BangumiRelatedPerson> getCharacterRelatedPersons(int characterId);
}
