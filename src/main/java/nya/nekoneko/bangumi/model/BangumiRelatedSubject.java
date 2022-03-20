package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

/**
 * 角色相关条目信息
 */
@Data
public class BangumiRelatedSubject {
    /**
     *
     */
    @ONodeAttr(name = "id")
    private Integer id;
    /**
     *
     */
    @ONodeAttr(name = "name")
    private String name;
    /**
     *
     */
    @ONodeAttr(name = "name_cn")
    private String nameCn;
    /**
     *
     */
    @ONodeAttr(name = "image")
    private String image;
    /**
     *
     */
    @ONodeAttr(name = "staff")
    private String staff;

}
