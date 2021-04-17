package trial;

import practiceQuestions.question2.Cat;

import java.util.Arrays;
import java.util.List;

import static practiceQuestions.question1.summationQuestion.summationArithmeticSequenceFunction;

public class RunMain {
    public static void main(String[] args) {
        System.out.println(((1000-2)/3)+1);
        System.out.println(summationArithmeticSequenceFunction(2,3,1000));
        Cat catOne = new Cat();
        System.out.println(catOne.walk());
        List<Integer> integerList = Arrays.asList(1,2,3);
        System.out.println(integerList.get(integerList.size()-1));
    }
}
