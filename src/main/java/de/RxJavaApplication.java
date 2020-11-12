package de;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rx.Observable;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class RxJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RxJavaApplication.class);

//        Observable.range(10, 5)
//                .map(x -> x * x)
//                .filter(x -> x > 120)
//                .skip(2)
//                .subscribe(System.out::println);
        IntStream.range(10, 20)
                .map(x -> x * x)
                .filter(x -> x > 101)
                .filter(x -> x > 101)
                .skip(5)
                .forEach(System.out::println);
    }
}
