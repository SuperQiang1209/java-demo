package com.zhenggq.datastructure.ch04;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/10 22:51
 * @Description:
 * @Version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.insertFirst(393);
        list.insertFirst(10910);
        list.insertFirst(912);
        list.insertFirst(23);
        list.insertFirst(191);
        list.insertFirst(1010);
        list.insertFirst(100);

        list.display();

        list.deleteFirst();
        System.out.println("===============================");
        list.display();
        System.out.println("===============================");

        Node node = list.find(912);
        if (node == null) {
            System.out.println("未查询到节点!");
        } else {
            node.display();
        }
        System.out.println("===============================");

        Node node2 = list.delete(1010);
        if (node2 == null) {
            System.out.println("未查询到节点!");
        } else {
            node2.display();
        }
        System.out.println("===============================");
        list.display();
    }
}
