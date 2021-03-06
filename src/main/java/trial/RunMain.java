package trial;

import practiceQuestions.question2.Cat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static practiceQuestions.question1.summationQuestion.summationArithmeticSequenceFunction;

public class RunMain {
    public static void main(String[] args) {
        System.out.println(((1000-2)/3)+1);
        System.out.println(summationArithmeticSequenceFunction(2,3,1000));
        Cat catOne = new Cat();
        System.out.println(catOne.walk());
        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println(integerList.get(integerList.size()-1));

        //casting
        long long1 = 300;
        byte byte1 = (byte) long1;

        //"Copy" list
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>(list);

        //runing a function at the background
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new Runnable() {
            public void run() {
//                sendSymbol();
            }
        });
    }
}
