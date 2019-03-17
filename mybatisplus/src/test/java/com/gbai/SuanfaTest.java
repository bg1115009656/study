package com.gbai;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-02-22 20:35
 **/
public class SuanfaTest {


    @Test
    public void test () throws InterruptedException {
//        int[] array = {5,4,6,7,3,8,9,1};
////        sortMethod(array);
////        quickSortAdapter(array);
//        int[] ints = twoSum(array, 10);
//        System.out.println(Arrays.toString(ints));

        String str = "asidhfsiahfii";
        ExecutorService executorService = Executors.newCachedThreadPool();
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.await();
        System.out.println(strLength(str));
    }
    //冒泡排序
    void sortMethod(int[] array) {

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


    void quickSortAdapter(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    //快速排序
    void quickSort(int[] array, int low, int high) {

        if (low > high) return;

        int key = array[low];

        int i = low;
        int j = high;
        int temp;
        while (i < j) {

            //从右往左找第一个小于基准的数
            while (i < j && array[j] > key) {
                j--;
            }
            //从左往右找第一个大于基准的数
            while (i < j && array[i] <= key) {
                i++;
            }

            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        temp = array[i];
        array[i] = array[low];
        array[low] = temp;

        quickSort(array,low,i-1);
        quickSort(array,i+1,high);

    }
    //两数之和
    int[] twoSum (int[] array, int target){

        Map<Integer,Integer> map = new HashMap<>();

        int another;

        for (int i = 0; i < array.length; i++) {
            another = target - array[i];
            if (map.containsKey(another)) {
                return new int[]{i,map.get(another)};
            }
            map.put(array[i],i);
        }
        return null;
    }
    //两数相加
    ListNode addTwoNumbers(ListNode n, ListNode m) {

        int carry = 0;
        ListNode mark = new ListNode(0);
        ListNode current = mark;
        ListNode p = n,q = m;

        while(q != null || p != null){
            int x = q != null ? q.val : 0;
            int y = p != null ? p.val : 0;

            int value = x + y + carry;
            carry = value / 10;
            current.next = new ListNode(value % 10);

            if (p != null) p = p.next;
            if (q != null) q = q.next;

            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return mark.next;
    }

    //无重复字符串的最长长度
    int strLength(String str) {
        if (str == null || "".equals(str)) return 0;
        Map<Character,Integer> map = new HashMap<>();
        int length = 0;
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                j = Math.max(map.get(str.charAt(i)),j);
            }
            length = Math.max(length,i - j + 1);
            map.put(str.charAt(i), i + 1);
        }
        return length;
    }



}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}