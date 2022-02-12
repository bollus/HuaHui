package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: UserFamily @Author:
 * Strawberry @Description: @Date: 2022/02/01 12:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FlowerFamily extends SourceEntity {
  private Long id;
  private Integer code;
  private String name;
  private String introduction;
  private Date createdTime;
  private Date updatedTime;
}
