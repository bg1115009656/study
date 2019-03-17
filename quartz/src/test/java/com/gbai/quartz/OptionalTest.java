package com.gbai.quartz;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2019-02-15 11:18
 **/
public class OptionalTest {


    @Test
    public void test() throws Exception {
//        JobEntity jobEntity = JobEntity.builder().cron("1234567").build();
//        Optional<JobEntity> entity = Optional.ofNullable(jobEntity);
//        System.out.println(entity.map(JobEntity::getCron).orElse("NULL"));
//        String a = "123";
//        String b = "123";
//        System.out.println(a == b);
//
//        JobEntity[] array = new JobEntity[5];
//        System.out.println(twoSum()[0] + "--" + twoSum()[1]);

//        ListNode a = new ListNode(5);
//        ListNode b = new ListNode(5);
//        ListNode c = new ListNode(5);
//        ListNode d = new ListNode(5);
//        ListNode e = new ListNode(5);
//        ListNode f = new ListNode(5);
//        a.next = b;
//        b.next = c;
//        d.next = e;
//        e.next = f;
//        nodeSum(a,d);
//        System.out.println(distinctLength("kgfdsdjlkfdsaff"));
        int[] a = {12, 2, 41, 5, 7, 34, 5 ,3 ,9 ,10};
        System.out.println(Arrays.toString(a));
        quickSort(a);Error
        System.out.println(Arrays.toString(a));

    }

    public int[] twoSum() throws Exception {
        int[] array = {2, 7, 12, 14};
        Map<Integer, Integer> map = new HashMap<>();
        int target = 9;
        for (int i = 0; i < array.length; i++) {
            int another = target - array[i];

            if (map.containsKey(another)) {
                return new int[]{i, map.get(another)};
            }
            map.put(array[i], i);
        }
        throw new Exception("No");
    }

    ListNode nodeSum(ListNode n1, ListNode n2) {
        ListNode currentNode = new ListNode(0);
        ListNode p = n1, q = n2, originNode = currentNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            int sum = carry + x + y;
            carry = sum / 10;
            originNode.next = new ListNode(sum % 10);
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            originNode = originNode.next;
        }

        if (carry > 0) {
            originNode.next = new ListNode(carry);
        }
        return currentNode.next;
    }

    int distinctLength(String str) {
        if (str == null || "".equals(str)) return 0;
        int length = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                j = Math.max(map.get(str.charAt(i)), j);
            }
            length = Math.max(length, i - j + 1);
            map.put(str.charAt(i), i + 1);
        }
        return length;
    }


    int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    public static void quickSort(int[] a) {
        if (a.length > 0) {
            fastSort(a, 0, a.length - 1);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        //1,找到递归算法的出口
        if( low > high) {
            return;
    }
        //2, 存
        int i = low;
        int j = high;
        //3,key
        int key = a[ low ];
        //4，完成一趟排序
        while( i< j) {
            //4.1 ，从右往左找到第一个小于key的数
            while(i<j && a[j] > key){
                j--;
            }
            // 4.2 从左往右找到第一个大于key的数
            while( i<j && a[i] <= key) {
                i++;
            }
            //4.3 交换
            if(i<j) {
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }
        // 4.4，调整key的位置
        int p = a[i];
        a[i] = a[low];
        a[low] = p;
        //5, 对key左边的数快排
        quickSort(a, low, i-1 );
        //6, 对key右边的数快排
        quickSort(a, i+1, high);
    }

    static void fastSort(int[] array, int low, int high) {

        if( low > high) {
            return;
        }

        int key = array[low];

        int i = low;
        int j = high;
        int temp;
        while (i < j) {

            while (i < j && array[j] > key) {
                j--;
            }

            while (i < j && array[i] <= key) {
                i++;
            }

            if (i < j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
        fastSort(array,low,i-1);
        fastSort(array,i+1, high);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    void fastSort(int[] array, int low, int high) {
        int key = array[low];

        int i = low;
        int j = high;
        int temp;
        while (i < j) {

            while (i < j && array[j] > key) {
                j--;
            }

            while (i < j && array[i] <= key) {
                i++;
            }

            if (i < j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        temp = array[i];
        array[i] = array[low];
        array[low] = temp;
        fastSort(array,low,i-1);
        fastSort(array,i+1, high);
    }
}