package jp.co.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.entitiy.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Long> {

}
