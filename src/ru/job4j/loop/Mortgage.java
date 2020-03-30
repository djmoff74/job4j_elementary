package ru.job4j.loop;

import com.sun.source.tree.BreakTree;

/**
 * Class Mortgage
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 3/29/2020
 */
public class Mortgage {
/**
* Method returns the number of years required to repay the mortgage.
* @param amount
* @param salary
* @param percent
* @return year
*/
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (int) ((amount + amount * (percent / 100)) - salary);
            year++;
        }
        return year;
    }

}
