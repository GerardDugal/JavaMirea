package ru.mirea.lab32;

import org.junit.jupiter.api.*;
import ru.mirea.lab30.Customer;
import ru.mirea.lab30.Dish;
import ru.mirea.lab30.DrinkTypeEnum;
import ru.mirea.lab30.MenuItem;
import ru.mirea.lab30.Order;
import ru.mirea.lab30.TableOrder;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class AppTest {
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }

    @Tag("BACK")
    @Test
    void testDrinkTypeOne()
    {
        System.out.println("======TEST DrinkType 1 EXECUTED=======");
        for (int i = 0; i < 20; ++i)
        {
            Assertions.assertEquals( ru.mirea.lab30.DrinkTypeEnum.get(i) , ru.mirea.lab30.DrinkTypeEnum.get(i));
        }
    }

    @Tag("BACK")
    @Test
    void testDrinkTypeTwo()
    {
        System.out.println("======TEST DrinkType 2 EXECUTED=======");
        Assertions.assertEquals( null , DrinkTypeEnum.get(-1));
    }

    @Tag("BACK")
    @Test
    void testOrderOne()
    {
        System.out.println("======TEST Order 1 EXECUTED=======");
        MenuItem menuItem = new Dish(200, "Борщ", "Борщ с говядиной");
        ru.mirea.lab30.Customer customer = new Customer(19);
        Order order = new TableOrder(customer);
        Assertions.assertEquals( true , order.add(menuItem));
    }

    @Tag("FILE")
    @Test
    void testFILERead() throws FileNotFoundException
    {
        System.out.println("======TEST File Read 1 EXECUTED=======");
        File file = new File("D:\\Для всего\\МИРЭА\\Программирование на языке джава\\JAVA\\IdeaProjects\\untitled\\src\\ru\\mirea\\lab32\\InternetOrders.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        scanner.close();
    }

    @Tag("SCANNER")
    @Test
    void testSCANNERRead()
    {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println(a);
    }

    @Tag("STRING")
    @Test
    void testSTRINGRead() throws FileNotFoundException
    {
        System.out.println("======TEST STRING 1 EXECUTED=======");
        String a = "'абвгд'";
        System.out.println(a);
        System.out.println(a.length());
        a = a.replace("'", "");
        System.out.println(a);
        System.out.println(a.length());
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
