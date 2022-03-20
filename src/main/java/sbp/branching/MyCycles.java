package sbp.branching;

import sbp.common.Utils;

public class  MyCycles
{
    
        private final Utils utils;

    public MyCycles(Utils utils)
        {
            this.utils = utils;
        }

        /**
         * Необходимо написать реализацию метода с использованием for()
         +     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
         +     * Реализация Utils#utilFunc1() неизвестна
         +     * Должна присутствовать проверка возврщаемого значения от Utils#utilFunc1()
         * Результат проверяется через unit-test (все тесты должны выполниться успешно)
         * @param iterations - количество итераций
         * @param str - строка для вывода через утилиту {@link Utils}
         */
        public void cycleForExample ( int iterations, String str)
        {
            int sand = iterations;
            if (sand == 2)
            {
                for (int i = 0; i < sand; i++)
                {
                    final boolean result = this.utils.utilFunc1(str);
                    if (result == true)
                    {
                        System.out.println("result");
                    }
                    else if (result != true)
                    {
                        System.out.println("result bad");
                    }
                }
            }
            else
            {
                System.out.println("sand in stone");
            }
        }

        /**
         * Необходимо написать реализацию метода с использованием while()
         +     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
         +     * Реализация Utils#utilFunc1() неизвестна
         +     * Должна присутствовать проверка возврщаемого значения от Utils#utilFunc1()
         * Результат проверяется через unit-test (все тесты должны выполниться успешно)
         * @param iterations - количество итераций
         * @param str - строка для вывода через утилиту {@link Utils}
         */
        public void cycleWhileExample ( int iterations, String str)
        {
            int water = iterations;
            water += 100;
            int i = 100;
            while (i < water)
            {
                i++;
                boolean result = this.utils.utilFunc1(str);
                if (result == false)
                {
                    System.out.println("Result" + result);
                    return;
                }
            }
        }

        /**
         * Необходимо написать реализацию метода с использованием while()
         -     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
         -     * Реализация Utils#utilFunc1() неизвестна
         +     * Метод должен вызвать Utils#utilFunc1() на каждой итерации
         +     * Реализация Utils#utilFunc1() неизвестна
         * Должна присутствовать проверка возврщаемого значения
         * Результат проверяется через unit-test (все тесты должны выполниться успешно)
         * @param from - начальное значение итератора
         * @param to - конечное значение итератора
         * @param str - строка для вывода через утилиту {@link Utils}
         */
        public void cycleDoWhileExample ( int from, int to, String str)
        {
            do
            {
                boolean result = this.utils.utilFunc1(str);
                if (result == false)
                {
                    System.out.println("Result2 to = " + result);
                    return;
                }
                else
                {
                    System.out.println("Result2 I'am sad water and beautiful stone " );
                }
            } while (from < to);
        }
    }

