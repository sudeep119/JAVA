package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        
        Supplier<String> supplier=()->{return "Sudeep";};
        StreamApi api=new StreamApi();
        Consumer<Integer>consumer=System.out::println;
        consumer.accept(5);
        
        Function<Integer,String> func=(x)->"Your numebr is "+x;
        System.out.println(func.apply(10));

        BiFunction<Integer,Integer,String> bifunc=(a,b)->"The sum is "+a+b;
        bifunc.apply(10, 8);

        Predicate<Integer>predicate=(x)->x%2==0;
        System.out.println(predicate.test(18));

        List<Integer>list=Stream.iterate(0, x->x+1).limit(20).map(x->x+1).filter(x->x%2==0).peek(x->System.out.println(x)).collect(Collectors.toList());

        // System.out.println(list);

        List<Integer>list2=new ArrayList<>();
        list2=Arrays.asList(1,3,5,7,9);

        list.stream().map(x->x*x).distinct().reduce(0,Integer::sum);

        Optional<String>optional=Optional.ofNullable("Sudeep");

        // if(optional.isPresent()){
        //     System.out.println(optional.get());
        // }
       String name=optional.orElse("Null value found");
       System.out.println(name);


    }
}
