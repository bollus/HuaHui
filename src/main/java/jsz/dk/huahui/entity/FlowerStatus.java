package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: FlowerStatus @Author:
 * Strawberry @Description: 花卉商品状态实体 @Date: 2022/02/12 19:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FlowerStatus extends SourceEntity {
  private String name;
  private String code;
  private String description;
}
