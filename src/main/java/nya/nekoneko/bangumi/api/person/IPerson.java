package nya.nekoneko.bangumi.api.person;

import nya.nekoneko.bangumi.model.*;

import java.util.List;

/**
 * 人物相关
 */
public interface IPerson {
    /**
     * 获取一名人物的详细信息
     *
     * @param personId 角色id
     */
    BangumiPerson getPersonDetail(int personId);

    /**
     * 获取人物相关条目
     *
     * @param personId 人物id
     * @return
     */
    List<BangumiRelatedSubject> getPersonRelatedSubjects(int personId);

    /**
     * 获取人物相关角色信息
     *
     * @param personId 人物id
     * @return
     */
    List<BangumiRelatedCharacter> getPersonRelatedCharacters(int personId);

}
