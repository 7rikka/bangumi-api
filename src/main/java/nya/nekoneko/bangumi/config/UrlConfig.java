package nya.nekoneko.bangumi.config;

/**
 * 接口地址
 */
public class UrlConfig {
    public static final String CALENDAR_URL                     = "https://api.bgm.tv/calendar";
    public static final String GET_SUBJECT                      = "https://api.bgm.tv/v0/subjects/%s";

    //角色
    public static final String GET_CHARACTER_DETAIL             = "https://api.bgm.tv/v0/characters/%s";
    public static final String GET_CHARACTER_RELATED_SUBJECTS   = "https://api.bgm.tv/v0/characters/%s/subjects";
    public static final String GET_CHARACTER_RELATED_PERSONS    = "https://api.bgm.tv/v0/characters/%s/persons";

    //人物
    public static final String GET_PERSON_DETAIL                = "https://api.bgm.tv/v0/persons/%s";
    public static final String GET_PERSON_RELATED_SUBJECTS      = "https://api.bgm.tv/v0/persons/%s/subjects";
    public static final String GET_PERSON_RELATED_CHARACTERS    = "https://api.bgm.tv/v0/persons/%s/characters";


}
