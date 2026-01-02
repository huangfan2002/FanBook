package com.fan.fanbook.auth;

import com.fan.framework.common.util.JsonUtils;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class FanBookAuthApplicationTests {

    @Resource
    private UserDOMapper userDOMapper;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder()
                .username("雪1豹")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        userDOMapper.insert(userDO);
    }

    @Test
    void testSelect() {
        UserDO userDO = userDOMapper.selectByPrimaryKey(3L);

        log.info("用户信息：{}", JsonUtils.toJsonString(userDO));
    }

    @Test
    void testUpdate() {
        UserDO userDO = UserDO.builder()
                .id(2L)
                .username("爱我工小美")
                .updateTime(LocalDateTime.now())
                .createTime(LocalDateTime.now())
                .build();

        // 根据主键 ID 更新记录
        userDOMapper.updateByPrimaryKey(userDO);
    }

    @Test
    void testDelete() {
        // 删除主键 ID 为 4 的记录
        userDOMapper.deleteByPrimaryKey(1L);
    }

}
