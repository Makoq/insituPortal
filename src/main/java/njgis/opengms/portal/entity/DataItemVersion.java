package njgis.opengms.portal.entity;

import lombok.Data;
import njgis.opengms.portal.entity.support.AuthorInfo;
import njgis.opengms.portal.entity.support.Reference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * @Auther mingyuan
 * @Data 2020.06.21 12:31
 */
@Document
@Data
public class DataItemVersion {
    @Id
    String id;
    String originOid;//正式数据库对应条目的oid
    String oid;
    String name;//
    String image;//
    String description;//
    String detail;//
    String modifier;
    String creator;
    int readStatus;

    Long verNumber;//版本号
    int status;//版本状态

    List<String> classifications;//
    List<String> keywords;//
    List<Reference> references;//
    List<AuthorInfo> authorship;//

    Date modifyTime;
    Date acceptTime;
    Date rejectTime;
}
