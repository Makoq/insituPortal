package njgis.opengms.portal.dto.Template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TemplateUpdateDTO
 * @Description todo
 * @Author ZHSH
 * @Date 2019/8/1
 * @Version 1.0.0
 * TODO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateUpdateDTO extends TemplateAddDTO{
    String oid;
}
