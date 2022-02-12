package jsz.dk.huahui.entity;

import jsz.dk.huahui.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: huahui @Package: jsz.dk.huahui.entity @ClassName: UserDepartmentBind @Author:
 * Strawberry @Description: 用户与部门绑定关系实体 @Date: 2022/02/12 19:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDepartmentBind extends SourceEntity {
  private Long userId;
  private Long departmentId;
}
