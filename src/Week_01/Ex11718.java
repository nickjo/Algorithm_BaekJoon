package Week_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by nick on 17. 3. 19.
 */
public class Ex11718 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int idx = 0;

        while(idx < 5){
            list.add(sc.nextLine());
            idx++;
        }

        Stream<String> strStream1 = list.stream();//Arrays.stream(list);
        strStream1.sorted().forEach(System.out::println);
    }
}
