package njgis.opengms.portal.entity;

import lombok.Data;
import njgis.opengms.portal.entity.support.AuthorInfo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class ConceptualModelVersion extends Version {
    @Id
    String id;
    String oid;
    String name;

    String relateModelItem;
    String description;
    String cXml;
    String svg;
    String detail;
    String creator;
    int readStatus;

    Boolean isAuthor;
    AuthorInfo realAuthor;
    String contentType;

    List<String> classifications;
    List<String> keywords;
    List<String> image;
    List<AuthorInfo> authorship;

    Date modifyTime;
    Date acceptTime;
    Date rejectTime;

    //版本相关
    String modifier;
    String originOid;//正式数据库对应条目的oid
    Long verNumber;//版本号
    int verStatus;//版本状态

}
