package jsz.dk.huihua.entity;

import jsz.dk.huihua.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @ProjectName: huahui
 * @Package: jsz.dk.huahui.entity
 * @ClassName: User
 * @Author: Strawberry
 * @Description:
 * @Date: 2021/07/02 21:26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends SourceEntity {
    private String username;
    private String password;
    private String googleSecret;
}
