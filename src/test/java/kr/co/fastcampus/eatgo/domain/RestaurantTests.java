package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = Restaurant.builder()
        .id(1004L)
        .name("Bob Zip")
        .address("Seoul")
        .build();
        assertThat(restaurant.getName(), is("Bob Zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
        assertThat(restaurant.getId(), is(1004L));
    }

    @Test
    public void information(){
        Restaurant restaurant = Restaurant.builder()
                .id(1004L)
                .name("Bob Zip")
                .address("Seoul")
                .build();
        restaurant.setName("Sool zip");
        assertThat(restaurant.getInformation(), is("Sool zip in Seoul"));
    }

    // assertThat(메소드, is(value)) : 메소드의 실행결과 와 value의 값을 예상하여 같으면 pass, 틀리면 fail
}