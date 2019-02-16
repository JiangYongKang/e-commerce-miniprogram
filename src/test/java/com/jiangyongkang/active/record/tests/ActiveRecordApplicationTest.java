package com.jiangyongkang.active.record.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import com.jiangyongkang.active.record.tests.application.ActiveRecordApplication;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * author: vincent
 * date: 2019-02-13 15:55
 * comment:
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ActiveRecordApplication.class)
public class ActiveRecordApplicationTests {

    @Resource
    private DataSource dataSource;

    @Resource
    private JdbcTemplate template;

    @Test
    public void contextLoad() {
        Assert.assertNotNull(dataSource);
        Assert.assertNotNull(template);
    }

}