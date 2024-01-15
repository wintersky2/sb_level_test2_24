package com.board.basic.article;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ArticleRepository extends JpaRepository<Article, Integer> {
    @Query("select "
            + "distinct A "
            + "from Article A "
            + "left outer join SiteUser U on A.author=U "
            + "where "
            + "   A.title like %:kw% "
            + "   or A.content like %:kw% "
            + "   or U.username like %:kw% ")
    List<Article> findAllByKeyword(@Param("kw") String kw);
}
