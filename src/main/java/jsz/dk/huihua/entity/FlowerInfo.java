package jsz.dk.huihua.entity;

import jsz.dk.huihua.common.entity.SourceEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @ProjectName: huahui
 * @Package: jsz.dk.huahui.entity
 * @ClassName: FlowerInfo
 * @Author: Strawberry
 * @Description: 花卉信息
 * @Date: 2022/02/12 19:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FlowerInfo extends SourceEntity {
    private Long itemId;
    private String content;
    private Long creatorId;
    private Date updatedLast;
}
