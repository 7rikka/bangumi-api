package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

@Data
public class BangumiRelatedPerson {
    /**
     *
     */
    @ONodeAttr(name = "id")
    private int id;
    /**
     *
     */
    @ONodeAttr(name = "subject_id")
    private int subjectId;
    /**
     *
     */
    @ONodeAttr(name = "type")
    private int type;
    /**
     *
     */
    @ONodeAttr(name = "Name")
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