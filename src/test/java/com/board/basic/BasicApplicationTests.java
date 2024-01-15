package com.board.basic;

import com.board.basic.article.Article;
import com.board.basic.article.ArticleService;
import com.board.basic.user.SiteUser;
import com.board.basic.user.UserService;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicApplicationTests {

    @Autowired
    ArticleService articleService;

    @Test
    void contextLoads() {
        for (int i = 1; i < 50; i++) {
			this.articleService.create("제목 " + i,"내용 " + i,null);
        }
    }

}
