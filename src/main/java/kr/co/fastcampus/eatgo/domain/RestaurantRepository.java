package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findAll();
    // null이 접근했을때 문제를 해결, <T> T가 있는지 없는지 확인
    Optional<Restaurant> findById(Long id);
    Restaurant save(Restaurant restaurant);
}
