package nya.nekoneko.bangumi.model;

import lombok.Data;
import org.noear.snack.annotation.ONodeAttr;

import java.util.Date;
import java.util.List;

@Data
public class BangumiPerson {
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
    @ONodeAttr(name = "type")
    private Integer type;
    /**
     *
     */
    @ONodeAttr(name = "last_modified")
    private String lastModified;
    /**
     *
     */
    @ONodeAttr(name = "blood_type")
    private String bloodType;
    /**
     *
     */
    @ONodeAttr(name = "birth_year")
    private int birthYear;
    /**
     *
     */
    @ONodeAttr(name = "birth_mon")
    private int birthMonth;

    /**
     *
     */
    @ONodeAttr(name = "birth_day")
    private int birthDay;
    /**
     *
     */
    @ONodeAttr(name = "gender")
    private String gender;
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
    @ONodeAttr(name = "img")
    private String img;
    /**
     *
     */
    @ONodeAttr(name = "infobox")
    private List<BangumiInfo> infobox;
    /**
     *
     */
    @ONodeAttr(name = "career")
    private List<String> career;
    /**
     *
     */
    @ONodeAttr(name = "stat")
    private BangumiStat stat;
    /**
     *
     */
    @ONodeAttr(name = "locked")
    private Boolean locked;

}