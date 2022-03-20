package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

@Data
public class BangumiRelatedCharacter {
    /**
     *
     */
    @ONodeAttr(name = "id")
    private Integer id;
    /**
     *
     */
    @ONodeAttr(name = "subject_id")
    private Integer subjectId;
    /**
     *
     */
    @ONodeAttr(name = "id")
    private Integer type;
    /**
     *
     */
    @ONodeAttr(name = "name")
    private String name;
    /**
     *
     */
    @ONodeAttr(name = "images")
    private BangumiImage images;
    /**
     *
     */
    @ONodeAttr(name = "subject_name")
    private String subjectName;
    /**
     *
     */
    @ONodeAttr(name = "subject_name_cn")
    private String subjectNameCn;

}
