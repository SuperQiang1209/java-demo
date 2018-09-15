package com.zhenggq.datastructure.ch04;

/**
 * 链表，相当叠杯子。
 *
 * @Author: Zhenggq
 * @Date: 2018/9/10 22:34
 * @Description:
 * @Version: 1.0
 */
public class LinkList {

    /**
     * 头结点
     */
    private Node first;

    /**
     * 插入一个结点，将当前第一个节点向后移动，新的节点到头结点(first)去.
     * 说明:将头结点向后挪动。 1.将新结点的next指向头结点，2.更新新结点为头节点
     */
    public void insertFirst(long val) {
        Node node = new Node(val);
        node.next = first;
        first = node;
    }

    /**
     * 删除一个结点，删除头部第一个节点.
     * 说明:将第二个节点设置为头结点，抛弃first节点。
     */
    public Node deleteFirst() {
        Node tmp = first;
        first = tmp.next;
        return tmp;
    }

    /**
     * 查找节点
     *
     * @return
     */
    public Node find(long val) {
        Node current = first;
        while (current != null) {
            if (current.data == val) {
                return current;
            }
            current = current.next;
        }
        return null;

    }

    /**
     * 删除一个结点
     *
     * @param val
     * @return
     */
    public Node delete(long val) {
        //当前节点
        Node current = first;
        //上一个节点
        Node previous = first;

        while (current != null) {
            if (current.data == val) {
                //当前节点的上一节点的next，指向当前节点的next节点。相当于从叠着的杯子中间拿出一个杯子。
                previous.next = current.next;
            break;
        }
            //保存上一个节点
            previous = current;
            current = current.next;
        }
        //链表中只有一个节点时.
        if (current == previous && current.data == val) {
            first = first.next;
        }
        return current;
    }

    /**
     * 显示方法
     */
    public void display() {
        Node current = first;
        //判断是否还有杯子
        while (current != null) {
            current.display();
            current = current.next;
        }
    }


}
