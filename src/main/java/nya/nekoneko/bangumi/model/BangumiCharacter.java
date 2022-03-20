package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

import java.util.List;

/**
 * 角色
 */
@Data
public class BangumiCharacter {
    /**
     * 角色id
     */
    @ONodeAttr(name = "id")
    private Integer id;
    /**
     * 角色名称
     */
    @ONodeAttr(name = "name")
    private String name;
    /**
     * [ 1, 2, 3, 4 ]
     * 角色，机体，舰船，组织...
     */
    @ONodeAttr(name = "type")
    private Integer type;
    /**
     * 生日 - 年
     */
    @ONodeAttr(name = "birth_year")
    private Integer birthYear;
    /**
     * 生日 - 月
     */
    @ONodeAttr(name = "birth_mon")
    private Integer birthMonth;
    /**
     * 生日 - 日
     */
    @ONodeAttr(name = "birth_day")
    private Integer birthDay;
    /**
     * 性别
     */
    @ONodeAttr(name = "gender")
    private String gender;
    /**
     * 血型
     */
    @ONodeAttr(name = "blood_type")
    private String bloodType;
    /**
     *
     */
    @ONodeAttr(name = "images")
    private BangumiImage images;
    /**
     *
     */
    @ONodeAttr(name = "summary")
    private String summary;
    /**
     *
     */
    @ONodeAttr(name = "infobox")
    private List<BangumiInfo> infobox;
    /**
     *
     */
    @ONodeAttr(name = "stat")
    private BangumiStat stat;
    /**
     * 锁定
     */
    @ONodeAttr(name = "locked")
    private boolean locked;
    /**
     * nsfw
     */
    @ONodeAttr(name = "nsfw")
    private Boolean nsfw;
}
