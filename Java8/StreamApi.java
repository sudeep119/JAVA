package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        
        Supplier<String> supplier=()->{return "Sudeep";};
        StreamApi api=new StreamApi();
        Consumer<Integer>consumer=System.out::println;
        consumer.accept(5);
        
        
    }
}
