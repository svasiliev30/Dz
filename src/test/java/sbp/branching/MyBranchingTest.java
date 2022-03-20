package sbp.branching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sbp.common.Utils;

import javax.rmi.CORBA.Util;

import static org.mockito.ArgumentMatchers.*;


public class MyBranchingTest {

    /** Проверка результатов выполнения метода в зависимости от возможных реализаций {@link Utils}
     * Тут идет проверка на выполнения метода в зависимости от false и true
     * а также проверяется условие если большее из значений или 0, то вернет вернёт true;
     */
    @Test
    public void max_Int_Test() {
        final int i1 = 2;
        final int i2 = 5;

        Utils utilsForTestOne = Mockito.mock(Utils.class);
        Mockito.when(utilsForTestOne.utilFunc2()).thenReturn(true);
        MyBranching myBranching = new MyBranching(utilsForTestOne);

       int result = myBranching.maxInt(i1,i2);
        Assertions.assertEquals(0 ,result);

        Mockito.when(utilsForTestOne.utilFunc2()).thenReturn(false);

       int resultTrue = myBranching.maxInt(i1,i2);
       int maxI1OrI2 = Math.max(i1,i2);
        Assertions.assertEquals(maxI1OrI2,resultTrue);
    }

    /**
     * Тест содержит mock на объект {@link Utils} (реализация неизвестна)
     * Идет проверка результата выполнения метода в зависимости от возможных реализаций {@link Utils}
     * тут идет проверка на выполнения метода, если utilFunc2() = false.
     */
    @Test
    public void if_Else_Example_Success_Test()
    {
        Utils utilsForTest = Mockito.mock(Utils.class);
        Mockito.when(utilsForTest.utilFunc2()).thenReturn(false);
        MyBranching MyBranching = new MyBranching(utilsForTest);

        boolean  result = MyBranching.ifElseExample();
    }

    /**
     * Тест содержит mock на объект {@link Utils} (реализация неизвестна)
     * Идет проверка результата выполнения метода в зависимости от возможных реализаций {@link Utils}
     * тут идет проверка на выполнения метода если utilFunc2() = true.
     */
    @Test
    public void if_Else_Example_Fail_Test()
    {
        Utils utilsForTest = Mockito.mock(Utils.class);
            Mockito.when(utilsForTest.utilFunc2()).thenReturn(true);
        MyBranching MyBranching = new MyBranching(utilsForTest);

        boolean  result = MyBranching.ifElseExample();
        Assertions.assertTrue(result);
    }

    /**
     * Идет проверка выполнения Utils#utilFunc1 и Utils#utilFunc2, если данные  utilFunc2() = false, i = 0.
     * вызываются ли они нужное количество раз.
     */
    @Test
    public void switch_Example_Zero_1() {
        final int i = 0;

        Utils utilsThreeTest = Mockito.mock(Utils.class);
        Mockito.when(utilsThreeTest.utilFunc2()).thenReturn(false);

        MyBranching myBranching = new MyBranching(utilsThreeTest);
        myBranching.switchExample(i);

        Mockito.verify(utilsThreeTest, Mockito.times(0)).utilFunc1(anyString());
        Mockito.verify(utilsThreeTest, Mockito.times(1)).utilFunc2();
    }

    /**
     * Идет проверка выполнения Utils#utilFunc1 и Utils#utilFunc2. если данные utilFunc2() = true, i = 0.
     * вызываются ли они нужное количество раз.
     */
    @Test
    public void switch_Example_Zero_2() {
        final int i = 0;

        Utils utilsThreeTest = Mockito.mock(Utils.class);
        Mockito.when(utilsThreeTest.utilFunc2()).thenReturn(true);

        MyBranching myBranching = new MyBranching(utilsThreeTest);
        myBranching.switchExample(i);

        Mockito.verify(utilsThreeTest, Mockito.times(1)).utilFunc1(anyString());
        Mockito.verify(utilsThreeTest, Mockito.times(1)).utilFunc2();
    }

    /**
     * Идет проверка выполнения Utils#utilFunc1 и Utils#utilFunc2, если i = 1.
     * вызываются ли они нужное количество раз.
     */
    @Test
    public void switch_Example_One() {
        final int i = 1;

        Utils utilsThreeTest = Mockito.mock(Utils.class);

        MyBranching myBranching = new MyBranching(utilsThreeTest);
        myBranching.switchExample(i);

        Mockito.verify( utilsThreeTest, Mockito.times(1)).utilFunc1(anyString());
        Mockito.verify(utilsThreeTest, Mockito.times(1)).utilFunc2();
    }

    /**
     * Идет проверка выполнения Utils#utilFunc1 и Utils#utilFunc2, если i = 2.
     * вызываются ли они нужное количество раз.
     */
    @Test
    public void switch_Example_Two() {
        final int i = 2;

        Utils utilsThreeTest = Mockito.mock(Utils.class);

        MyBranching myBranching = new MyBranching(utilsThreeTest);
        myBranching.switchExample(i);

        Mockito.verify(utilsThreeTest, Mockito.times(0)).utilFunc1(anyString());
        Mockito.verify(utilsThreeTest, Mockito.times(1)).utilFunc2();
    }





}
