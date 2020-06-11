package com.chanju.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
/*
 * DB 레이어 접근자, JPA에서는 Repository라고 부르며, 인터페이스로 생성한다.
 * 다눈히 인터페이스 생성 후 , JpaRepository<Entity클래스, PK타입>을 상속하면 기본적인 CRUD 메소드 자동 생성.
 * @Repository를 추가할 필요 없음
 *  */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
