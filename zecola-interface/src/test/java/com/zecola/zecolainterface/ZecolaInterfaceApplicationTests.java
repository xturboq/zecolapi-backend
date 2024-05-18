package com.zecola.zecolainterface;

import com.zecola.zecolapiclientsdk.client.ZecolApiClient;
import com.zecola.zecolapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ZecolaInterfaceApplicationTests {

    @Resource
    private ZecolApiClient zecolApiClient;
    @Test
    void contextLoads() {
        // 调用yuApiClient的getNameByGet方法，并传入参数"zecola"，将返回的结果赋值给result变量
        String result = zecolApiClient.getNameByGet("zecola");
        // 创建一个User对象
        User user = new User();
        // 设置User对象的username属性为"liyupi"
        user.setUsername("liyupi");
        // 调用yuApiClient的getUserNameByPost方法，并传入user对象作为参数，将返回的结果赋值给usernameByPost变量
        String usernameByPost = zecolApiClient.getUserNameByPost(user);
        // 打印result变量的值
        System.out.println(result);
        // 打印usernameByPost变量的值
        System.out.println(usernameByPost);
    }

}
