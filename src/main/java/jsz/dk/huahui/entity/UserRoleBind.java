package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: UserRoleBind @Author:
 * Strawberry @Description: @Date: 2022/02/01 11:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleBind extends SourceEntity {
  private Long id;
  private Long userId;
  private Long roleId;
  private Date createdTime;
  private Date updatedTime;
}
